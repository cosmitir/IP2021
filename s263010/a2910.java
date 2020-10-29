import java.util.*;

public class a2910
    {
        final static Scanner scanner = new Scanner(System.in);
        static
            {
                scanner.useLocale(Locale.ENGLISH);
            }

        public static void main(String[] args)
            {
                int j = 0;
                int min;
                int max;
                int between;
                double rand;
                int guess;
                int right = 0;
                int wrong = 0;

                min = readInt("Mínimo = ");
                max = readInt("Máximo = ");

                for (int i = 0; i < 10; i++)
                    {
                        System.out.println("\nA gerar um número...");
                        rand = Math.random();
                        between = (int)(min + (max - min + 1) * rand);
                        while (j < 5)
                            {
                                System.out.println("\nTenta adivinhar o número: ");
                                guess = scanner.nextInt();
                                if (guess == between)
                                    {
                                        System.out.println("Acertaste!");
                                        right++;
                                        break;
                                    }
                                else
                                    {
                                        System.out.println("Erraste!");
                                        wrong++;
                                        j++;
                                    }
                            }
                    }
                System.out.println("\nAcertaste: " + right + "\nErraste: " + wrong);
            }
        static int readInt(String message)
            {
                System.out.print(message);
                return scanner.nextInt();
            }
    }
