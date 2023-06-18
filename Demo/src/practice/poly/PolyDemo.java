package practice.poly;

public class PolyDemo {

	public static void main(String[] args) {
		PolyDemo d = new PolyDemo();
		short b = 20;
		d.m1(b,4L);
	}
	
	public void m1(int i) {
		System.out.println("int");
	}
	public void m1(long l) {
		System.out.println("long");
	}
	public void m1(int i, long l) {
		System.out.println("helloww");
	}
	public void m1(long i, int l) {
		System.out.println("team");
	}

}
