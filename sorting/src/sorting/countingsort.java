package sorting;
import java.util.*;
public class countingsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new  Scanner(System.in);
       System.out.println("enter th esize");
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++) {
    	   a[i]=sc.nextInt();
       }
       int max=a[0];
       for(int i=1;i<n;i++) {
    	   if(max<a[i]) {
    		   max=a[i];
    	   }
    	   
       }
      
       int []c=new int[max+1];
       for(int i=0;i<n;i++) {
    	   c[a[i]]++;
       }
       for(int i=1;i<=max;i++) {
    	   c[i]=c[i-1]+c[i];
       }
       int j=0;
       int[] b=new int[n];
       for(int i=0;i<max+1;i++) {
    	   while(j<c[i]) {
    		  b[j]=i; 
    		  j++;
    	   }
       }
       for(int i:b) {
    	   System.out.println(i);
       }
	}

}
