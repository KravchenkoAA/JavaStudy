package com.gmail.a.a.kravchenko;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		DrinkDispenser drinkDispenser = new DrinkDispenser(100);
		Person personOne = new Person("Sheldon");
		Person personTwo = new Person("Leonard");
		Person personThree = new Person("Volovitc");
		Person personFour = new Person("Kutrapalli");
		Person personFive = new Person("Penny");

		Queue<Person> myQueue = new ArrayDeque<>();
		myQueue.add(personOne);
		myQueue.add(personTwo);
		myQueue.add(personThree);
		myQueue.add(personFour);
		myQueue.add(personFive);
		System.out.println("Before");
		printQueue(myQueue);
		System.out.println();
		System.out.println("After");
		Queue<Person> newQueue = queueStatus(myQueue, drinkDispenser, 3);
		printQueue(newQueue);

	}

	public static <E> void printQueue(Queue<E> queue) {
		for (Object object : queue) {
			System.out.print(object + ", ");
		}
	}

	public static void toDrink(Queue<Person> queue, DrinkDispenser drinkDispenser, int number) {
		for (int i = 0; i < number; i++) {
			if (drinkDispenser.giveDrink() == true) {
				Person temp = queue.poll();
				queue.offer(temp);
				queue.offer(temp);
			}
		}
	}

	public static Queue<Person> queueStatus(Queue<Person> queue, DrinkDispenser drinkDispenser, int number) {
		toDrink(queue, drinkDispenser, number);
		return queue;
	}
}
