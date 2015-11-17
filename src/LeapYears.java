/**
 * Created by ngondo on 11/17/15.
 */

//Program that prints the next 20 leap years as from 2016
public class LeapYears {
    public LeapYears() {
        int leap;
        for (leap = 2016;leap <= 2096;leap+=4){
            System.out.print("\n" + leap);
        }

    }
}
