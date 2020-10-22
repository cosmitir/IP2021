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
                String message;

                System.out.println("\nCálculo de IMC");
                System.out.println();

                massa = readDouble("Indique a massa: ");
                altura = readDouble("Indique a altura: ");
                imc = imcC(massa, altura);
                message = imcM(imc);
                
                System.out.println("Resultado: " + message);
            }
        static double readDouble(String message)
            {
                System.out.print(message);
                return scanner.nextDouble();
            }
        static double imcC(double massa, double altura)
            {
                return massa / (altura * altura);
            }
        public static String imcM(double imc)
            {
                if (imc < 17)
                    {
                        return "Muito abaixo do peso.";
                    }
                else if (imc >= 17 && imc <= 18.49)
                    {
                        return "Abaixo do peso.";
                    }
                else if (imc >= 18.50 && imc <= 24.99)
                    {
                        return "Peso normal";
                    }
                else if (imc >= 25 && imc <= 29.99)
                    {
                        return "Acima do peso.";
                    }
                else if (imc >= 30 && imc <= 34.99)
                    {
                        return "Obesidade I";
                    }
                else if (imc >= 35 && imc <= 39.99)
                    {
                        return "Obesidade II (severa)";
                    }
                else
                    {
                        return "Obesidade III (mórbida)";
                    }
            }
    }