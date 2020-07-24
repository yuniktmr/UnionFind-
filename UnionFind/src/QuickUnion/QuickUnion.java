package QuickUnion;
//Set root of first element to point to root of aonther element.
public class QuickUnion {
	private int [] id;
	public QuickUnion(int n) {
		for(int i=0;i<n; i++) {
			id[i] = i;
		}
	}
	
	private int root(int p) {
		while(p!= id[p]) p = id[p];
		return p;
	}
	
	public boolean connected(int p, int q) {
		return (root(p) == root(q));
	}
	
	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}
}
