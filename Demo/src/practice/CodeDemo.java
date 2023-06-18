package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CodeDemo {

	public static void main(String[] args) {
		//		System.out.println(LocalDate.now().minusMonths(1).getMonthValue());
		LocalDate.now().getYear();
		List<String> data = new ArrayList<>();
		CodeDemo cd = new CodeDemo();
		cd.m2();
	}
	
	public Integer m1() {
		return 5;
	}
	
//	public    m4() {
//		return 5, 7 ,8 ; //collection of numbers 
//	}

	public List<String> m2() {
		List<String> cityList = new ArrayList<>();
		List<String> snackList = new ArrayList<>();

		cityList.add("Chennai");
		cityList.add("mumbai");

		snackList.add("dosa");
		snackList.add("vadapav");


		//		cityList.get(2);
		cityList.addAll(snackList);
//		System.out.println(cityList);

		HashMap<String,String> dataMap = new HashMap<>(); //key value pair
		dataMap.put("chennai", "dosa");// marina beach
		dataMap.put("mumbai", "vadapav"); //marine drive 
		dataMap.put("chennai", "marina beach");// marina beach

		System.out.println(dataMap);
		
		City city = new City();
		city.setName("chennai");
		city.setFoodName("dosa");
		city.setFamousPlaceName("marina beach");
		System.out.println(city);
		City city2 = new City();
		city2.setName("mumbai");
		city2.setFoodName("vada pav");
		city2.setFamousPlaceName("marine drive");
		System.out.println(city2);
		List<City> districtList = new ArrayList<>();
		districtList.add(city);
		districtList.add(city2);

		return districtList;
//		return cityList; 

	}
}
