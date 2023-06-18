package practice;

public class Demo2 {
	int price = 10;
	
	public static void main(String[] args) {
		int mark1 = 50;
		int c = m2();
		System.out.println(c+2);
		Demo2 d = new Demo2();
		d.m3();
	}
	public void m3() {
		
	}

	public static int m2() {
		int c= 2+3;
		City ci = new City("ref");
		
		return c;
	}

}
