package genralMaths;

import java.util.Scanner;

public class Maths {
    public static  int factorial(int n ){
        int f = 1;
        for(int i = 1; i<=n; i++){
            f = f* i;
        }
        return f;
    }
    public static int binomialCoeff(int n, int r){
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nmrfact = factorial(n-r);
        int result = nfact/(rfact * nmrfact);
        return result;
    }
    public static int sum(int a, int b, int c){
        int sum  = a+b+c;
        return sum;
    }
    public static int sum(int a, int b){
        int sum  = a+b;
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
         int fact = factorial(n);
        System.out.println(fact);
        int bicoeff = binomialCoeff(n, r);
        System.out.println(bicoeff);
        System.out.println(sum(2, 5));
        System.out.println(sum(3,7 , 5));

    }
}
