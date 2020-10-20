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
                double distanciap;
                double consumom;
                double precoc;
                double consumo;

                System.out.println("\nCálculo do consumo de gasolina");
                System.out.println();

                System.out.print("Indique a distância percorrida: ");
                distanciap = scanner.nextDouble();
                System.out.print("Indique o consumo médio do carro (l/100km): ");
                consumom = scanner.nextDouble();
                System.out.print("Preço do combustível: ");
                precoc = scanner.nextDouble();

                consumo = massa / (altura * altura);

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
    }
