package Lec36;

public class Time_Com_DEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
//		System.out.println("Coding Blocks");
//		System.out.println("Coding Blocks");
//		System.out.println("Coding Blocks");
//		System.out.println("Coding Blocks");
//		System.out.println("Coding Blocks");
		for (int i = 0; i <n; i++) {
			
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n / 3; j++) {
				System.out.println("Hey");
				// O(N^2)
			}
		}
		
		int i = 0;
		while (i < n) {
			System.out.println("Hey");
             // O(1)   
			i++;
		}
		
		
		while (i <= n) {
			System.out.println("Hey");

			i *= 2;
			// Log(N)
		}
		

		while (n > 0) {
			System.out.println("Hey");
			n /= 2;
			// Log(N)
		}

		
		while (i <= n) {
			System.out.println("Hey");

			i += 2;
			i += 3;
			// O(n)
		}
		
		
		while (i <= n) {
			System.out.println("Hey");

			i *= 2;
			i *= 3;
			// O(log(n) // base 6
		}
		
		
		while (n > 0) {
			System.out.println("Hey");

			n /= 2;
			n /= 3;
			// O(log(n) // base 6
		}
		
		while (i <= n) {
			System.out.println("Hey");

			i += k;
			// O(N/K)
		}
		
		while (i <= n) {
			System.out.println("Hey");

			i *= k;
			
			// O(log(n) // base k
		}
		
		while (n > 0) {
			System.out.println("Hey");
            // O(n)
			n = n - 1;
		}
		
		
		while (n > 0) {
			System.out.println("Hey");

			n = n - 2;
			n = n - 3;
			// O(n)
		}
		
		
		while (n > 0) {
			n = n - k;
			
			// O(N/K)
		}
		
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println("hey");
				// O(N^2)
			}
		}
		
		
		for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
			//Sqrt(N)
		}

		for (i = 1; i <= n; i++) {
			for (int j = i+1; j <= n; j++) {
				System.out.println("hey");
				// O(N^2)
			}
		}
		
		
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (int k = 1; k <= n / 2; k++) {
					System.out.println("hey");
					// O(N^4)
				}
			}
		}
		
		
		
		
		for( i=1; i<=n; i*=2) {
			System.out.println("hey");
			// log(N)
		}
		
		
		for(i=n/2; i<=n; i++) {
			for(int j=1; j<=n/2; j++) {
				for(int k=1; k<=n; k=k*2) {
					System.out.println("hey");
				}
			}
		}
		
		
		for(i=1; i<=n; i++) {
			for(int j=1; j<=n; j+=i) {
				System.out.println("hey");
				// O(Nlog(N))  
			}
		}
		
		
		
		
		
		while(n>0) {
			int j=n;
			while(j>1) {
				System.out.println("hey");
				j--;
			}
			n/=2;
		}
		
		
	}

}
