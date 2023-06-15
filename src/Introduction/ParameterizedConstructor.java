package Introduction;

public class ParameterizedConstructor {
    int i;
    float f;
    String s;
    ParameterizedConstructor(int a, float b, String c){
        this.i = a;
        this.f = b;
        this.s = c;

    }
    public static void main(String[] args) {
        ParameterizedConstructor p1 = new ParameterizedConstructor(10, 1.3f, "initial");
        System.out.println(p1.i);
        System.out.println(p1.f);
        System.out.println(p1.s);
        ParameterizedConstructor p2 = new ParameterizedConstructor(12, 1.5f, "sneha");
        System.out.println(p2.i);
        System.out.println(p2.f);
        System.out.println(p2.s);
    }
}
