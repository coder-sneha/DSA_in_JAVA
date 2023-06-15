package Assignments.BasicsPrograming;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= 10 && b >= 10) {
            System.out.println("True");
        }else {
            System.out.println("false");
        }
         if (a%2==0 || b%2==0) {
            System.out.println("true");

        } else {
             System.out.println("false");
         }
         if (a != b) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }
}
