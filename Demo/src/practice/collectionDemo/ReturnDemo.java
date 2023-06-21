package practice.collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ReturnDemo {

	public static void main(String[] args) {
		
		ReturnDemo d = new ReturnDemo();
		d.m5();
	}
	public  List<String>  m1() {
		ArrayList<String> foodList = new ArrayList<String>();
		foodList.add("pizza");
		foodList.add("burger");
		foodList.add("pizza"); //duplicat
		return foodList;
	}
	
	public  List<String>  m2() {
		ArrayList<String> dataList = new ArrayList<String>();
		dataList.add("GG");
		dataList.add("delhi");
		dataList.add("abc"); 
		dataList.add("AB");
		dataList.add("kolkata");
		dataList.add("def");
		return dataList;
	}
	public Person m3() {
		Person m = new Person();
		m.setName("GG");
		m.setAddress("delhi");
		m.setEducation("abc");
		return m;
	}
	public List<Person> m4() {
		Person gg = new Person();
		gg.setName("GG");
		gg.setAddress("delhi");
		gg.setEducation("abc");
		Person ab = new Person();
		ab.setName("AB");
		ab.setAddress("pune");
		ab.setEducation("def");
		List<Person> dataList = new ArrayList<>();
		dataList.add(gg);
		dataList.add(ab);
		return dataList;
	}
	public void m5() {
		 List<Person> outputList = m4();
		 outputList.size();
		 
	}

}
