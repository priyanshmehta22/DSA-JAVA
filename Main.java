import java.util.*;
public class Main
// merge sort
{
	
	    	public static void conquer(int arr[], int si, int ei, int  mid){
	    int idx1=si;
	    int idx2=mid+1;
	    int x=0;
	    int merged[]= new int[ei-si+1];
	    while(idx1<=mid && idx2<=ei){
	    if(arr[idx1]<=arr[idx2]){
	        merged[x]=arr[idx1];
	        x++;
	        idx1++;
	    }
	    else{
	         merged[x]=arr[idx2];
	        x++;
	        idx2++;
	    }
	    }
	    while(idx1<=mid){
	         merged[x]=arr[idx1];
	        x++;
	        idx1++;
	    }
	    while(idx2<=ei){
	         merged[x]=arr[idx2];
	        x++;
	        idx2++;
	    }
	    for(int i=0,j=si;i<merged.length;i++,j++){
	        arr[j]=merged[i];
	    }
	}
	public static void divide(int arr[], int si, int ei){
	    if(si>=ei){
	        return;
	    }
	    int mid=si+(ei-si)/2;
	    divide(arr,si,mid);
	    divide(arr,mid+1,ei);
	    conquer(arr,si,ei,mid);
	}
public static void main(String[] args) {
    int arr[]={2,6,3,9,4,7};
    int n=arr.length;
    divide(arr,0,n-1);
    for(int i=0; i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
	}
}
