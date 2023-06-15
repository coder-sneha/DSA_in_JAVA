//WAP to remove all even element from the array

package Array;

import java.util.Scanner;

public class EvenRemove {
    public static int [] removeEven(int arr[]){
        int oddCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 !=0){
                oddCount++;
            }
        }
        int result[]= new int [oddCount];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 !=0){
                result[index]= arr[i];
                index++;
            }
        }
        return result;
    }
    public static void printArray(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        printArray(arr);
       int result[]= removeEven(arr);
       printArray(result);


    }

}
