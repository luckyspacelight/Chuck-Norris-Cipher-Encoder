import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String strTest = scanner.nextLine();
        String[] strResults = strTest.split("");

        for (String subString : strResults) {
            System.out.print(subString + subString);
        }
    }
}