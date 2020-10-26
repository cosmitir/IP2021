import java.util.*;

public class a2710
    {
        final static Scanner scanner = new Scanner(System.in);
        static
            {
                scanner.useLocale(Locale.ENGLISH);
            }

        public static void main(String[] args)
            {   
                int amount;
                int discount;
                int price;

                amount = readAmount("Enter amount of purchases:");

                discount = amount * 1/10;
                price = amount - discount;

                System.out.print("Discounted price: " + price);
            }
        static int readAmount(String message)
            {
                System.out.print(message);
                return scanner.nextInt();
            }
    }
