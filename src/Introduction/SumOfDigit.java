package Introduction;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        for(int i=1; i<=n; i++){
            int digit = n%10;
            sum = sum + digit;
            product = product * digit;
            n = n/10;

        }
        System.out.println(sum);
        System.out.println(product);
    }
}
