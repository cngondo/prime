/**
 * Created by ngondo on 11/4/15.
 */
/*
* A simple program that adds numbers divisible by both three and five between 1 - 100
* */
public class Sumfifteen {
    public int sum = 0;
    public Sumfifteen() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum +=i;
            }
        }
        System.out.print(sum);
    }
}
