package coreJavaByRahulShetty;

import java.nio.ShortBuffer;

public class ImmutiableCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "banti"; // STRING LITERAL
		String b = "banti";
		String c = new String("banti");
		String c1 = new String("banti");
		// c=a.concat("nayak");
		System.out.println(c);
		System.out.println(a.equals(b));// true
		System.out.println(a == b);// true
		System.out.println(a.equals(c));// false
		System.out.println(a == c);// false
		System.out.println(c.equals(c1));// TRUE
		System.out.println(c.equalsIgnoreCase(c1));// true beacause when we use this methods it just compare
		System.out.println(c == c1);// false beacause reference object are different

		StringBuffer d = new StringBuffer("hi");
		d.append("banti");
		System.out.println(d);// hibanti
		d.append("h");
		System.out.println(d);// hibantih
		d.insert(2, "banti");//
		System.out.println(d);// hibhellotibantih
		d.replace(3, 5, "hello");
		System.out.println(d);// hibhellotibantih
		d.delete(6, 8);
		System.out.println(d);// hibheltibantih
		d.deleteCharAt(13);
		System.out.println(d);// hibheltibanti;
		d.reverse();
		System.out.println(d);

	}

}
