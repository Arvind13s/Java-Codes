import java.util.*;

public class Switchc{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int button = sc.nextInt();
            switch (button) {
                case 1: 
                    System.out.println("Blue");
                    break;
                case 2:
                 System.out.println("Red");
                 break;
                case 3:
                 System.out.println("Green");
                 break; 
            
                default:
                System.out.println("Wrong button");
                    break;
            }
        }
    }
    
}