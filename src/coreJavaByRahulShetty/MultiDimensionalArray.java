package coreJavaByRahulShetty;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a[row][column]
		int a[][] = new int[2][3];
		a[0][0] = 2;
		a[0][1] = 3;
		a[0][2] = 4;
		a[1][0] = 6;
		a[1][1] = 7;
		a[1][2] = 8;
		// System.out.println(a[1][0]);

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(a[i][j] + "\t");
			System.out.println();
		}

	}
}
