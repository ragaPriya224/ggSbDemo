package practice.collectionDemo.setDemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet foodSet = new HashSet(40,0.5f);
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
