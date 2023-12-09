package org.example.threaduri;

public class Main {
	public static void main(String[] args) {
		System.out.println("Salutari de pe thread-ul principal!");

//		try {
//			System.out.println("Thread-ul doarme...");
////			face thread-ul curent sa adoarma
//			Thread.sleep(5000);
//		} catch (InterruptedException ex) {
//			System.out.println(ex.getMessage());
//		}

//		returneaza numarul de thread-uri activ
		System.out.println("Numarul curent de thread-uri: " + Thread.activeCount());

//		verificam prioritatea thread-ului curent
		System.out.println("Prioritatea thread-ului principal: " + Thread.currentThread().getPriority());

//		setam o prioritate noua
		Thread.currentThread().setPriority(2);

//		verificam daca thread-ul traieste
		System.out.println("Thread-ul principal traieste? " + Thread.currentThread().isAlive());
		System.out.println("Prioritate noua: " + Thread.currentThread().getPriority());

//		Am creat un thread nou
		Thread primulThread = new ThreadulMeu();

		primulThread.setDaemon(true);
		System.out.println(primulThread.isDaemon());

		Thread alDoileaThread = new Thread() {
			@Override
			public void run() {

				try {
					primulThread.join();
				} catch (InterruptedException ex) {
					System.out.println(ex.getMessage());
				}

				for (int i = 10; i >= 1; i--) {
					System.out.println("I in cel de-al doilea thread este: " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						System.out.println(ex.getMessage());
					}
				}
				System.out.println("Thread-ul 2 a terminat executia (a murit)");
			}
		};

		primulThread.start();
		alDoileaThread.start();

//		Thread-urile pot sa fie de 2 feluri: thread-uri user, si thread-uri deamon

		System.out.println("Nr de thread-uri: " + Thread.activeCount());
	}
}
