import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateInput = scanner.nextLine();
        String[] dateElements = dateInput.split("-");
        final String day = dateElements[2];
        final String month = dateElements[1];
        final String year = dateElements[0];
        String dateOut = month + "/" + day + "/" + year;
        System.out.println(dateOut);
    }
}