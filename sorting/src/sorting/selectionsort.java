package sorting;
import java.util.*;
public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        
        }
        for(int i=0;i<n-1;i++) {
        	int min=i;
        	for(int j=1;j<n;j++) {
        		if(a[j]<a[min]) {
        			min=j;
        		}
        	}
        	if(min!=i) {
        		int t=a[min];
        		a[min]=a[i];
        		a[i]=t;
        	}
        }
        for(int i:a) {
        	System.out.println(i);
        }
	}

}
