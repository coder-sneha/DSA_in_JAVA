package Introduction;

public class NonStaticFunction {
        private void print(String s){
        }
    public static void main(String[] args) {
        NonStaticFunction n1 = new NonStaticFunction();
        n1.print("Test");
    }
}
