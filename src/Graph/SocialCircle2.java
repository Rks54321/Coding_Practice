package Graph;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Graph1 {
    HashMap<String, ArrayList<String>> students = new HashMap<>();

    public void addStudent(String student) {
        students.putIfAbsent(student, new ArrayList<>());
    }
    public void addFriendship(String student1, String student2) {
        students.get(student1).add(student2);
        students.get(student2).add(student1);
    }
    public void printGraph(String[] stud) {
        for(String student : stud) {
            ArrayList<String> studnt = students.get(student);
            Collections.sort(studnt);
            System.out.print(student + ":");
            if(!studnt.isEmpty()) {
                System.out.print(" ");
            }
            for(int i = 0 ; i < studnt.size(); i++) {
                System.out.print(studnt.get(i));
                if(i < studnt.size() - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
public class SocialCircle2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph();
        int n = sc.nextInt();
        String[] students = new String[n];
        for(int i = 0; i < n; i++) {
            students[i] = sc.next();
            graph.addStudent(students[i]);
        }
        int m = sc.nextInt();
        for(int i = 0 ; i  < m; i++) {
            String u = sc.next();
            String v = sc.next();

            graph.addFriendship(u,v);
        }
        graph.printGraph(students);
    }
}
