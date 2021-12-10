package Forloopar;

public class IncreasingAndDecreasing {

	public static void main(String[] args) {
		display(5);
		System.out.println();
		display1(5);
		System.out.println();
		display2(5);
		System.out.println();
		display3(5);
		System.out.println();
		display4(5);
		System.out.println();
		display5(5);

	}

	// increasing triangle
	public static void display(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print("*  ");
			}
			System.out.println("\n");

		}
	}

	// decreasing triangle
	public static void display1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("*  ");
			}
			System.out.println("\n");

		}
	}

	public static void display2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int k = i; k <= n; k++) {
				System.out.print("0 ");
			}
			// here we change from l<=n to l<n to make zero triangle with just one zero head
			for (int l = i; l < n; l++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
	}
	// the same method above but we change 2 for loop to just one with relation between k and i
	public static void display3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {   // j<i (not j<=i )-----> it dosn't print first star
				System.out.print("* ");
			}
			for (int k = 9;  k>= i+(i-1); k--) {  // awesome code
				System.out.print("0 ");
			}

			System.out.println();
		}
	}
	
	public static void display4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <n; j++) {  // j<n not j<=n
				System.out.print("0 ");
			}
				for (int k = 1; k <= i; k++) {
					System.out.print("* ");	
				}
				for (int l = 1; l <i; l++) {  // the same here
					System.out.print("1 ");
				}
				System.out.println("\n");
			}
			
		}
	
	public static void display5(int n) {
		for (int i = 1; i <= n; i++) {
			int p=3 ;
			for (int j = i; j <n; j++) {  // j<n not j<=n
				System.out.print("0");
			}
				for (int k = 1; k <= i; k++, p*=3) {
					System.out.print(p);	
				}
				for (int l = 1; l <i; l++ ) {  // the same here
					System.out.print(p);       // here wrog
				}
				System.out.println();
			}
			
		}
	}



