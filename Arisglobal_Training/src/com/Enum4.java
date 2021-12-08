package com;



public class Enum4 {

	public enum Subjects{C, Cplus, Java, Python}
	public static void main(String[] args) {
		Subjects[] subj =Subjects.values();
		for(Subjects sub :subj) //for each
			switch(sub) {
			case C:
				System.out.println("C programming language");
				break;
			case Cplus:
				System.out.println("Cplus programming language");
				break;
			case Java:
				System.out.println("Java programming language");
				break;
			case Python:
				System.out.println("Python programming language");
				break;
			
			}
	}
}
