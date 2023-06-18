package practice.poly;

public  class DemoParent {
	public final String houseName = "abc";
	public void wealth() {
		System.out.println("cash land");
	}
	public  String toMarry() { //final
		System.out.println("A");
		return "A";
	}
	public DemoParent() {
		System.out.println("hello i'm cons");
	}
	public DemoParent(int i) {
		System.out.println("Param cons");
	}
}
