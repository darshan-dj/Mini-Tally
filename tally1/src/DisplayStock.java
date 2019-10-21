package tally1;


public class DisplayStock extends Purchase{
    public int sortStock(Purchase p,Purchase s)
    {
        
      
            if(p.pname.equalsIgnoreCase(s.pname))
            {
                p.pqty+=s.pqty;
                p.price=((p.price+s.price)/2);
                p.netprice=(p.netprice+s.netprice);
            return 1;    
            }
            else return 0;
        
    }
    
    public void interchange(Purchase p,Purchase s)
    {       
                        
                        p.pname=s.pname;
                        p.pqty=s.pqty;
                        p.price=s.price;
    }
    public void displayStock(Purchase p)
    {
        System.out.println(" "+p.pname+"\t\t"+p.pqty+"\t"+p.price+"\t"+p.netprice+"\n");
    }

   
}




