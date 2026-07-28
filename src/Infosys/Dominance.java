package Infosys;
import java.util.HashMap;
import java.util.Map;
public class Dominance {
    static void main(String[] args) {
        int[] arr = {2,3,2,4,2};
        int N = arr.length;
        int K = 2;
        dominanace(arr, N,K);
    }
    public static void dominanace(int[] arr, int  N, int  k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < N; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }else {
                map.put(arr[i], 1);
            }
        }
        int dominance = Integer.MIN_VALUE;
        int key = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > dominance) {
                dominance = entry.getValue();
                key = entry.getKey();
            }
        }
        System.out.println("The dominanace of" +  key + " = " + dominance);
    }
}
