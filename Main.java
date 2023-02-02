import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        bubbleSort(new int[]{3, 2, 1});
    }

    public static void bubbleSort(int[] arr) {
        int temp;
        System.out.println(Arrays.toString(arr));
        while (!isSorted(arr)) { // repeats until the input array is sorted
            for (int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i+1]){
                    temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    // method to check if the array is sorted
    public static boolean isSorted(int[] arr){
        boolean output = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                output = false;
            }
        }
        return output;
    }
}