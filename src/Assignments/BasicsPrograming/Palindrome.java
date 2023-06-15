package Assignments.BasicsPrograming;

public class Palindrome {
    public static void main(String[] args) {
        int n = 3814;
        int temp = n;
        int reverse = 0;
        while(temp>0){
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp = temp/10;

        }
    if (n == reverse){
        System.out.println("Palindrome");

    }
    else{
        System.out.println("Not palindrome");
    }

    }
}
