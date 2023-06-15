package Introduction;

public class Variable {
    //instance variable
    int num1;
    int num2;
    // class variable
    static int sum;

    public static void main(String[] args) {
        Variable var = new Variable();
        var.num1 = 10;
        var.num2 = 20;
        sum = var.num1 + var.num2;
        System.out.println(var.num1);
        System.out.println(var.num2);
        System.out.println(sum);
    }
}
