package BitManipulation;

import java.util.Scanner;

public class DectoBin {
    public static void convert(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while(n>0){
            int rem = n% 2;
            binNum += (rem * (int)Math.pow(10, pow));

            pow ++;
            n = n/2;
        }
        System.out.println(binNum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        convert(n);

    }
}
