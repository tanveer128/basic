package sorting;
import java.util.*;
public class shellsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size");
       int n=sc.nextInt();
       int[] a=new int[n];
       for(int i=0;i<n;i++) {
    	   a[i]=sc.nextInt();
       }
       for(int gap=n/2;gap>=1;gap=gap/2) {
    	   for(int j=gap;j<n;j++) {
    		   for(int i=j-gap;i>=0;i=i-gap) {
    			   if(a[i+gap]<a[i]) {
    				   int t=a[i+gap];
    				   a[i+gap]=a[i];
    				   a[i]=t;
    			   }else {
    				   break;
    			   }
    		   }
    	   }
       }
       for(int i:a) {
    	   System.out.println(i);
       }
	}

}
