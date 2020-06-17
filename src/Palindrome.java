public class Palindrome {
    public static void main(String args[]) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + "\t" + isPalindrome(args[i]));
        }
    }
    static String reverseString(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
    static boolean isPalindrome(String s) {
        if (s.equals(reverseString(s))) return true;
        return false;
    }
}
