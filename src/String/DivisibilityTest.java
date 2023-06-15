package String;

import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        int length = number.length();
        char lastCharacter = number.charAt(length - 1);
        int lastDigit = lastCharacter - 48;
        if(lastDigit == 0){
            int sum = 0;
            for(int i = 0; i< length; i++ ){
                char ch = number.charAt(i);
                int digit = ch - 48;
                sum += digit;
            }
            if(sum % 3 == 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

    }
}
