
import java.util.*;

/** Este template foi criado na 
 * Escola Superior de Tecnologia e Gestão do
 * Instituto PolitÈcnico de Beja
 * em 2016/09/29
 * -----------------------------------------------------
 * Adicione aqui uma descrição da classe, o seu nome e a data
 * @author (o seu nome) 
 * @version (número de versão ou data)
 * 
 * O programa deve ser escrito em inglês.
 */
public class a1310
{

    // inicia
    final static Scanner scanner = new Scanner(System.in);
    static { scanner.useLocale(Locale.ENGLISH); }

    public static void main(String[] args)
    {
        // aqui é onde deve escrever o seu código
        // eis um código de exemplo
        System.out.println("IPB-ESTIG");
        System.out.println();
        //System.out.printf("número inteiro: %d; número real: %f, carácter: %c; " +
        //    "muda de linha %n texto: %s %n %n", 47, 12.33, 'a', "um texto");  
        System.out.print("Indique um número: ");
        int i = scanner.nextInt();
        System.out.print("Indique outro número: ");
        int l = scanner.nextInt();
        int j = i+l;
        System.out.println("O seu número é " + j);
    }
}
