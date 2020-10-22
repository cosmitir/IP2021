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
                double preco;

                System.out.println("\nCálculo do consumo de gasolina");
                System.out.println();

                System.out.print("Indique a distância percorrida (em km): ");
                distanciap = scanner.nextDouble();
                System.out.print("Indique o consumo médio do carro (l/100km): ");
                consumom = scanner.nextDouble();
                System.out.print("Preço do combustível ($/litro): ");
                precoc = scanner.nextDouble();

                consumo = (consumom * distanciap) / 100;
                preco = consumo * precoc;

                System.out.print("O consumo do carro em " + distanciap + "km foi de " + consumo +"L.\nO preço do combustível gasto é de " + preco + " euros.");

            }
    }
