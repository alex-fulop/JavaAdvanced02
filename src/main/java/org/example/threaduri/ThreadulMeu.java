package org.example.threaduri;

public class ThreadulMeu extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.print("I  in primul thread este: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
			System.out.println();
		}
		System.out.println("Thread-ul 1 a terminat executia (a murit)");
	}
}
