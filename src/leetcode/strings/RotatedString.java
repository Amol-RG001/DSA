package leetcode.strings;

public class RotatedString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(canTransform(s, goal)); // Output: true
    }

    static boolean canTransform(String s, String goal) {
        // Check if lengths are equal and goal is a substring of s concatenated with itself
        System.out.println((s + s));
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
