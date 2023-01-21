package sorting;
import java.util.*;
public class radixsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size");
       int n=sc.nextInt();
       int [] a=new int[n];
       int [] b=new int[n];
       int[] count=new int[n];
       for(int i=0;i<n;i++) {
    	   a[i]=sc.nextInt();
       }
       int max=0;
       for(int i=0;i<n;i++) {
 		  if(max<a[i]) {
 			  max=a[i];
 		  }
 	  }
      int pos=1;
      while((max/pos)>0) {
    	  for(int i=0;i<n;i++) {
    		  count[(a[i]/pos)%10]++;
    	  }
    	  for(int i=1;i<=n;i++) {
    		  count[i]=count[i]+count[i-1];
    	  }
    	  for(int i=n-1;i>=0;i--) {
    		  b[count[((a[i]/pos)%10)-1]]=a[i];
    	  }
    	  for(int i=0;i<n;i++) {
    		  a[i]=b[i];
    	  }
    	  pos=pos*10;
    	  
      }
      for(int i:a) {
    	  System.out.println(i);
      }
       
	}

}
