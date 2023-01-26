//Making user Interface
import java.io.*;
import java.util.Scanner;
class ATMdemo
{     
public static void main(String arg[])
{

int total;
int withdrow;
int deposite;
int balence;
int choice;
int pin;
int password;
int bal;
   Scanner s1=new Scanner(System.in);
   System.out.println("------------------------------------------------");
   System.out.print("Enter User id/pin :");
   pin=s1.nextInt();
   System.out.print("enter Password    :");
   password=s1.nextInt();
   System.out.println("---------------Successfully Matched--------------");
   System.out.println("Enter U'r total Ammount	:");
   total=s1.nextInt();
while(true)
{
   System.out.println("-------ATM Machin-------");
   System.out.println("Press :");
   System.out.println("1.Withdrow U'r Ammount");
   System.out.println("2.Deposite U'r Ammount");
   System.out.println("3.Check U'r Total Baleance");
   System.out.println("--------------------------------------------------");
   System.out.println("Enter any one choice	");
   choice=s1.nextInt();
   		switch(choice)
   		{
        case 1:

 		System.out.println("You have selected Withdrow U'r Ammount");
		System.out.println("Enter cash to Withdrow	:");
        withdrow=s1.nextInt();
		if(total >= withdrow)
		{
		bal=total-withdrow;
       System.out.println("Oldest Ammount	 :"+total+"rs\n Your Account has been Debited by :"+bal+"rs");
       }
       else
		System.out.println("U'r Baleance is not available for Withdrow"+withdrow+"rs.");

		break;
		case 2:
		
 		System.out.println("You have selected Deposite U'r Ammount");
        System.out.println("Enter cash to Deposit	:");
        deposite=s1.nextInt();
        bal=total+deposite;
       System.out.println("Oldest Ammount	 :"+total+"rs\n Your Account has been Debited by :"+bal+"rs");
        
 		break;
		case 3 :
	    System.out.println("You have selected check U'r total Ammount");			
    	break;

		default:

        
		}


        System.out.println("---------------Thank You---------------------");

 }
}
}
 
