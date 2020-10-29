import java.util.*;

public class a2710c
    {
        final static Scanner scanner = new Scanner(System.in);
        static
            {
                scanner.useLocale(Locale.ENGLISH);
            }

        public static void main(String[] args)
            {   
                int[] notas = new int[6];
                int base = 0;
                
                while (base < 6)
                    {  
                        notas[base] = readNota("Nota: ");
                        if (notas[base] >= 10)
                            {
                                System.out.println("Nota aprovada!");
                            }
                        else
                            {
                                System.out.println("Nota reprovada!");
                            }
                        base = base + 1;
                    }
            }
        static int readNota(String message)
            {
                System.out.print(message);
                return scanner.nextInt();
            }
    }
