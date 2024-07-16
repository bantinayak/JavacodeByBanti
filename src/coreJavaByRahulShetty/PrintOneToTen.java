package coreJavaByRahulShetty;

public class PrintOneToTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i = i + 2) {
			System.out.println(i);
		}

		int i = 0;// print 1to 10 by using while loop
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		int a = 10;// print 10 to 1 decrease
		while (a >= 0) {
			System.out.println(a);
			a--;

		}
		int b = 40;// using do while print 40 to 50
		do {
			System.out.println(b);
			b++;
		} while (b <= 50);

		int c = 60;
		do {
			System.out.println(c);
			c--;
		} while (c >= 50);

		for (int k = 1; k <= 4; k++)
			System.out.println("print");
		for (int j = 0; j <= 5; j++) {
			System.out.println("hrllo loop");
		}
	}
}
