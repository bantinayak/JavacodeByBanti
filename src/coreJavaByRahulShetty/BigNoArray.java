package coreJavaByRahulShetty;

public class BigNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int max = a[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] > max) {

					max = a[i][j];

				}
			}

		}
		System.out.println(max);
	}

}
