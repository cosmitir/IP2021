import java.util.*;

public class a2010
    {
        final static Scanner scanner = new Scanner(System.in);
        static
            {
                scanner.useLocale(Locale.ENGLISH);
            }

        public static void main(String[] args)
            {
                double massa;
                double altura;
                double imc;
                
                System.out.println("\nCálculo de IMC");
                System.out.println();

                massa = readDouble("Indique a massa: ");
                altura = readDouble("Indique a altura: ");
                imc = imcC(massa, altura);

                if (imc < 17)
                    {
                        System.out.print("Muito abaixo do peso.");
                    }
                else if (imc >= 17 && imc <= 18.49)
                    {
                        System.out.print("Abaixo do peso.");
                    }
                else if (imc >= 18.50 && imc <= 24.99)
                    {
                        System.out.print("Peso normal");
                    }
                else if (imc >= 25 && imc <= 29.99)
                    {
                        System.out.print("Acima do peso.");
                    }
                else if (imc >= 30 && imc <= 34.99)
                    {
                        System.out.print("Obesidade I");
                    }
                else if (imc >= 35 && imc <= 39.99)
                    {
                        System.out.print("Obesidade II (severa)");
                    }
                else if (imc > 40)
                    {
                        System.out.print("Obesidade III (mórbida)");
                    }
            }
            public static double readDouble(String message)
                {
                    double a;
                    System.out.print(message);
                    a = scanner.nextDouble();
                    return a;
                }
            public static double imcC(double massa, double altura)
                {
                    double a;
                    a = massa / (altura * altura);
                    return a;
                }
    }
