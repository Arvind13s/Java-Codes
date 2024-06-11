import java.util.*;

public class OddEven{
    public static void main (String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            double x = sc.nextDouble();

            if( x % 2 == 0) {
                System.out.println("Even");
            }
            else {
                System.out.println("Odd");
            }
        }
        
    }

}