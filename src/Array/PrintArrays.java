package Array;

public class PrintArrays {
    public static void main(String[] args) {
        int a[];        //declaration
        a = new int[15];        //instantiation
        // int a[] = new int [12];
        System.out.println(a);
        a[0] = 19;      //initiation
        a[1] = 5;
        a[2] = 9;
        a[3] = 51;
        a[4] = 191;
        a[5] = 50;
        //int a[5] = {2,4,5,3,7}; declaration instantiation & initialisation in one line

        for(int i= 0; i<a.length; i++){ //traversing or for printing element of array
            System.out.println(i  +" "+a[i]);
        }

        System.out.println("Arrays");

    }
}
