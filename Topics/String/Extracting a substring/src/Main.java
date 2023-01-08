import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String strPhrase = sc.nextLine();
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        String strResult = strPhrase.substring(firstNumber, secondNumber + 1);
        System.out.println(strResult);
    }
}