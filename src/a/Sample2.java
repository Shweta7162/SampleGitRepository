package a;

public class Sample2 extends Sample1 {
	public static void method1() {
		System.out.println("This is method1 of Sample2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample1 obj2= new Sample1();
		Sample1 obj3= new Sample2();
		Sample2 obj4 = new Sample2();	
		
		obj2.method1();
		obj3.method1();
		obj4.method1();
	}

}
