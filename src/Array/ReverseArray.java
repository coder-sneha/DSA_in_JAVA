package Array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int i=0, j= n-1;
        int temp;
        while(i<=j){
            temp= arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k=0; k<n; k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

}
