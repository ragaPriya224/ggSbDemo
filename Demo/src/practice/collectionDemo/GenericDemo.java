package practice.collectionDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class GenericDemo {

	public static void main(String[] args) {
		int[] data = new int[5];
		data[1]= 66;
		data[3]= 55;
		data[2]= 44;
//		data[4] = "hello"; //compilation
		TreeSet<Integer> foodSet = new TreeSet<Integer>();
		foodSet.add(101);
//		foodSet.add("burger"); //runtime 
		ArrayList<String> foodList = new ArrayList<String>();
		foodList.add("pizza");
		foodList.add("burger");
//		foodList.add(101);
		
		HashMap<String,Integer> dataMap = new HashMap<String,Integer>();
		dataMap.put("pizza",100);
		dataMap.put("burger",160);
//		dataMap.put(101, "icecream");
	}

}
