package coreJavaByRahulShetty;

public class RevesreString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "banti nayak";// by using literal reverse
		String a = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			a += s.charAt(i);

		}
		System.out.println(a); //without reverse()

		StringBuffer d = new StringBuffer("banti nayak");
		d.reverse();
		System.out.println(d);//with reverse()
	}
}
