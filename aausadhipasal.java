import java.util.*;

/**
 * Write a description of class aausadhipasal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class aausadhipasal
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("   ************Medicine Information&*************    ");
        System.out.println("Medicine\t price(pp)\tquantity");
        System.out.println("Amoxicillin\t RS20\t         1500");
        System.out.println("Paracetamol\t RS15\t         3000");
        System.out.println("Omeprazol\t RS10\t         2500");
        System.out.println("Aspirin\t         RS10\t         4000");
        System.out.println("Antibiotics\t RS35\t         3500");
        System.out.println("Medicine that needs prescription: ");
        System.out.println("Amoxicillin\nOmeprazol\nAntibiotics");
        System.out.println();
        System.out.println("Quantity of Amoxicillin  :");
        int amoxicillin= scan.nextInt();
        System.out.println( "The stock is :"+amoxicillin);
        String a =(amoxicillin <=100) ? "WARNING:LOW STOCK":"status:Normal"; //true or false check
        System.out.println(a);
        System.out.println();
           
        System.out.println("Quantity of Paracetamol: "); 
        
        int paracetamol= scan.nextInt();
        System.out.println("The stock is :"+paracetamol);
        String b =(paracetamol <=100) ? "WARNING:LOW STOCK":"status:Normal"; //true or false check
        System.out.println(b);
        System.out.println();
        System.out.println("Quantity of Omeprazol: ");
        int omeprazol= scan.nextInt();
        System.out.println("The stock is :"+omeprazol);
        String c =(omeprazol <=100) ? "WARNING:LOW STOCK":"status:Normal"; //true or false check
        System.out.println(c);
        System.out.println();
        System.out.println("Quantity of Aspirin: ");
        int aspirin= scan.nextInt();
        System.out.println("The stock is :"+aspirin);
        String d =(aspirin <=100) ? "WARNING:LOW STOCK":"status:Normal"; //true or false check
        System.out.println(d);
        System.out.println();
        System.out.println("Quantity of Antibiotics: ");
        int antibiotics= scan.nextInt();
        System.out.println("The stock is :"+antibiotics);
        String e =(antibiotics <=100) ? "WARNING:LOW STOCK":"status:Normal"; //true or false check
        System.out.println(e);
        System.out.println();        
         }
}