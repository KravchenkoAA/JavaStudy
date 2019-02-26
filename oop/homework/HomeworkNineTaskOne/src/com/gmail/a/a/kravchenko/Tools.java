package com.gmail.a.a.kravchenko;

import java.util.List;

public class Tools {

	public Tools() {
		super();
	}

	public <T> void toAdd(List<T> list, T[] array) {
		for (int i = 0; i < array.length; i++) {
			list.add(i, array[i]);
		}
	}

	public <T> void toDeleteFromHead(List<T> list, int number) {
		for (int i = 0; i < number; i++) {
			list.remove(0);
		}
	}

	public <T> void toDeleteFromEnd(List<T> list, int number) {
		int counter = list.size();
		for (int i = counter - 1; i > counter - number - 1; i--) {
			list.remove(i);
		}
	}
}
