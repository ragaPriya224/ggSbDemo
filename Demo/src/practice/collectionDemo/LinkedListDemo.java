package practice.collectionDemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList foodList = new LinkedList<>();
		foodList.add("pizza");
		foodList.add("burger");
		foodList.add("pizza"); //duplicate
		foodList.add("waffles");
		foodList.add(222);
		foodList.add(false);
		foodList.add(null);
		foodList.add("pizza");
		System.out.println(foodList); //order is maintained
		//size, isempty...removing
		foodList.addFirst("tea");
		foodList.addLast("coffee");
		foodList.removeFirst();
		foodList.removeLast();
		foodList.getFirst();//pizza
		foodList.getLast();//pizza
		System.out.println(foodList);
	}}
