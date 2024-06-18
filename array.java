import java.util.Scanner;
public class array
{
public static void main(String args[])
{
   int n,i;
   Scanner s=new Scanner(System.in);
   System.out.println("enter array size:");
   n=s.nextInt();
   int[] ar=new int[n];
   System.out.println("enter array elements:");
   for(i=0;i<n;i++)
{
  ar[i]=s.nextInt(); 
} 
     System.out.println("your elements are:");
  for(i=0;i<n;i++)
{
    System.out.println("element:"+" "+ (i+1)+" "+"is "+ar[i]);
}
}
}