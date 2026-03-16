import java.util.Scanner;

class product
{
    int pcode;
    String pname;
    double price;

    public product(int pc, String pn, double pr)
    {
        pcode = pc;
        pname = pn;
        price = pr;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int pc;
        String pn;
        double pr;

        System.out.println("Enter details of product 1 (code name price):");
        pc = sc.nextInt();
        pn = sc.next();
        pr = sc.nextDouble();
        product p1 = new product(pc, pn, pr);

        System.out.println("Enter details of product 2 (code name price):");
        pc = sc.nextInt();
        pn = sc.next();
        pr = sc.nextDouble();
        product p2 = new product(pc, pn, pr);

        System.out.println("Enter details of product 3 (code name price):");
        pc = sc.nextInt();
        pn = sc.next();
        pr = sc.nextDouble();
        product p3 = new product(pc, pn, pr);

        product low = p1;

        if (p2.price < low.price)
            low = p2;
        if (p3.price < low.price)
            low = p3;

        System.out.println("Lowest price product : " + low.pname);
    }
}

