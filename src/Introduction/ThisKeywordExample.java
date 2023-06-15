package Introduction;

public class ThisKeywordExample {
    int i;
    float f;
    ThisKeywordExample(int a, float b){
        this.i = a;
        this.f = b;

    }
    public static void main(String[] args) {
        ThisKeywordExample t1 = new ThisKeywordExample(3,7.5f);
        System.out.println(t1.i);
        System.out.println(t1.f);

    }
}
