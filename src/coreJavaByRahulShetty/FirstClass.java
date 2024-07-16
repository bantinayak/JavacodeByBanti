package coreJavaByRahulShetty;

public class FirstClass {
	int a=5;
	public void getData() {
		// static int no = 4;
		// return "banti" ;
		System.out.println("i m in method");
	}

	public static void main(String[] args) {

		FirstClass d = new FirstClass();
		System.out.println(d.a);
		d.getData();
		System.out.println("hello world");
		System.out.println("hello");
		
		SecondClass e=new SecondClass();
		e.setdata();
	}

}
