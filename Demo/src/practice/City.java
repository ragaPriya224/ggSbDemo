package practice;

public class City {
	
	private String name;
	private String foodName;
	private String famousPlaceName;
	public City(String name) { //parameterised constructor
		System.out.println("i'm constructor");
	}
	public City() { //no arg constructor
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFamousPlaceName() {
		return famousPlaceName;
	}
	public void setFamousPlaceName(String famousPlaceName) {
		this.famousPlaceName = famousPlaceName;
	}
	@Override
	public String toString() {
		return "City [name=" + name + ", foodName=" + foodName + ", famousPlaceName=" + famousPlaceName + "]";
	}

}
