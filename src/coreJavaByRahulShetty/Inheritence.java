package coreJavaByRahulShetty;

public class Inheritence {

	int salary = 1000;
}

class B extends Inheritence {

	int bonus = 2000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Inheritence d=new Inheritence();
		B s = new B();
		//System.out.println(s.salary);
		System.out.println(s.salary);
		System.out.println(s.bonus);
	}

}
