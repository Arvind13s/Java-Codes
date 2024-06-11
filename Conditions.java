import java.util.*;

public class Conditions{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();
            
            if (age>18) {
                System.err.println(" Eligible.");
            }
            else{
                System.out.println(" Not Eligible");
            }
        }
    }
}