package coreJavaByRahulShetty;

public class MethodOverloading {
	public int sum(int a) {
		// System.out.println(a);
		return a;

	}

	public void sum(String b) {
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading d = new MethodOverloading();
		System.out.println(d.sum(10));
		d.sum("banti");
	}

}
