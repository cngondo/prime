/**
 * Created by ngondo on 11/16/15.
 */
public class PowersOfTwo {
   public void powers(int num){
       if(num==0){
           System.out.print("False");
           return;
       }

       while(true){
           if(num==1){
               System.out.print("True");

               return;
           }
           else if(num % 2 ==0){
               num=num/2;
           }
           else{
               System.out.print("False");
               return;
           }
       }
   }

}
