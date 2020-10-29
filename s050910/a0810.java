
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
                String ans = "";
                
                System.out.println();
                System.out.println("\nSecond degree polynomials calculator");
                do
                    {
                        System.out.println("/--------");
                        a = readDouble("| a | ");
                        System.out.println("|--------");
                        b = readDouble("| b | ");
                        System.out.println("|--------");
                        c = readDouble("| c | ");
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
                                        System.out.println("x1 = " + x1 + "\nx2 = " + x2);
                                    }
                            }
                        else
                            {
                                System.out.println();
                                System.out.println("Delta = " + delta + ", impossible to calculate square roots of negative numbers!");
                            }
                        System.out.println("Repeat? (y/n)");
                        ans = scanner.next();
                    } while (ans.equals("y"));
            }
        static double readDouble(String message)
            {
                System.out.print(message);
                return scanner.nextDouble();
            }
    }