package Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int target = sc.nextInt();
        int []arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        boolean flag = true;
        for(int i=0; i<n; i++) {
            if(arr[i] == target){
                flag = true;
            }
            else{
                flag = false;
            }
        }
        System.out.print(flag);
    }
}
