import java.util.*;

public class Pattern1{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int Column = sc.nextInt();
            int Row = sc.nextInt();

            for(int i=1; i<= Column;i++){
                for (int j = 1; j<=Row;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
    }
}