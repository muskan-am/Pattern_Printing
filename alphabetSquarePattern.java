import java.util.*;

public class alphabetSquarePattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the num : ");
            int num  = sc.nextInt();

            for(int i=1; i<=num; i++){
                for(int j=1; j<=num; j++){
                    //System.out.print((char)(j+64)+" ");
                    //System.out.print((char)(j+96)+" ");
                    //System.out.print((char)(i+64) + " ");
                    System.out.print((char)(i+96) + " ");
                }
                System.out.println();
            }
        }
    }
}

// a b c d e 
// a b c d e 
// a b c d e 
// a b c d e 
// a b c d e
//----------------------------------------------
// A B C D E 
// A B C D E 
// A B C D E 
// A B C D E
// A B C D E
//------------------------------------------------

// A A A A A 
// B B B B B 
// C C C C C
// D D D D D
// E E E E E

//------------------------------------------

// a a a a a 
// b b b b b 
// c c c c c
// d d d d d
// e e e e e





