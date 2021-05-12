package com.revature.beans;

public class Racer {
	private String name;
	private String team;
	private int age;
	private int points;
	
	public Racer() {
		super();
	}
	
	public Racer(String name, String team, int age, int points) {
		this.name = name;
		this.team = team;
		this.age = age;
		this.points = points;
	}

	// Get/Set name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//g Get/Set team
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}

	// Get/Set age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	// Get/Set points
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return name + " is "+ age + " years old, and driving for " + team + " has accumulated " + points + " points in the WDC.";
	}

}
