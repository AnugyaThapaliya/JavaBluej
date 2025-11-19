import java.util.Scanner;

/**
 * Write a description of class calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculator
{
     public static void main(String[] args){
         System.out.println("coverage of scanner class");
         Scanner scan = new Scanner(System.in);
         System.out.println("enter first number:");
         int FirstNum= scan.nextInt();
         System.out.println("enter second number:");
         int SecondNum= scan.nextInt();
         int sum= FirstNum + SecondNum ;
         System.out.println(FirstNum);
         System.out.println(SecondNum);
         System.out.println(sum);
         
         
     }
     
}