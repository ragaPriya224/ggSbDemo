package practice.collectionDemo.setDemo;

import java.util.TreeSet;

public class TreeSetDemo {
// hetero data not allowed
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet foodSet = new TreeSet<>();
		foodSet.add("pizza");
		foodSet.add("burger");
//		foodSet.add(null);
		foodSet.add("ICECREAM");
		foodSet.add("pizza");// not bcoz duplicate
		foodSet.add("waffles");
		foodSet.add("pizza");// not bcoz duplicate
		System.out.println(foodSet); //[ICECREAM, burger, pizza, waffles]

		TreeSet dataSet =new TreeSet();
		dataSet.add(100);
		dataSet.add(101);
		dataSet.add(104);
		dataSet.add(107);
		dataSet.add(110);
		dataSet.add(115);
		dataSet.add(100);
		dataSet.add(103);
		dataSet.add(100);
		System.out.println(dataSet);//100,101,103,104,107,110,115
		System.out.println(dataSet.first()); //100
		System.out.println(dataSet.last()); //15
		System.out.println(dataSet.headSet(104)); //LT 104
		System.out.println(dataSet.tailSet(104)); //GT OR EQU
		System.out.println(dataSet.subSet(100, 110));
		System.out.println(dataSet.size()); //7
	}

}
