import java.util.*;

public class a2010b
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
                double preco;

                System.out.println("\nCálculo do consumo de gasolina");
                System.out.println();
                
                distanciap = readDouble("Indique a distância percorrida (km): ");
                consumom = readDouble("Indique o consumo médio do carro (l/100km): ");
                precoc = readDouble("Indique o preço do combustível (euros): ");

                consumo = consumoF(consumom, distanciap);
                preco = precoF(consumo, precoc);

                System.out.print("O consumo do carro em " + distanciap + "km foi de " + consumo +"L.\nO preço do combustível gasto é de " + preco + " euros.");
            }
        static double readDouble(String message)
            {
                System.out.print(message);
                return scanner.nextDouble();
            }
        static double consumoF(double consumom, double distanciap)
            {
                return (consumom * distanciap) / 100;
            }
        static double precoF(double consumo, double precoc)
            {
                return consumo * precoc;
            }
    }
