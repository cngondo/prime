/**
 * Created by ngondo on 11/13/15.
 */
public class FizzBuzz {

    public FizzBuzz() {
        for (int i = 1; i<=100; i++) {
            if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else if(i % 3 == 0 && i % 5 == 0){
                System.out.println("Fizz Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
