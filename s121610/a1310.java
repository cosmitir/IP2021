
import java.util.*;

public class a1310
    {
        final static Scanner scanner = new Scanner(System.in);
        static
            {
                scanner.useLocale(Locale.ENGLISH);
            }

        public static void main(String[] args)
            {
        System.out.println("IPB-ESTIG");
        System.out.println();
        System.out.print("Indicate a number: ");
        int i = scanner.nextInt();
        System.out.print("Indicate another number: ");
        int l = scanner.nextInt();
        int j = i+l;
        System.out.println("The sum of the numbers = " + j);
    }
}
