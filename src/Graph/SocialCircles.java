package Graph;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
class Graph {
    HashMap<String, ArrayList<String>> adjList;
    public Graph() {
        adjList = new HashMap<>();
    }
    public void addStudent(String student) {
        adjList.putIfAbsent(student, new ArrayList<>());
    }
    public void addFriendship(String student1, String student2) {
        adjList.get(student1).add(student2);
        adjList.get(student2).add(student1);
    }
    public void printGraph(String[] students) {
        for(String student : students) {
            ArrayList<String> friends = adjList.get(student);
            Collections.sort(friends);
            System.out.print(student + ":");
            if(!friends.isEmpty()) {
                System.out.print(" ");
            }
            for(int i = 0 ; i < friends.size(); i++) {
                System.out.print(friends.get(i));

                if(i < friends.size() - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
public class SocialCircles {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] students = new String[n];
        Graph graph = new Graph();
        for(int i = 0 ; i < n; i++) {
            students[i] = sc.next();
            graph.addStudent(students[i]);
        }
        int m = sc.nextInt();
        for(int i = 0 ; i < m; i++) {
            String u = sc.next();
            String v = sc.next();
            graph.addFriendship(u,v);
        }
        graph.printGraph(students);
    }
}
