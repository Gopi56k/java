import java.io.*;
import java.util.*;
class rightTriangle
{
   public static void main(String[]args)
   {
      int i,j,n;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the number of rows: ");
      n=sc.nextInt();
      for(i=0;i<n;i++)
      {
         for(j=2*(n-i);j>=0;j--)
         {
            System.out.println(" ");
         }
         for(j=0;j<=i;j++)
         {
            System.out.println("*");
         }
       System.out.println();
     }
   }
}
     
