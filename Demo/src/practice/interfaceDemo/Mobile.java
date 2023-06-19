package practice.interfaceDemo;

public interface Mobile {
	
	void m1();
	String m2();
	
	default void m3() {
		
	}
	
	static void m4() {
		
	}

}
//no need to explicitly use word - abstract , public 