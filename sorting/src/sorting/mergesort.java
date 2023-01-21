package sorting;
import java.util.*;
public class mergesort {
   static void sort(int[]a,int b,int h) {
	   if(b<h) {
		   int m=(b+h)/2;
		   sort(a,b,m);
		   sort(a,m+1,h);
		   mer(a,b,m,h);
	   }
   }
   static void mer(int[] a,int l,int m,int h) {
	   int n1=m-l+1;
	   int n2=h-m;
	   int[] b=new int[n1];
	   int[] c=new int[n2];
	   for(int i=0;i<n1;i++) {
		   b[i]=a[i+l];
	   }
	   for(int j=0;j<n2;j++) {
		   c[j]=a[m+1+j];
	   }
	   int i,j,k;
	   i=j=0;k=l;
	   while(i<n1 && j<n2) {
		   if(b[i]<=c[j]) {
			   a[k]=b[i];
			   i++;
		   }else {
			   a[k]=c[j];
			   j++;
		   }
		   k++;
	   }
	   while(i<n1 ) {
		   a[k]=b[i];
		   i++;
		   k++;
	   }
	   while(j<n2) {
		   a[k]=c[j];
		   j++;
		   k++;
	   }
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
        int l=0;
        int h=a.length-1;
        sort(a,l,h);
        for(int i:a) {
        	System.out.println(i);
        }
	}

}
