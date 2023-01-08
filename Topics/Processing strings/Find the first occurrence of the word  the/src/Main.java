import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strSentence = scanner.nextLine();
        System.out.println(strSentence.toLowerCase().indexOf("the"));
    }
}