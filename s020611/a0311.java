import java.util.*;
public class a0311
    {
        final static Scanner scanner = new Scanner(System.in);
        static
            {
                scanner.useLocale(Locale.ENGLISH);
            }
        public static void main(String[] args)
            {
                int max, copy, i, z;
                System.out.print("Indica um número: ");
                max=scanner.nextInt();
                copy=max;
                for(i=max;i>=1;i--)
                    {
                        for(z=i;z>=1;z--)
                            {
                                System.out.print(" " + z);
                            }
                        copy=copy-1;
                        System.out.println();
                    }
            }
    }
