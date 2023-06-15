package Introduction;

public class ConstructorExample {
        int i;
        float f;
        String s;
        ConstructorExample(){
        i = 1;
        f = 1.456f;
        s = "1gyuiy";
        }

    public static void main(String[] args) {
            ConstructorExample constructorExample = new ConstructorExample();
            ConstructorExample constructorExample2 = new ConstructorExample();
        System.out.println(constructorExample.i);
        System.out.println(constructorExample2.f);
        System.out.println(constructorExample2.s);
    }
}
