package a;

public class Sample1 {

	public static void method1()
	{
		System.out.println("This is method1 of class Sample1");
	}
	
	protected static void method2()
	{
		System.out.println("This is method2 of class Sample1");
	}
	 static void method3()
	{
		System.out.println("This is method3 of class Sample1");
	}
	private static void method4()
	{
		System.out.println("This is method4 of class Sample1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample1 obj1=new Sample1();
		obj1.method1();
		obj1.method2();
		obj1.method3();
		obj1.method4();
		
	}

}
