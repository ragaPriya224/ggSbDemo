package practice.collectionDemo.MapDemo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap dataMap = new HashMap<>();
		dataMap.put("pizza",100);
		dataMap.put("burger",160);
		dataMap.put("sandwich",600);
		dataMap.put("WAFFLES",60);
		dataMap.putIfAbsent("sandwich",20);
		dataMap.putIfAbsent("juice",20);
		System.out.println(dataMap.containsKey("burger"));
		System.out.println(dataMap.containsValue(5000));
		System.out.println(dataMap.get("burger"));
		System.out.println(dataMap.entrySet());
		System.out.println(dataMap);
	}

}
