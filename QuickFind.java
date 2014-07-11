
public class QuickFind {
	int arr[];
	public QuickFind(int n){
		arr = new int[n];
		for(int x=0;x<n;x++){
			arr[x]=x;
		}
	}
	public boolean connected(int x,int y){
		return(arr[x]==arr[y]);
	}
	public void union(int x,int y){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==arr[x])
				arr[i]=arr[y];
		}
	}
	public void status(){
		for(int x=0;x<arr.length;x++){
			System.out.print(arr[x]);
		}
		
	}
}
