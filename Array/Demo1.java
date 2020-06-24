import java.util.*;
public class Demo1
{
    public static void main(String args[]) 
     {
        int n,i,sum=0;
        float average;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num of elements you want in the array:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter all the elements");
        for(i=0;i<n;i++)
         {
          a[i]=sc.nextInt();
          sum=sum+a[i];
         }
         System.out.println("sum:"+sum);
         average=(float)sum/n;
         System.out.println("Average:"+average);
}
}
