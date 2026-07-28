package arrays;
import java.util.Arrays;
public class ProdOfArrayExceptSelf {
    static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result = prodOfArrExSelf(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] prodOfArrExSelf(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        left[0] = 1;
        right[arr.length-1] = 1;

        for(int i = 1; i < arr.length; i++) {
            left[i] = arr[i-1] * left[i-1];
        }
        
        for(int i = arr.length-2; i >= 0; i--) {
            right[i] = arr[i+1] * right[i+1];
        }
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }
}
