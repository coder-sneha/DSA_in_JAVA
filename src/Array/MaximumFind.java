package Array;

import java.util.Scanner;

public class MaximumFind {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];

    for(int i=0; i<n; i++){
        a[i] = sc.nextInt();
    }
    int max =  Integer.MIN_VALUE;
    int min= Integer.MAX_VALUE;
    for(int i=0; i<n; i++){
       if(max<a[i]){
           max = a[i];
       }
    }
    for(int j=0; j<n; j++){
        if(a[j]<min){
            min = a[j];
        }
    }
        System.out.println(max);
        System.out.println(min);

    }

}
