
/**
 * Write a description of class variable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class variable
{
    public static void main(String[] args){
            // 1 byte--->8 bits
             int age=78;  //  integer byte---->4 byte 
             //implicit Typecasting (Which means keeping bigger value to smaller value)
             double dg= age; //double byte --->8  bytes
             System.out.println(age);
             System.out.println(dg);
             //Explicit Typecasting (Keeping smaller value to bigger value)
             
             double weight= 72.34;
             int weigth= (int)weight;
             
             System.out.println(weigth);
             
             byte t=1;
             byte c=2;
             
             byte h=(byte)(t+c);  //print hunalai (byte) rakhnu parxa
             System.out.println(h);
             //Arithimatic Typecasting
             //Escape Sequence
             
             short s= 3;
             short sr= 4;
             
             short st= (short)(s+ sr);
             
             
             //Escape sequences
             
             System.out.println("Hello\nWorld"); // line break
             System.out.println("Hamro\tNepal");
             System.out.println("Hey \" Hey\""); //quotation dina  ko lagi answer ma
             System.out.println("\u2764"); // unicode escape sequence ko  lagi use garne
    }
}