package sorting;
import java.util.*;
public class quicksort {
   static void sort(int[]a,int l,int e) {
	   if(l<e) {
		   int p=part(a,l,e);
		   sort(a,l,p-1);
		   sort(a,p+1,e);
	   }
   }
   static int part(int []a,int l,int e) {
	   int pivot=a[e];
	   int i=l-1;
	   for(int j=l;j<=e-1;j++) {
		   if(a[j]<pivot) {
			   i++;
			   int t=a[j];
			   a[j]=a[i];
			   a[i]=t;
		   }
	   }
	   int y=a[i+1];
	   a[i+1]=a[e];
	   a[e]=y;
	   return (i+1);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size");
       int n=sc.nextInt();
       int[] a=new int[n];
       for(int i=0;i<n;i++) {
    	   a[i]=sc.nextInt();
       }
       int start=0,end=n-1;
       sort(a,start,end);
       for(int i:a) {
    	   System.out.println(i);
       }
	}

}
