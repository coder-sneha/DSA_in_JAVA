package String;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str = "Java";
        int length = str.length();
        System.out.println(length);
        System.out.println(str1);
        //concatanation
        String result = str + str1;
        System.out.println(result);

        System.out.println(str1.concat(str));

    }
}
