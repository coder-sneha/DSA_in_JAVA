package Array;

import java.util.Scanner;

public class ArrayUtil {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();  // length of array
//        int a[] = new int[n];  // array declaration and initialisation
//        //user input
//        for(int i=0; i<n; i++){
//           a[i]= sc.nextInt();
//        }
//        // printing array
//        for(int i=0; i<n; i++){
//            System.out.print(a[i] +" ");
//        }
//
//    }

    public static void printArray(int[] MYarr){
        int n = MYarr.length;
        for(int i =0; i<n; i++){
            System.out.println(MYarr[i] + " ");
        }
        System.out.println( );

    }

    public void ArrayDemo() {
        int arr[] = new int[5]; //defalult values 0
       // printArray(arr);
        arr[0] = 5;
        arr[1] = 1;
        arr[2] = 8;
        arr[3] = 55;
        arr[4] = 10;
        arr[2] = 44;
        printArray(arr);
        //arr[5] = 7;
        System.out.println(arr.length);
        System.out.println(arr[arr.length-1]);
    }
    public static void main(String[] args) {
        ArrayUtil a = new ArrayUtil();
        a.ArrayDemo();
        printArray(new int[] {5, 1, 3, 6 ,7});

    }
}
