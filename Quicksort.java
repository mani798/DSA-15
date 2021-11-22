package DSA15;

public class Quicksort {
	public static void main(String[] args) {
		 int a[]= {4,6,2,5,7,9,1,3};
		 sort(a,0,a.length-1);
		 
		 for(Integer val: a) {
			 System.out.print(val + " ");
		 }
	}
	
	public static void sort(int a[], int low,int high) {
		if(low<high) {
   		int mid=low+(high-low)/2;
   		int pivot=findpivot(a,low,high);
   		
   		sort(a,low,mid);
   		sort(a,mid+1,high);
	   }
	}

	public static int findpivot(int[] a, int low, int high) {
		int pivot=a[low];
		int p1=low+1,i,temp;
		
		for(i=low+1;i<=high;i++) {
			if(a[i]<pivot) {
				if(i!=p1) {
					
				}
			}
		}
		
		
		
		return i+1;
	}
}
