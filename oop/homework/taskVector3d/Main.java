package com.gmail.a.a.kravchenko;

public class Main {

	public static void main(String[] args) {
		Vector3d a = new Vector3d(1,2,3);
		Vector3d b = new Vector3d(2,4,6);
		Vector3d sumResults = a.sumVectors(b);
		double scalarResults = a.scalarMultiplication(b);
		Vector3d vectorResults = a.vectorMultiplication(b);
		System.out.println(sumResults.toString());
		System.out.println(scalarResults);
		System.out.println(vectorResults.toString());
	}

}
