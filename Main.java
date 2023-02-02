import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        bubbleSort(new int[]{3, 2, 1});
    }

    public static void bubbleSort(int[] arr) {
        while (!arr.sorted()) {
            
        }

        System.out.println(Arrays.toString(arr));
        // Complete code here
    }
    public static boolean sorted(int[] arr){
        boolean output = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                output = false;
            }
        }
        return output;
    }
}