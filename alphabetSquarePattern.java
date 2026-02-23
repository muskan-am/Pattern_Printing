import java.util.*;

public class alphabetSquarePattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the num : ");
            int num  = sc.nextInt();

            for(int i=1; i<=num; i++){
                for(int j=1; j<=num; j++){
                    System.out.print((char)(j+64)+" ");
                }
                System.out.println();
            }
        }
    }
}
