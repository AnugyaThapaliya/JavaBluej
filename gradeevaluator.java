import java.util.Scanner;

/**
 * Write a description of class gradeevaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class gradeevaluator
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the numeric grades: ");
        int grade= scan.nextInt();
        System.out.println(grade);
        String result=(grade>=40) ? "THE RESULT : \n PASS" : "THE RESULT : \n FAIL";
        System.out.println(result);
        
    }
}