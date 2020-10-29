import java.util.*;

public class a2710b
    {
        final static Scanner scanner = new Scanner(System.in);
        static
            {
                scanner.useLocale(Locale.ENGLISH);
            }

        public static void main(String[] args)
            {   
                int nota1;
                int nota2;

                nota1 = readNota("Nota 1: ");
                nota2 = readNota("Nota 2: ");

                if (nota1 < nota2)
                    {
                        System.out.println("A nota mais alta é: " + nota2);
                    }
                else
                    {
                        System.out.println("A nota mais alta é: " + nota1);
                    }
            }
        static int readNota(String message)
            {
                System.out.print(message);
                return scanner.nextInt();
            }
    }
