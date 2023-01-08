import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reverseString = "";

        for (int i = 0; i < input.length(); i++) {
            reverseString  = input.charAt(i) + reverseString;
        }

        String isPalindrome = input.equals(reverseString) ? "yes" : "no";
        System.out.println(isPalindrome);
    }
}
