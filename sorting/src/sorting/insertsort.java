package sorting;
import java.util.*;
public class insertsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size");
       int n=sc.nextInt();
       int [] a=new int[n];
       for(int i=0;i<n;i++) {
    	   a[i]=sc.nextInt();
       }
       if(a.length==0) {
    	   System.out.println("empty list");
       }else {
    	   for(int i=1;i<n;i++) {
    		   int temp=a[i];
    		   int j=i-1;
    		   while((j>=0) && (temp<a[j])) {
    			   a[j+1]=a[j];
    			   j--;
    		   }
    		   a[j+1]=temp;
    	   }
    	   for(int i:a) {
    		   System.out.println(i);
    	   }
       }
	}

}
