package practice.collectionDemo.setDemo;

import java.util.LinkedHashSet;

public class LinkedHashSeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet foodSet = new LinkedHashSet(40,0.5f);
		foodSet.add("pizza");
		foodSet.add("burger");
		foodSet.add("pizza"); // not bcoz duplicate
		foodSet.add("waffles");
		foodSet.add(222);
		foodSet.add(false);
		foodSet.add(null);
		foodSet.add("pizza");// not bcoz duplicate
		System.out.println(foodSet);
//		foodSet.
	}

}
