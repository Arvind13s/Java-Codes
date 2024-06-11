import java.util.*;

public class EqualT {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (a==b) {
                System.out.println("Equal");
            }
            else {
                if (a > b) {
                    System.out.println("a is greater.");   
                }
                else {
                    System.out.println("a is lesser");
                }
            }
        }
        

    }
}
