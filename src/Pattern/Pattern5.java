package Pattern;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<2*n; i++){
            for(int j=1; j<2; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }


}
