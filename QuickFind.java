//Basic version of UnionFind Algorithm least efficiency Algorithm in the present UnionFind Repository
public class QuickFind {
	int arr[];
	public QuickFind(int n){
		arr = new int[n];
		for(int x=0;x<n;x++){
			arr[x]=x;
		}
	}
	public boolean connected(int x,int y){
		//returns true if the two elements are connected by atleast one way else returns false
		return(arr[x]==arr[y]);
	}
	public void union(int x,int y){
                //connects two elements
		for(int i=0;i<arr.length;i++){
			if(arr[i]==arr[x])
				arr[i]=arr[y];
		}
	}
	public void status(){
		//This method is to just show the present stucture of the network and is used for debugging purposes
		for(int x=0;x<arr.length;x++){
			System.out.print(arr[x]);
		}
		
	}
}
