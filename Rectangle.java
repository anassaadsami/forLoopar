package Forloopar;

public class Rectangle {

	public static void main(String[] args) {
		display(5);
		display1(5);
		display2(5);
		display3(5);

	}

	// print hollow rectangle
	public static void display(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == 5 || j == 1 || j == 5 || i == n / 2 + 1 || j == n / 2 + 1)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.println();

		}
	}

	// just the diagnose  ( left   i==j   and  right i+j==6 )
	public static void display1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j || i+j==6)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.println();

		}
	}

	// hollow triangle
	public static void display2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j || i == 5 || j == 1)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.println();

		}
	}
   // the middle of i and j (n == odd number so it can be divided by 2 )
	public static void display3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == n / 2 + 1 || j == n / 2 + 1)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.println();

		}
	}

}
