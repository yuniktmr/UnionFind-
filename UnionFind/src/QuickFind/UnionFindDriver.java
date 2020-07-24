package QuickFind;
import java.util.Scanner;

public class UnionFindDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array");
		int x = scan.nextInt();
		UnionFindImplementation.getInstance(x);
		UnionFindImplementation.printInit();
		UnionFindImplementation.union(1, 3);
		System.out.println("\nAfter union\n");
		UnionFindImplementation.printInit();
		UnionFindImplementation.union(2, 3);
		System.out.println("\nAfter union\n");
		UnionFindImplementation.printInit();
		UnionFindImplementation.union(0, 3);
		System.out.println("\nAfter union\n");
		UnionFindImplementation.printInit();
		System.out.println("\nConnectivity = ");
		System.out.println(UnionFindImplementation.connected(1, 3));
		System.out.println("\nConnected components are: ");
		System.out.println(UnionFindImplementation.find(2));
	}

}
