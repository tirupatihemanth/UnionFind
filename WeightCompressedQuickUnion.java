
public class WeightCompressedQuickUnion {
	int arr[];
	int size[];
	public WeightCompressedQuickUnion(int n){
		arr = new int[n];
		size = new int[n];
		for(int x=0;x<n;x++){
			arr[x]=x;
		}
		for(int x=0;x<n;x++){
			size[x]=1;
		}
	}
	private int root(int x){
		while(arr[x]!=x){
			arr[x]=arr[arr[x]];
			x=arr[x];
		}
		return x;
	}
	public boolean connected(int x,int y){
		return(root(x)==root(y));
	}
	public void union(int x,int y){
		int rootx = root(x);
		int rooty = root(y);
		if(size[rootx]<size[rooty]){
			arr[rootx]=rooty;
			size[rooty]+=size[rootx];
		}
		else{
			arr[rooty]=rootx;
			size[rootx]+=size[rooty];
		}
	}
	public void status(){
		for(int x=0;x<arr.length;x++){
			System.out.print(arr[x]);
		}
	}
}
