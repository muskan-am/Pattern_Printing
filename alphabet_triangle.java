import java.util.Scanner;

public class alphabet_triangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number : ");
            int num = sc.nextInt();

            for(int i=1; i<=num; i++){
                for(int j=1; j<=i; j++){
                    //System.out.print((char)(j+64) + " ");
                    System.out.print((char)(i+64)+" ");
                }
                System.out.println();
            }
        }
    }
}

// A 
// A B 
// A B C 
// A B C D
// A B C D E
//---------------------------------
// A 
// B B
// C C C
// D D D D
// E E E E E