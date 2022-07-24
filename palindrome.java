import java.util.Scanner;
public class palindrome
  {
    public static void main(String args[])
    {
      int i,n,rev=0,d;
      Scanner s=new Scanner(System.in);
      System .out.println("enter the number");
      n=s.nextInt();
      System .out.println("enter the palindrome number");
      for (i=0;i<=n;i++)
        
      n=i;
      while(n>0)
        {
        d=n%10;
      rev=rev*10+d;
      n=n/10;
    }
      
     if(rev == i)
     {
  System.out.println( i + " ");
     }
      

      
    }
  }
        
      