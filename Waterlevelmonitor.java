
/**
 * Write a description of class Waterlevelmonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Waterlevelmonitor
{
    public static void main(String[] args){
        int litre= 1200;
        String waterlevel=(litre>=1000)? "WARNING : Water has reached 1000L or more!": "Status: Normal";
        System.out.println(waterlevel);
    }
}