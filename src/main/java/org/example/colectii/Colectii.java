package org.example.colectii;

import java.util.*;

public class Colectii {
	public static void exempluArrayList() {
		String[] namesArray = new String[10];
		int[] intsArray = new int[10];

		//Arraylist => foloseste un array pentru a salva valorile
		List<String> names = new ArrayList<>();
		List<Integer> intsList = new ArrayList<>();

//		clase wrapper => reprezentarea sub forma de clasa a tipurilor de date primitive
//		int => Integer

		names.add("Mihai");
		names.add("Bogdan");
		names.add("Daniel");

		System.out.println("Printam lista de nume (arraylist): ");
		for (String name : names) {
			System.out.println(name);
		}

		names.addAll(exempluLinkedList());

		System.out.println("Toate numele gramada: ");
		for (String name : names) {
			System.out.println(name);
		}

		Iterator<String> iterator = names.iterator();

//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
	}

	public static List<String> exempluLinkedList() {
		//LinkedList => foloseste un doubly linked list pentru a salva valorile
		List<String> otherNames = new LinkedList<>();

		otherNames.add("Razvan");
		otherNames.add("Andrei");
		otherNames.add("Vlad");

		System.out.println("Printam lista de nume (linkedlist): ");
		for (String name : otherNames) {
			System.out.println(name);
		}

		return otherNames;
	}

	public static void exempluStack(String original) {
		//sa folosim un stack pentru a scrie invers un String

		Stack<Character> stack = new Stack<>();

		/*
		 *          ...
		 *           o
		 *           l
		 *           l
		 *           e
		 *           H
		 * */
		for (char character : original.toCharArray()) {
			stack.push(character);
		}

		StringBuilder stringBuilder = new StringBuilder();

		while (!stack.empty()) {
			System.out.println("Se adauga characterul:" + stack.peek());
			Character characterulDinVarf = stack.pop();
			stringBuilder.append(characterulDinVarf);
		}

		String reversed = stringBuilder.toString();

		System.out.println("Sirul de caractere " + original + " scris invers: " + reversed);
	}

	public static void exempluQueue() {
		class Document {
			private final String name;

			public Document(String name) {
				this.name = name;
			}

			public String getName() {
				return name;
			}
		}

		Queue<Document> printQueue = new LinkedList<>();

		printQueue.add(new Document("Copyright"));
		printQueue.offer(new Document("Privacy Policy"));
		printQueue.add(new Document("Employee Contract"));

		while (!printQueue.isEmpty()) {
			System.out.println("Documentul din capul queue-ului: " + printQueue.peek().getName());
			Document doc = printQueue.remove();
			System.out.println("Printam: " + doc.getName());
		}
	}

	public static void exempluDeque() {
		Deque<Integer> deque = new ArrayDeque<>();

		deque.addFirst(10);
		deque.addLast(20);
		deque.addFirst(30);
		deque.addLast(40);
		deque.addFirst(50);

		System.out.println("Elementul de la inceputul deque-ului: " + deque.peekFirst());
		System.out.println("Elementul de la sfarsitul deque-ului: " + deque.peekLast());

		System.out.println("Deque-ul contine 10? " + deque.contains(10));

		while (!deque.isEmpty()) {
			System.out.println("Dimensiunea deque-ului: " + deque.size());
			deque.removeFirst();
			deque.pollLast();
		}
	}

	public static void exempluSet() {
		Set<String> usernames = new LinkedHashSet<>();

		usernames.add("Mihai");
		usernames.add("Daniel");
		usernames.add("Alex");
		usernames.add("Alex");
		usernames.add("Cosmin");

		System.out.println("Dimensiune set: " + usernames.size());

		for (String name : usernames) {
			System.out.println(name);
		}

		System.out.println("Contine 'Daniel': " + usernames.contains("Daniel"));

		usernames.remove("Alex");

		System.out.println("Dimensiune set: " + usernames.size());

		usernames.clear();

		System.out.println("Setul e gol?: " + usernames.isEmpty());
	}

	public static void exempluMap() {
		Map<String, String> countries = new LinkedHashMap<>();

		countries.put("us", "United States");
		countries.put("br", "Brazil");
		countries.put("es", "Spain");
		countries.put("ro", "Romania");
		countries.put("ro", "Bulgaria");
		countries.put("bg", "Bulgaria");

		System.out.println("Dimensiunea hartii: " + countries.size());

		System.out.println("Tari: " + countries);
		System.out.println("Tara cu cheia 'es': " + countries.get("es"));

		System.out.println("Tarile din map: ");
		for (String tara : countries.values()) {
			System.out.println(tara);
		}

		System.out.println("Cheile din map: ");
		for (String cheie : countries.keySet()) {
			System.out.println(cheie);
		}

		countries.replace("br", "Russia");

		countries.remove("es");

		System.out.println("Tari: " + countries);

		countries.clear();

		System.out.println("Harta este goala? " + countries.isEmpty());
	}
}
