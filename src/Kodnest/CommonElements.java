package Kodnest;
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
public class CommonElements {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr1 = sc.nextLine().trim().split(",");
        String[] arr2 = sc.nextLine().trim().split(",");
        HashSet<Integer> set = new HashSet<>();
        for(String x : arr2) {
            set.add(Integer.parseInt(x));
        }
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        for(String x : arr1) {
            int num = Integer.parseInt(x);
            if(set.contains(num)) {
                res.add(num);
                seen.add(num);
            }
        }
        System.out.println("Common Elements: " + res);
    }

}
