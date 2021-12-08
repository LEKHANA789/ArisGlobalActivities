package com;

public class ForEachLoop {

	public static void main(String[] args) {
		String[] names= {"Java","C","C++","Python","Javascript"};
		System.out.println(names[4]);
		System.out.println("printing the content of the array names:\n");
		for(String name:names) {
			System.out.println(name);
		}
	}
}
