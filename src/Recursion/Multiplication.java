package Recursion;

public class Multiplication {
    static int multiply(int M,int N){
        if(M == 0|| N == 0){
            return 0;
        }int result = M + multiply(M , N -1);
        return result;
    }

    public static void main(String[] args) {
        int result = multiply(2, 3);
        System.out.println(result);

    }
}
