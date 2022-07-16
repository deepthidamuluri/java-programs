import java.util.*;
class BooleanOperation{

//main method
public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
  System.out.println("Enter x as boolean value(true/false): ");
  boolean x=sc.nextBoolean();
  System.out.println("Enter y as boolean value(true/false): ");
  boolean y=sc.nextBoolean();
  System.out.println("x&&y"+(x&&y));
  System.out.println("x||y"+(x||y));
  System.out.println("!x"+(!x));
  System.out.println("!y"+(!y));
  
  }
}

