
import java.util.*;

public class a1510
    {
        final static Scanner scanner = new Scanner(System.in);
        static
            {
                scanner.useLocale(Locale.ENGLISH);
            }

        public static void main(String[] args)
            {
                double valor1;
                double valor2;
                double soma;
                double diferenca;
                double multiplicacao;
                double divisao;
                double elevado;
                double arear;
                double perimetror;
                double areac;
                double perimetroc;
                double forca;
                double aceleracao;
                double deltav;
                double deltat;
                double velocidadef;
                double velocidadei;
                double tempof;
                double tempoi;
                double nota;
                double teste1;
                double teste2;
                double exame;

                System.out.println();
                System.out.print("\nvalor1 = ");
                valor1 = scanner.nextDouble();
                System.out.print("valor2 = ");
                valor2 = scanner.nextDouble();

                soma = valor1 + valor2;
                diferenca = valor1 - valor2;
                multiplicacao = valor1 * valor2;
                divisao = valor1 / valor2;
                elevado = Math.pow(valor1, valor2);
                arear = multiplicacao;
                perimetror = 2 * (soma);
                areac = Math.PI * Math.pow(valor1, 2);
                perimetroc = 2 * Math.PI * valor1;
                forca = multiplicacao;

                System.out.println();
                System.out.println("Estes são os resultados obtidos:\n |Soma: valor1 + valor2 = " + soma + "\n |Diferença: valor1 - valor2 = " + diferenca + "\n |Multiplicação: valor1 * valor2 = " + multiplicacao + "\n |Divisão: valor1 % valor2 = " + divisao + "\n |Elevado: valor1 ^ valor2 = " + elevado);
                System.out.println();
                System.out.println("Imaginando um retângulo com os valores inseridos [valor1 = b (base), valor2 = h (altura)]:\n |Área: b * h = " + arear + "\n |Perímetro: 2 * (b + h) = " + perimetror);
                System.out.println();
                System.out.println("Imaginando um círculo com os valores inseridos [valor1 = r (raio)]:\n |Área: π * r ^ 2 = " + areac + "\n |Perímetro: 2 * π  * r = " + perimetroc);
                System.out.println();
                System.out.println("Imaginando uma força com os valores inseridos [valor1 = m (massa), valor2 = a (aceleração)]:\n |Força: m * a = " + forca);

                System.out.println();
                System.out.print("velocidadef = ");
                velocidadef = scanner.nextDouble();
                System.out.print("velocidadei = ");
                velocidadei = scanner.nextDouble();
                System.out.print("tempof = ");
                tempof = scanner.nextDouble();
                System.out.print("tempoi = ");
                tempoi = scanner.nextDouble();

                deltav = velocidadef - velocidadei;
                deltat = tempof - tempoi;
                aceleracao = deltav / deltat;

                System.out.println();
                System.out.println("Calculando a aceleração com os valores inseridos:\n |Aceleração: deltav / deltat = " + aceleracao);
            
                System.out.println();
                System.out.print("teste1 = ");
                teste1 = scanner.nextDouble();
                System.out.print("teste2 = ");
                teste2 = scanner.nextDouble();
                System.out.print("exame = ");
                exame = scanner.nextDouble();

                nota = Math.max(teste1, teste2) * 0.15 + Math.max(teste2, exame) * 0.15 + exame * 0.7;

                System.out.println();
                System.out.println("Nota final da disciplina dos valores inseridos:\n |Nota: max(teste1, teste2) * 0.15 + max(teste2, exame)* 0.15 + exame * 0.7 = " + nota);
            }
    }