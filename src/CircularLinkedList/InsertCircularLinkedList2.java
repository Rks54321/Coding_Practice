package CircularLinkedList;
import java.util.Scanner;
class Nodee{
    int val;
    Nodee next;
    Nodee(int val) {
        this.val = val;
    }
}
public class InsertCircularLinkedList2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        int[] arr;
        if(line.isEmpty()) {
            arr = new int[0];
        } else {
            String[] parts = line.split(",");
            arr = new int[parts.length];
            for(int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i].trim());
            }
        }
        int x = Integer.parseInt(sc.nextLine().trim());
    }
}
