package practice;

public class Demo {

	public static void main(String[] args) {


		int mark1 = 50;
		int mark2 = 40;
		int mark3= 90;
		int a = 10;
		System.out.println(a); //10
		//		type []var-name = new type [size];
		int []mark = new int [7];
		//		index starts with 0, ends with 6
		mark[2]= 90;
		mark[1]= 40;
		mark[3]= 70;
		System.out.println(mark);
		System.out.println(mark[2]);
		System.out.println(mark[4]);
		String name = "javaworldHEre";
		int price = 10;
		switch(price) {
		case 5:
			System.out.println("a");	
			break;
		case 10:
			System.out.println("b");	
//			break;
		case 15:
			System.out.println("c");	
			break;
		default:
			// code block
		}



	}

}
