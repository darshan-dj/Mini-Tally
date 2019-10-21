package tally1;
import java.util.*;

public class Purchase implements Runnable{
       String pname;
    static double totalprice;
    double netprice;
    int pqty;
    double price;static int count=0;

    public void read()

    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the product:");
        pname=sc.nextLine();
        System.out.println("Enter the quantity:");
        pqty=sc.nextInt();
        System.out.println("Enter the rate per piece: ");
        price=sc.nextDouble();

    }
    public void calculate()
    {
       netprice=price*pqty;
       totalprice+=price*pqty;
        System.out.println("Net rate="+netprice);count++;
    }
   
    
}




