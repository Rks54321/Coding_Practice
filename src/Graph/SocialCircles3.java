package Graph;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Graph3 {
    HashMap<String, ArrayList<String>> adjList;
    Graph3() {
        adjList = new HashMap<>();
    }
    public void addStudent(String student) {
        adjList.computeIfAbsent(student, k -> new ArrayList<>());
    }
    public void addFriendship(String student1, String student2) {
        adjList.get(student1).add(student2);
        adjList.get(student2).add(student1);
    }
    public void printGraph(String[] students) {
        for(String student : students) {
            ArrayList<String> stud = adjList.get(student);
            Collections.sort(stud);
            System.out.print(student + ":");
            if(!stud.isEmpty()) {
                System.out.print(" ");
            }
            for(int i = 0; i < stud.size(); i++) {
                System.out.print(stud.get(i));
                if(i < stud.size() - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
public class SocialCircles3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph3 graph = new Graph3();
        int n = sc.nextInt();
        String[] students = new String[n];
        for(int i = 0 ; i < n; i++) {
            students[i] = sc.next();
            graph.addStudent(students[i]);
        }
        int m = sc.nextInt();
        for(int i = 0 ; i < m ; i++) {
            String u = sc.next();
            String v = sc.next();

            graph.addFriendship(u, v);
        }
        graph.printGraph(students);
    }
}
