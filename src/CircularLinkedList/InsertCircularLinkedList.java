package CircularLinkedList;
import java.util.Scanner;
import java.util.Arrays;
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}
public class InsertCircularLinkedList {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        int[] arr;
        if(line.isEmpty()) {
            arr = new int[0];
        } else {
            String[] parts = line.split(",");
            arr = new int[parts.length];
            for(int i = 0 ; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i].trim());
            }
        }
        int x = Integer.parseInt(sc.nextLine());
        Node head = buildCircularList(arr);
        head = insertSorted(head, x);
        printCircularList(head);
    }
    public static Node buildCircularList(int[] arr) {
        if(arr.length == 0) return null;
        Arrays.sort(arr);
        Node head = new Node(arr[0]);
        Node tail = head;
        for(int i = 1; i < arr.length; i++) {
            tail.next = new Node(arr[i]);
            tail = tail.next;
        }
        tail.next = head;
        return head;
    }
    public static Node insertSorted(Node head, int x) {
        Node newNode = new Node(x);
        if(head == null) {
            newNode.next = newNode;
            return newNode;
        }
        Node curr = head;
        if(x <= head.val) {
            while(curr.next != head) {
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.next = head;
            return newNode;
        }
        curr = head;
        while(curr.next != head && curr.next.val < x) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }
    public static void printCircularList(Node head) {
        if(head == null) return;
        Node temp = head;
        do{
            System.out.print(temp.val);
            temp = temp.next;
            if(temp != head) {
                System.out.print(",");
            }
        } while(temp != head);
    }
}
