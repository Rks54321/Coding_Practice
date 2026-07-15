package strings;

public class FirstOccurence2 {
    static void main(String[] args) {
        String haystack = "sadbutsads";
        String needle = "sad";
        System.out.println(firstOccurence(haystack, needle));
    }
    public static int firstOccurence(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

}
