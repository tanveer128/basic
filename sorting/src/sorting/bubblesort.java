package sorting;
import java.util.*;
public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        	
        }
        if(a.length==0) {
        	System.out.println("empty list");
        }else {
        	for(int i=0;i<n;i++) {
        		for(int j=1;j<(n-i);j++) {
        			if(a[j-1]>a[j]) {
        				int t=a[j-1];
        				a[j-1]=a[j];
        				a[j]=t;
        			}
        		}
        	}
        }
        for(int i:a) {
        	System.out.println(i);
        }
	}

}
