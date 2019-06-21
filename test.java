import java.util.Scanner;

public class java{
    public static void main(String[] args){
        
        byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        String g;

        Scanner input_ = new Scanner(System.in);

        System.out.print("Byte: ");
        a = input_.nextByte();

        System.out.print("Short: ");
        b = input_.nextShort();

        System.out.print("Int: ");
        c = input_.nextInt();

        System.out.print("Long:");
        d = input_.nextLong();

        System.out.print("Float: ");
        e = input_.nextFloat();

        System.out.print("Double: ");
        f = input_.nextDouble();

        System.out.print("String:");
        g = input_.nextLine();


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);


    }
}