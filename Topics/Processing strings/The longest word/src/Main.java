import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String result = "";
        String[] subStrings = inputString.split(" ");
        for (String subString : subStrings) {
            if (subString.length() > result.length()) {
                result = subString;
            }
        }
        System.out.println(result);
    }
}
