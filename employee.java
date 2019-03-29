import java.util.*;
public class employee {
	
	
	public static void main(String args[]){
		
		Scanner intype = new Scanner(System.in);
		System.out.println("please select  type  of employee (1,2 or3)"); 
		System.out.println("1. montly employee"); 
		System.out.println("2.houly  employee"); 
		System.out.println("3.weekly employee"); 
         int type = intype.nextInt();
         
         
         
         if (type==1) {
		
		
		
		
		
		
		
		 Montly p=new  Montly();
		 
		 
		 System.out.println("please enter your montly salary"); 
		 p.montly_gross = intype.nextFloat();
		
		 p. montly_net = p.montly_gross- (p.montly_gross*90/1000);
		 
		 
        System.out.println("Programmer salary is:"+p.montly_net); 
        
        
        intype.close();
         
     }  
         
         else if (type==2)  {
        	 Daily p= new   Daily();
        	 System.out.println("please enter your number of ours"); 
        	 p.number_hours = intype.nextFloat();
        	 System.out.println("please enter your payment per   ours"); 
        	 p.hour_payment = intype.nextFloat();
        	 
        	 
        	 if (p.number_hours > 40 ) {
        		 
        		 p.bonus= (p.number_hours-40)*10/100;
        		 
        		 p.houly_payment = p.bonus+ ( p.number_hours*p.hour_payment );
        	 
        	 System.out.println("your daily payment is:"+p.houly_payment); 
        	 
        	 }
        	 
        	 else { p.houly_payment =  ( p.number_hours*p.hour_payment );
        	 
        	 System.out.println("your daily payment is:"+p.houly_payment);}
         
         }
         
         else if (type==3)  {
        	 
        	Weekly  p= new Weekly();
        	
        System.out.println("please enter your number of weeks"); 
       	 p.number_weeks = intype.nextFloat();
       	 System.out.println("please enter your weekly payment"); 
       	 p.week_payment = intype.nextFloat();
        	 
       	p.weekly_payment =  ( p.number_weeks*p.week_payment ); 
     
        	 
       	System.out.println("your  payment is:"+p.weekly_payment); }
         else    {System.out.println("invalid type"); }
	
	}
	
	
	
	
	 
	
	 
	
}


class Employe{  
    float montly_gross;  
    float montly_net;
    float houly_payment;
    float number_hours;
    float hour_payment;
    float bonus;
    float week_payment;
    float weekly_payment;
    
    float number_weeks;
    
   }  
   class Montly extends Employe{  
    // class for montly employee
    
   }  
   
   
   class Weekly extends Employe{  
	   
	   // class for weekly employee
	   
	    
	   }  
   class Daily extends Employe{ 
	   // class for daily employee
	    
	   }  

