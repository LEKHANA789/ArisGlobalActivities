package com;

public class Enum2 {

	public enum Directions{East, west,North,south}
	public static void main(String[] args) {
		Directions[] Direct =Directions.values();
		for(Directions Dir :Direct) //for each
			switch(Dir) {
			case East:
				System.out.println("east direction");
				break;
			case west:
				System.out.println("west direction");
				break;
			case North:
				System.out.println("North direction");
				break;
			case south:
				System.out.println("south direction");
				break;
			
			}
}
}
