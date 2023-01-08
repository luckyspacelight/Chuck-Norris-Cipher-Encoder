import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        final int number3 = 3;
        int first3Numbers = 0;
        int last3Numbers = 0;
        int tempNum = 0;

        for (int i = 0; i < input.length(); i++) {
            tempNum = Character.getNumericValue(input.charAt(i));
            if (i < number3) {
                first3Numbers += tempNum;
            } else {
                last3Numbers += tempNum;
            }
        }
        System.out.println(first3Numbers == last3Numbers ? "Lucky" : "Regular");
    }
}
