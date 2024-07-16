package coreJavaByRahulShetty;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "javatraining";
		System.out.println(a.charAt(5));// r
		System.out.println(a.indexOf("r"));// 5
		System.out.println(a.substring(2, 5));// vat
		System.out.println(a.substring(5));// raining
		System.out.println(a.concat("bantilearning"));// javatrainingbantilearning
		System.out.println(a.trim());// javatraining
		System.out.println(a.toLowerCase());// javatraining
		System.out.println(a.toUpperCase());// javatraining(capital)
		System.out.println(a.toCharArray());// javatraining
		String[] arr = a.split("v");
		System.out.println(arr[0]);// ja
		System.out.println(arr[1]);

		System.out.println(a.replace("a", "b"));
	}

}
