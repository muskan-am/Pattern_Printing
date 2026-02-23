import java.util.*;

public class squareRectangle{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of Rows : ");  //kitni lines hogi 
            int row = sc.nextInt();
            System.out.println("Enter the number of columns : "); // har line me kitne stars print hoge
            int col = sc.nextInt();

            for(int i=1; i<=row; i++){
                for(int j=1; j<=col; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}



// *****
// *****
// *****
// *****
// *****