import java.util.*;

public class a2210b
    {
        final static Scanner scanner = new Scanner(System.in);
        static
            {
                scanner.useLocale(Locale.ENGLISH);
            }

        public static void main(String[] args)
            {   
                int a;
                int b;

                System.out.println("Exchange variables value with '^'.");

                int a = 7;
                int b = 9;

                a = a ^ b;
                b = a ^ b;
                a = a ^ b;

                System.out.print("a = " + a + "\nb = " + b);
            }
        static int readInt(String message)
            {
                System.out.print(message);
                return scanner.nextInt();
            }
    }
