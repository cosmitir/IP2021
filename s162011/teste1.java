import java.util.*;

public class teste1
    {
        final static Scanner scanner = new Scanner(System.in);

        static
            {
                scanner.useLocale(Locale.ENGLISH);
            }

        static int scan(String message)
            {
                System.out.print(message);
                return scanner.nextInt();
            }

        public static void main(String[] args)
            {
                int h1, h2, h, m = 0;

                System.out.println("Indique dois valores para horas: ");

                h1 = scan("1º valor = ");
                h2 = scan("2º valor = ");

                if ((h1 < 0) || (h1 > 23) || (h2 < 0) || (h2 > 23) || (h1 >= h2))
                    {
                        h1 = scan("1º valor = ");
                        h2 = scan("2º valor = ");
                    }

                for (h = h1; h < h2; h++)
                    {
                        for (m = 0; m < 60; m++)
                            {
                                System.out.println(h + ":" + m);
                            }
                    }
            }
    }