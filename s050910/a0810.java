
import java.util.*;

public class a0810
    {
        final static Scanner scanner = new Scanner(System.in);
        static
            {
                scanner.useLocale(Locale.ENGLISH);
            }

        public static void main(String[] args)
            {
                double a;
                double b;
                double c;
                double delta;
                double x1;
                double x2;
                
                System.out.println();
                System.out.println("\nCalculadora de raízes quadradas.");
                System.out.println("/--------");
                System.out.print("| a | ");
                a = scanner.nextDouble();
                System.out.println("|--------");
                System.out.print("| b | ");
                b = scanner.nextDouble();
                System.out.println("|--------");
                System.out.print("| c | ");
                c = scanner.nextDouble();
                System.out.println("--------/");
                
                delta = Math.pow(b,2)-(4*a*c);
                
                if (delta >= 0)
                    {
                        x1 = (-b+Math.sqrt(delta))/2*a;
                        x2 = (-b-Math.sqrt(delta))/2*a;
                        if (x1 == 0 || x2 == 0)
                            {
                                if (x1 == 0)
                                    {
                                        System.out.println();
                                        System.out.print("x = " + x1);
                                    }
                                else
                                    {
                                        System.out.println();
                                        System.out.print("x = " + x2);
                                    }
                            }
                        else
                            {
                                System.out.println();
                                System.out.print("x1 = " + x1 + "\nx2 = " + x2);
                            }
                    }
                else
                    {
                        System.out.println();
                        System.out.print("Delta = " + delta + ", ímpossivel calcular raízes de números negativos!");
                    }
            }
    }