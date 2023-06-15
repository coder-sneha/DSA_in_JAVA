package Array;

import java.util.Scanner;

public class SubArray {
    public static void printSubarrays(int a[]){
        int ts = 0;
        int sum = 0;
        for(int i=0; i<a.length-1; i++){
            int start = i;
            for(int j=i; j<a.length; j++){
                int end = j;
                for(int k= start; k<=end; k++){
                    System.out.print(a[k]+ " ");
                    sum = sum + a[k];
            // System.out.print(" sum of the subArrays" + sum);
                }
                System.out.println();
                System.out.print("sum of subArrays" + sum);
                ts++;
                System.out.println();
            }
           // System.out.println();
        }
        System.out.println(" total subarrays ="+ ts);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        printSubarrays(a);
    }
}
