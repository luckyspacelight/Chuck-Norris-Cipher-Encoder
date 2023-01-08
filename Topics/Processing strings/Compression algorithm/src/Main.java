import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] arString = inputString.split("");
        String encondedString = "";
        int count = 0;

        for (String theChar : arString) {
            if (encondedString.length() == 0) {
                encondedString = theChar;
                count++;
            } else {
                if (encondedString.substring(encondedString.length() - 1).equals(theChar)) {
                    count++;
                } else {
                    encondedString += count;
                    encondedString += theChar;
                    count = 1;
                }
            }
        }
        encondedString += count;
        System.out.println(encondedString);
    }
}