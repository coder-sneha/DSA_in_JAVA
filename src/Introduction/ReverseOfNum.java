package Introduction;

import java.util.Scanner;

public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int reminder ;
        int reverse = 0;
        while(n>0){
            reminder = n%10;
            reverse = reverse * 10 + reminder;
            n = n/10;
        }
        System.out.println(reverse);

    }
}
