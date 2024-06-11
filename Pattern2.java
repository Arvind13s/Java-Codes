import java.util.*;

public class Pattern2 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int Column = sc.nextInt();
            int Row = sc.nextInt();
             
            for(int i = 1; i<=Column; i++){
                for(int j=1;j <=Row ; j++){
                    if( i==1 || j==1 || i==Column || j== Row ){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
