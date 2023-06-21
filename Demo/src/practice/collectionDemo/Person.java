package practice.collectionDemo;

public class Person {

	
	private String name;
	private String address;
	private String education;
	
	public Person() {
		
	}
	public Person(String name, String address, String education) {
		super();
		this.name = name;
		this.address = address;
		this.education = education;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
}
