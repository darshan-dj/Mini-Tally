package tally1; 
import java.util.*;
public class Sell extends DisplayStock implements Runnable
{
	public void run()
	{
			
	}
	double sprice,snetprice,stotalprice,profit;
	String sname;
	int sqty;
	int incr=0;
	static double totalprofit=0;
		void read1()
		{

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the name of the product:");
        		sname=sc.nextLine();

		}	
	
		int check(Purchase p){
		int flag=0;
		if((sname).equalsIgnoreCase(p.pname))
       		{
			flag=1;
		}
		return flag;
		
		}
		int check1(Purchase p,int flags,int i){
		if(flags==1)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the quantity:");
        		sqty=sc.nextInt();
        		if(sqty<=p.pqty)
			{
				System.out.println("Enter the selling price:");
				sprice=sc.nextDouble();
				snetprice=sprice*sqty;
       				stotalprice+=sprice*sqty;
        			System.out.println("Net rate="+snetprice);
				p.pqty-=sqty;
				p.netprice=p.pqty*p.price;
				profit=(sprice-p.price)*sqty;
				totalprofit+=profit;
			}
			else
			{
				 System.out.println("\"Entered quantity is greater than stocked quantity\"");
					i--;
			}

		}
		else
		{
			System.out.println("\"Stock item not found\"");
			i--;			
		}
		
		return i;
		}
	
	
	void Bill(Sell s)
	{
		incr++;
		System.out.println("  "+incr+"\t "+s.sname+"\t "+s.sqty+"\t "+s.sprice+"\t "+s.snetprice+"\t ");
		System.out.println();
	}
	void BalanceSheet()
	{
		System.out.println("The total profit is:"+totalprofit);
	}
	
}
