package QuickFind;
import java.util.ArrayList;
import java.util.List;
//set all elements whose id equals that of first element to id of second element
public class UnionFindImplementation{
	private static int[] a;
	public static UnionFindImplementation Instance;
	private static List<Integer> path = new ArrayList<Integer>();
	private UnionFindImplementation(int n) {
		a = new int[n];
		for (int i=0; i<a.length;i++) {
			a[i] = i;
		}
	}
	
	public static UnionFindImplementation getInstance(int n) {
		if(Instance == null) {
			Instance = new UnionFindImplementation(n);
		}
		return Instance;
	}
	
	public static void printInit() {
		for (int i = 0; i<a.length; i++) {
			System.out.printf("a[%d] = %d \n",i,a[i]);
		}
	}
	
	public static void union(int p, int q) {
		int pid = a[p];
		int qid = a[q];
		for (int i = 0; i<a.length; i++) {
			if(a[i] == pid) a[i] = qid;
		}
	}
	
	public static boolean connected(int p, int q) {
		
		if(a[p] != a[q]) {
			return false;
		}else {
			return true;
		}
	}
	
	public static List<Integer> find(int p) {
		
		for (int i = 0; i<a.length; i++) {
			if(a[p] == a[i])  path.add(i);
		}
		return path;
	}
	
	public static int count() {
		return path.size();
	}
}
