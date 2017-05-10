package multiThreading;

import java.util.Scanner;

class Participant implements Runnable {
	String name = "";

	private void startRace() {
		long startTime = System.nanoTime();
		for (int i = 0; i < 100; i++) {

		}
		System.out.println(name + " took " + (System.nanoTime() - startTime) + " nano seconds");
	}

	Participant(String name) {
		this.name = name;
	}

	public void run() {
		startRace();
	}
}

public class RunningRace {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of participants");
		int count = scan.nextInt();
		
		for (int i = 0; i < count; i++) {
			String name = "Deril";
			Participant temp = new Participant(name + " " + i);
			Thread race = new Thread(temp, temp.name);
			race.start();
		}

	}

}
