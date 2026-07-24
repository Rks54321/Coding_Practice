package Graph;
import java.util.HashMap;
import java.util.ArrayList;
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
            
        }
    }
}
public class SocialCircles3 {
    static void main(String[] args) {

    }
}
