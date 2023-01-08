import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.pow;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        //call your implemented methods here.
        double result = 0.0;
        if (x <= 0) {
            result = f1(x);
        } else if (0 < x && x < 1) {
            result = f2(x);
        } else if (x >= 1) {
            result = f3(x);
        }
        return result;
    }

    //implement your methods here
    public static double f1(double x) {
        return pow(x, 2) + 1;
    }

    public static double f2(double x) {
        return 1 / pow(x, 2);
    }

    public static double f3(double x) {
        return pow(x, 2) - 1;
    }
}
