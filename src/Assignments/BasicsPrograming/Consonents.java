//Given a string s. Print the string after removing all vowels.
package Assignments.BasicsPrograming;

import java.util.Scanner;

public class Consonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i <= s.length(); i++) {
            if ((s.charAt(i) == 'a' ||
                    s.charAt(i) == 'e' ||
                    s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u') == false) {
                System.out.println(s.charAt(i));
            }

        }
    }
}
