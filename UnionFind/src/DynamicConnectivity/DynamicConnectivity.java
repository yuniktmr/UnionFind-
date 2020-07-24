package DynamicConnectivity;

import java.util.Scanner;

import QuickFind.UnionFindImplementation;
//Connectivity operation using QuickFind //modify the driver as per your needs.
public class DynamicConnectivity {
	
	//for demo purposes; change the driver as suited for your driver logic.
	static int p;
	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the total number of elements");
	int n = scan.nextInt();
	
	UnionFindImplementation.getInstance(n);
	UnionFindImplementation.printInit();
	
	while(true) {
		System.out.println("Enter first number");
		 p = scan.nextInt();
		System.out.println("Enter second number");
		int q = scan.nextInt();
		if(p==-1) break;
		if(!UnionFindImplementation.connected(p, q)) {
			UnionFindImplementation.union(p, q);
			System.out.println(p+" "+q);
		}
	}
	System.out.println("\nFinally:\n");
	UnionFindImplementation.printInit();
	
}
}