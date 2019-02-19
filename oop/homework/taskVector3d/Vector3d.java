package com.gmail.a.a.kravchenko;

public class Vector3d {
	private double x;
	private double y;
	private double z;

	public Vector3d() {
		super();
	}

	public Vector3d(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Vector3d [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

	public Vector3d sumVectors(Vector3d second) {
		double resultsX = this.x + second.x;
		double resultsY = this.y + second.y;
		double resultsZ = this.z + second.z;
		Vector3d resultsVector = new Vector3d(resultsX, resultsY, resultsZ);
		return resultsVector;
	}
	
	public double scalarMultiplication(Vector3d second) {
		double results;
		results = this.x * second.x + this.y * second.y + this.z * second.z;
		return results;
	}

	public Vector3d vectorMultiplication(Vector3d second) {
		double resultsX = this.y * second.z - this.z * second.y;
		double resultsY = this.z * second.x - this.x * second.z;
		double resultsZ = this.x * second.y - this.y * second.x;
		Vector3d resultsVector = new Vector3d(resultsX, resultsY, resultsZ);
		return resultsVector;
	}

}
