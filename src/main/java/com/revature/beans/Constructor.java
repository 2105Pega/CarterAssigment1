package com.revature.beans;

public class Constructor {
	private String name;
	private String supplier;
	private int points;
	
	public Constructor() {
		super();
	}
	
	public Constructor(String name, String supplier, int points) {
		this.name = name;
		this.supplier = supplier;
		this.points = points;
	}

	// Get/Set team name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// Get/Set engine supplier
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	// Get/Set WCC points
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "The " + name + " team is supplied by " + supplier + " and currently has " + points + " WCC points.";
	}
	
	
}
