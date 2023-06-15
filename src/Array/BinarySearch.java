package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int search(int a[], int key){
        int start = 0, end = a.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(a[mid] == key){
                return mid;
            }else if(a[mid]< key){         //right
                start = mid +1;
            }else{                      // left
                end = mid -1;
            }
        }
        return -1;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        Arrays.sort(a);
        int result = search(a, key);
        System.out.println(result);


    }
}
