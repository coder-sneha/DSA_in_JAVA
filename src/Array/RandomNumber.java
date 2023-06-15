package Array;

public class RandomNumber {
    public static void main(String[] args) {
        int size = 6;
        int arr[] = new int[size];

        //genrate random numbers b/w 5 and 50(including 50
        int start = 5;
        int end = 50;
        int sizeOfRange = end - start +1;
        for(int i=0; i<size; i++ ){
            int randomNumber =(int) (Math.random() * sizeOfRange) + start;
            arr[i] = randomNumber;
        }
        for(int i=0; i<size; i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
