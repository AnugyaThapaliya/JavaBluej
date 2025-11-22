
/**
 * Write a description of class DefaultValues here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefaultValues
{
    int a ;
    short b;
    long c;
    float d;
    byte e;
    double f;
    char g;
    boolean h;
    
    public static void main(String[] args){
        DefaultValues v1=new DefaultValues();
        
        System.out.println("int: " +v1.a);
        System.out.println("short: " +v1.b);
        System.out.println("long: " +v1.c);
        System.out.println("float: " +v1.d);
        System.out.println("byte: " +v1.e);
        System.out.println("double: " +v1.f);
        System.out.println("char: " +v1.g);
        System.out.println("boolean: " +v1.h);
    }
}