import java.util.Scanner;

/**
 * Created by ngondo on 11/17/15.
 */
public class SumToN {
    public SumToN() {
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++){
            sum +=i;
        }
        System.out.println(sum);

    }
}
