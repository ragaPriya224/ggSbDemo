package practice.collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList foodList = new ArrayList<>();
		foodList.add("pizza");
		foodList.add("burger");
		foodList.add("pizza"); //duplicate
		foodList.add("waffles");
		foodList.add(222);
		foodList.add(false);
		foodList.add(null);
		foodList.add("pizza");
		System.out.println(foodList); //order is maintained

		//		foodList.clear();
		System.out.println(foodList.contains("waffles"));

		System.out.println(foodList.get(2));
		System.out.println(foodList); //order is maintained
		System.out.println(foodList.indexOf("pizza"));
		System.out.println(foodList.lastIndexOf("pizza"));
		//isempty, sublits
		System.out.println(		foodList.size());	
		foodList.add(1,"icecream");
		System.out.println(foodList);
		foodList.remove(3);
		System.out.println(foodList);
		foodList.set(2, "veg burger");
		System.out.println(foodList);
	}

}
