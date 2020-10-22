import java.util.*;

public class a2210
    {
        final static Scanner scanner = new Scanner(System.in);
        static
            {
                scanner.useLocale(Locale.ENGLISH);
            }

        public static void main(String[] args)
            {
                System.out.println("Exchange variables value with '+' and '-'.");

                double a = 7;
                double b = 9;

                a = a - b;
                b = a + b;
                a = b - a;

                System.out.print("a = " + a + "\nb = " + b);
            }
    }
