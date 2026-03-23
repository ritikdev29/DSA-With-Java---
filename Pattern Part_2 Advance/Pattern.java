import java.util.*;

public class Pattern {
    public static void hollow_rectangle(int tolRow, int tolcol) {
        // outer loop
        for (int i = 1; i <= tolRow; i++) {
            // inner colums loop
            for (int j = 1; j <= tolcol; j++) {
                // boundary cells
                if (i == 1 || i == tolRow || j == 1 || j == tolcol) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
        System.out.println();

        }
    
    }
    public static void inverted_rotated_half_pyramid(int n){
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rectangle(4, 5);
        inverted_rotated_half_pyramid(4);
    }

}
