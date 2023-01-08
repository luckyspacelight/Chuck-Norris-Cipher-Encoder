import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch(number) {
            case 0:
                System.out.println("do not move");
                break;
            case 1:
                System.out.println("move up");
                break;
            case 2:
                System.out.println("move down");
                break;
            case 3:
                System.out.println("move left");
                break;
            case 4:
                System.out.println("move right");
                break;
            default:
                System.out.println("error!");
                break;
        }

        System.out.println(1 + 1 + "2" + 2);
        System.out.println(2 + 2 + "2");
        System.out.println("2" + 2 + 2);
        System.out.println("2" + 2 + 1 + 1);

    }
}