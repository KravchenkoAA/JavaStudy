package com.gmail.a.a.kravchenko;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Point> myList = new ArrayList<>();
		Point[] myPoints = new Point[10];
		for (int i = 0; i < myPoints.length; i++) {
			myPoints[i] = new Point(i * 2, i + 2);
		}
		Tools tool = new Tools();
		tool.toAdd(myList, myPoints);
		System.out.println("Before");
		for (Point element : myList) {
			System.out.println(element);
		}
		tool.toDeleteFromHead(myList, 2);
		tool.toDeleteFromEnd(myList, 1);
		System.out.println('\r' + "After");
		for (Point element : myList) {
			System.out.println(element);
		}
	}
}
