package PathCompression;
//set root of smaller tree equal to that of larger tree. 
public class PathCompression {
	private int [] id;
	//size = array to log the size of the tree for given element
	private int [] size;
	public PathCompression(int n) {
		for(int i=0;i<n; i++) {
			id[i] = i;
		}
	}
	
	private int root(int p) {
		
		while(p!= id[p]) { 
			//single pass implementation; set root as grandparent// half the path length
			id[p] = id[id[p]]; 
			p = id[p]; 
		}
		size(p);
		return p;
		
	}
	
	private void size(int p) {
		int count = 0;
		for (int i = 0; i<id.length; i++) {
			if(root(i) == root(p)) {
				count++;
				size[p] = count;
			}
		}
	}
	
	public boolean connected(int p, int q) {
		return (root(p) == root(q));
	}
	//weighted union
	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		if(i == j) return;
		if(size[i] < size[j]) { id[i] = j; size[j]+= size[i];}
		else 				{ id[j] = i; size[i] += size[j];}
	}
}
