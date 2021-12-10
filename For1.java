package Forloopar;



public class For1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print("0");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);

			}
			System.out.println();

		}
		
		System.out.println("-------------");
		
		for (int i = 1; i <= 8; i++) {
			for (int j = 8; j >= i; j--) {
				System.out.print("0");
			}
			for (int k=1 , p=1;k <=i+(i-1) ;k++,p*=3) {   // by external variable 
				System.out.print(p);      //  the k value print  1   3   9
				
				
			}
			System.out.println();
			
		}
		System.out.println("----------------");
		int k;
		for (int i = 1; i <=6; i++) {
			for (int j = 5; j >=i  ; j--) {
				System.out.print("0");
			}
				for ( k = 1; k <= i ; k++) {
					System.out.print("*");
				}
				for (int l= 0; l< k-1; l++) {
						System.out.print("1");
					}
					
				System.out.println();
				}
		
		System.out.println("-----------");
	
		for ( int i = 1; i <=8; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("1");
			}
			for(int g= i ; g<= 8; g++) {
				System.out.print("*");
			}
			for(int l = i ; l<= 8 ;l++){
				System.out.print("0");
			}
			
			System.out.println();
		}
		System.out.println("-----------");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("0");
			}
			for (int f =3 ; f >= i ; f--) {
				System.out.print("1");
			}
			for (int h = 3; h >= i ; h--) {
				System.out.print("2");
			}
			System.out.println();
		}
		System.out.println("---------------");
		
		// depends on odd and even lines
		for (int i = 1; i<= 5; i++) {
			for (int j = 1; j<=i; j++) {
				if(i%2==0)
					System.out.print("2");
				else
					System.out.print("1");
				
			}
			System.out.println();
			
		}
		System.out.println("-----------------");
		
		for (int i = 1; i <=5; i++) {
			for (int j = i; j <=4; j++) {
				System.out.print(" ");
			}
				for (int k1 = 1; k1 <=(2*i-1); k1++) {
					if(i%2==1)
						System.out.print("1");
					else
					System.out.print("2");
				}
			System.out.println();
			}
		
		for (int i = 1; i <=4; i++) {
			for (int j =1 ; j <=i; j++) {
				System.out.print(" ");
			}
			for (int k1 = 1; k1 <= (-2*i+9); k1++) {
				if(i%2==1)
					System.out.print("2");
				else
					System.out.print("1");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		for (int i = 1 ,p= 1; i <=5; i++, p++) {    // external variable
			for (int j = i; j <=4; j++) {
				System.out.print(" ");
			}
				for (int k1 = 1; k1 <=(2*i-1); k1++) {
						System.out.print(p);      // print it
				}
			System.out.println();
			}
		
		for (int i = 1, p=4; i <=4; i++,p--) {   // Awesome
			for (int j =1 ; j <=i; j++) {
				System.out.print(" ");
			}
			for (int k1 = 1; k1 <= (-2*i+9); k1++) {
					System.out.print(p);
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		for (int i = 1	; i <= 6; i++) {
			for (int j = 1, p=1; j <=i; j++,p++) {    // p external variable 
				System.out.print(p+" ");
			}
			System.out.println();
		}
		System.out.println("------------------");	
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= i; j++) {  // the first char in the corner of 
				System.out.print("0 ");   // screen is 0 ------> j value
			}
			for (int k1 = i; k1 <=  5; k1++) {
				System.out.print(k1+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
			
		
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <= i-1; j++) {  // the first char in the corner of 
			System.out.print(" ");   // screen is one 
		}
		for (int k1 = i; k1 <=  5; k1++) {
			System.out.print(k1);
		}
		System.out.println();
	}
	System.out.println("-----------------");
	
	for (int i = 1 ; i <=5; i++) {    
		for (int j = i; j <=4; j++) {
			System.out.print(" ");
		}
			for (int k1 = 1,p=1; k1 <=(2*i-1); k1++,p++) {// external variable
					System.out.print(p);      // print it
			}
		System.out.println();
		}
	
	for (int i = 1; i <=4; i++) {   // Awesome
		for (int j =1 ; j <=i; j++) {
			System.out.print(" ");
		}
		for (int k1 = 1, p=1; k1 <= (-2*i+9); k1++,p++) {
				System.out.print(p);
		}
		System.out.println();
		
		}
	System.out.println("-----------------");
	for (int i = 1; i <= 5; i++) {
		for (int j = 1 , p = 5; j <= i ; j++ , p--) {
			System.out.print (p+" ");
		}
		System.out.println();
		
	}
	System.out.println("------------------");
	// its good 
	for (int i = 1 ,count= 5; i <=5; i++, count--) {
		for (int j = 1; j <= i-1; j++) {  // the first char in the corner of 
			System.out.print(" ");   // screen is one ------> k value
		}
		for (int k1 = i, p = count; k1 <=  5; k1++ , p--) {
			System.out.print(p);
		}
		System.out.println();
	}
	System.out.println("------------------");
	// IMPORTANT
	
	for (int i = 1,count = 1; i <= 5; i++,count*=3) {
		for (int j = i; j <= 5; j++) {
			System.out.print("     ");	
		}
		for(int k1 = 1,h = 1; k1 <= i ; k1++ ,h*=3) {
			System.out.print(h+"    ");
		}
		
		for(int l = 1, p1 = count ; l < i ; l++, p1/=3 ) {
		System.out.print(p1/3+"    ");
		
	}
		System.out.println();
	
	
		}
	System.out.println("---------------");
	// the same ex above but in another solution 
	
	for (int i = 1; i <= 5; i++) {
		for (int j = i; j <= 5; j++) {
			System.out.print("*");	
		}
		int p1=1;
		for(int k1 = 1; k1 < i ; k1++) {
			System.out.print(p1++);
		}
//		for(int l = 1 ; l <= i ; l++) {
//		System.out.print(p1--);
//		
//	}
		System.out.println();
	
	
		}
}
}	
		
		
		
		
		
	
	


