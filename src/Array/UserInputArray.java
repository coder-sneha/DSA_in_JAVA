package Array;

import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i]= sc.nextInt();
            System.out.println(a[i]+ " ");
            sum = a[i] + sum;
            product = product * a[i];
        }
        System.out.println(sum);
        System.out.println(product);
    }
}
