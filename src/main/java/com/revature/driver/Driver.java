package com.revature.driver;

import com.revature.beans.Constructor;
import com.revature.beans.Racer;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Lights out and AWAY WE GO!");
		
		Constructor OP = new Constructor("Works Mercedes", "Mercedes", 141);
		Constructor horner = new Constructor();
		horner.setName("Red Bull Racing");
		horner.setSupplier("Honda");
		horner.setPoints(112);
		
		Racer GOAT = new Racer("Lewis Hamilton", "Works Mercedes", 36, 94);
		Racer rookie = new Racer();
		rookie.setName("Mick Schumacher");
		rookie.setAge(22);
		rookie.setTeam("Haas");
		rookie.setPoints(0);
		
		System.out.println(GOAT.toString());
		System.out.println(OP.toString());
		
		Racer trainer = new Racer("Matt Knighten", "McLaren", 30, 200);
		System.out.println(trainer.toString() + " He is the real GOAT, not Lewis or MSC.");

	}

}
