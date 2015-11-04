/**
 * Created by ngondo on 11/4/15.
 */
/*
* A simple program that adds numbers divisible by both three and five between 1 - 100
* */
public class Sumfifteen {
//    Placeholder for the sum of numbers
    int sum = 0;
//    Constructor that is called once the method is called
    public Sumfifteen() {
//        Iterate between numbers from 1-100
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                /*
                * Sieve out numbers that are divisible by both 3 and 5
                * Add the numbers and place them in the sum place holder
                * */
                sum +=i;
            }
        }
        System.out.print(sum);
    }
}
