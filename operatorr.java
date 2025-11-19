import java.util.Scanner;

/**
 * Write a description of class operatorr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class operatorr
{
    public static void main(String[] args)
    { 
        int a=10;
        int b=15;
        int sum=a+b;
        
        //System.out.println(sum);
        /*
        int c=10;
        int d=3;
        
        int remainder=c%d ;
        System.out.println(remainder);
        */
       
       
       
       System.out.println(a==b);
       System.out.println(a>b);
       System.out.println(a<b);
       
       System.out.println(a!=b);
       
       
       int c=1;
       
       System.out.println(++c);   // ++c=2,c=2
       System.out.println(c);     //c=2
       
       System.out.println(c++);  //c++ =2
       System.out.println(c);    // c=3
       
       System.out.println("Coverage of scanner class");
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter one number:");
       int firstNum= scan.nextInt();   //double, String, boolen
       System.out.println(firstNum);
       
       
        
       
       //Ternert operator
       int age=18;
       String isValid = (age >=18) ? "He can drive" : "He cannot drive" ;
    }
        
}