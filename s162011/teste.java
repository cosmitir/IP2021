import java.util.*;

public class teste
    {
        final static Scanner scanner = new Scanner(System.in);

        static
            {
                scanner.useLocale(Locale.ENGLISH);
            }

        static double factorial(int num)
            {
                return Math.pow(num, num) * Math.exp(0 - num) * Math.sqrt(((2 * num) + (1.0 / 3)) * Math.PI);
            }

        public static void main(String[] args)
            {
                int num;
                double fact;

                System.out.print("Digite um número >= 0 && <= 10: ");
                num = scanner.nextInt();

                if ((num >= 0) && (num <= 10))
                    {
                        while (num >= 0)
                            {
                                fact = factorial(num);
                                System.out.println(num + "! = " + fact);
                                num--;
                            }
                    }
            }
    }