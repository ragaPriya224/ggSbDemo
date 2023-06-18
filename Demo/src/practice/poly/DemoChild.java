package practice.poly;

public class DemoChild extends DemoParent{
	public String houseName = "xyz";
	public DemoChild() {
		super(10);//constructor
		System.out.println("team");
	}
	public static  void main(String[] args) {
		DemoChild c = new DemoChild();
		c.wealth();
		c.toMarry();
		System.out.println(c.houseName);
		c.m1();
	}
	public void m1() {
		System.out.println(super.houseName);

	}
	@Override
	public String toMarry() { //new method
		System.out.println("B");
		return "B";
	}
	@Override
	public void wealth() {
		super.wealth();
		//		System.out.println("cash land");
		System.out.println("stock gold MF");
	}
}
