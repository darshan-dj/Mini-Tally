package tally1;
import java.util.*;
public class Tally1 {

    public static void main(String[] args) {
        int z=0;String cname,date;int bill_no=0;
        Scanner sc=new Scanner(System.in);
        int ch,n=0,h;
        String c;
        Purchase p[]=new Purchase[100];
	Sell s[]=new Sell[100];
	Sell s1=new Sell();
        int x=0;int w=0;
        
       do{

        System.out.println("1.Purchase\n2.Sell\n3.Display Stock\n4.Balance Sheet\n0.EXIT\nEnter your choice:");

        ch=sc.nextInt();

        switch(ch)

        {

            case 1:System.out.println("Enter the number of products you want to purchase:");n=sc.nextInt();
                
                      
                for (int i = x-z;i<n+x-z; i++) 
                {
                    p[i]=new Purchase();
                       p[i].read();
                       p[i].calculate();
                } 
                x=n+x;
                   break;
            
            case 2:
                
                System.out.println("Enter the customer name:");
		cname=sc.next();
		System.out.println("Enter the date:(DD/MM/YYYY)");
		date=sc.next();	
              	System.out.println("Enter the number of products you want to sell:");int m=sc.nextInt();
              	 for(int i=0;i<m;i++)          
                 {
                 	int flags=0;
                 	s[i]=new Sell();s[i].read1();
                 	for(h=0;h<Purchase.count;h++)
                 	{
                 		flags=s[i].check(p[h]);
                 		if(flags==1) break;
                 	}
                 	i=s[i].check1(p[h],flags,i);
                 }
            
		bill_no++;
		System.out.println("= = = = =  = = = = = = = = = = = = = = BILL= = = = = = = = = = = = = = = = = = =\n\n");
		System.out.print("CUSTOMER NAME:\t\t\t\t\t\tSELLER ADDRESS\n");
		System.out.print(cname+"\t\t\t\t\t\t\tHARSH INFOTECH\n");
		System.out.print("BILL NO:\t\t\t\t\t\tABID HOUSE\n");
		System.out.print("HI/15-16/0"+bill_no+"\t\t\t\t\t\t5A/6,1st FLOOR\n");
		System.out.print("BILL DATE:\t\t\t\t\t\tMUMBAI-07\n");
		System.out.print(date+"\t\t\t\t\t\tTEL NO.-67470770\n\n");
		System.out.print("SR NO.\tPRODUCTS\tQTY\tRATE\tNET_PRICE\n");
		for(int i=0;i<m;i++)
		{
			s1.Bill(s[i]);
		}
		break;
            case 3:System.out.println("\t\tSTOCK ITEMS\n Product_Name  Quantity  Price  Net price\n");
            for(int i=0;i<Purchase.count;i++)
            {
                 DisplayStock ds =new DisplayStock();                    
                for(int j=i+1;j<Purchase.count-z;j++)
                {
                    int T=ds.sortStock(p[i],p[j]);
                    if(T==1)
                    {
                          z++;
                           for(int k=j;k<(Purchase.count-z);k++)
                                   {
					
                                     ds.interchange(p[k],p[k+1]); 
                                    
                                   }
                                   
                    }
			
                }
                        
            }
                for (int i = 0; i <(Purchase.count-z); i++) {
                   DisplayStock ds =new DisplayStock();
                    ds.displayStock(p[i]);
                }
                System.out.println("The total price of "+Purchase.count+" products is:"+Purchase.totalprice);
        	break;
        case 4:s1.BalanceSheet();break;
        case 0:break;
                }
        }while(ch!=0);
    }  
}
    
    


