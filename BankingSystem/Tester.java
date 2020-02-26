/**
 * Created by Kaishini Ragumar
 */
package BankingSystem;
import java.util.Scanner;
import java.util.*;
public class Tester implements Welcome {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		userInputSimulator();
	}
	 public static void userInputSimulator(){
		 System.out.println(welcome+ " Would you like to make an account with us?");
		 System.out.println("1: Yes!");
		 System.out.println("2: No thank you!");
		 int reply  = getNum();
		 while(reply!=1&&reply!=2) {
			 System.out.println("That isn't an option. Please try again.");
			 reply = getNum();
		 }
		 if(reply==2) {
			 System.out.println("Ok! Have a good day!");
		 }else if(reply==1) {
			 System.out.println("Great! Please enter your name: ");
			 String name = sc.next();
			 System.out.println("Welcome "+name+"! Please create a username: ");
			 String user = sc.next();
			 System.out.println("Please enter a password: ");
			 String pw = sc.next();
			 System.out.println("Please re-enter to confirm");
			 String cpw = sc.next();
			 while(!(cpw.equals(pw))) {
				 System.out.println("Passwords do not match. Please try again: ");
				 cpw = sc.next();
			 }
			 System.out.println("Thank you, "+name+".");
			 Personal check = null;
			 Personal save = null;
			 
	         check = new Personal(user, pw);
			 check.setAcctNum("660245842");
			 System.out.println("Let’s create your checking account first. Your "
			+ "account number will be 660245842. A minimum deposit of $25 must be made today.");
			System.out.println("Will it be: ");
			System.out.println("1. Check");
			System.out.println("2. Cash");
		    int type = getNum();
			while(type!=1&&type!=2) {
				System.out.println("You have made an invalid entry, please try again.");
				type = getNum();
			}
			System.out.println("Please enter the amount: ");
	        double firstDep = getDouble();
			while(firstDep<25) {
				 System.out.println("The minimum deposit is $25.00, please enter a new amount.");
			     firstDep = getDouble();
			}
		    if(type==1) {
			  check.firstDep("Check Deposit                  ", firstDep); 
			}else if(type==2) {
			  check.firstDep("Cash Deposit                   ", firstDep);
			}
			  save = new Personal(user, pw);
		      save.setAcctNum("600234985");
		      System.out.println("Now let's create your savings account will be made now. Your account number will 6002349856. "
			+ "The savings account must always maintain a minimum of $100.");
		      System.out.println("Will it be: ");
			  System.out.println("1. Check");
			  System.out.println("2. Cash");
			  type = sc.nextInt();
			  while(type!=1&&type!=2) {
				  System.out.println("You have made an invalid entry, please try again.");
				  type = getNum();
			  }
			  System.out.println("Please enter the amount: ");
			  firstDep = getDouble();
			  while(firstDep<100) {
				  System.out.println("The minimum deposit is $100.00, please enter a new amount.");
				  firstDep = getDouble();
			  }
			  if(type==1) {
				  save.firstDep("Check Deposit                  ", firstDep); 
			  }else if(type==2) {
				  save.firstDep("Cash Deposit                   ", firstDep);
			 }
			  
			  System.out.println("Uh oh! Our system has crashed. Please log in again:");
			  System.out.print("Username: ");
			  String logU = sc.next();
			  System.out.print("Password: ");
			  String logP = sc.next();
			  boolean ans = check.goodUser(logU);
			  boolean pass = check.goodPw(logP);
			  while(ans!=true||pass!=true) {
				  System.out.println("Username or Password incorrect, please try again: ");
				  System.out.print("Username: ");
				  logU = sc.next();
				  System.out.print("Password: ");
				  logP = sc.next();
				  ans = check.goodUser(logU);
				  pass = check.goodPw(logP);
				  }
			  
			  System.out.println(" ");
			  System.out.println("Welcome back "+name+"!");
			  System.out.println(" ");
			  
			  int select;
			  boolean flag=false;
			  while (!flag){
	        	displayMenu();
	            select=getNum();
	            switch (select){
	            case 1:
                   System.out.println("Deposit to: ");
                   System.out.println("1. Checking");
                   System.out.println("2. Savings");
                   int dep = getNum();
                   while(dep!=1&&dep!=2) {
						 System.out.println("You have made an invalid entry, please try again.");
						 dep = getNum();
					 }
                   System.out.println("Please enter the amount: ");
                   double depAmt=getDouble();
                   while(dep<0) {
                	   System.out.println("You have made an invalid entry, please try again.");
						 dep = getNum();
                   }
                   if(dep==1) {
                	   check.regDep(depAmt);
                   }else if(dep==2) {
                	   save.regDep(depAmt);
                   }
                   System.out.println(" ");
                   System.out.println("Deposit of $"+depAmt+" has been made.");
                   System.out.println(" ");
                    break;
                case 2:
                	System.out.println("Withdraw from: ");
                    System.out.println("1. Checking");
                    System.out.println("2. Savings");
                    dep = sc.nextInt();
                    while(dep!=1&&dep!=2) {
 						 System.out.println("You have made an invalid entry, please try again.");
 						 dep = sc.nextInt();
 					 }
                    System.out.println("Please enter the amount: ");
                    depAmt=sc.nextDouble();
                    while(dep<0) {
                 	   System.out.println("You have made an invalid entry, please try again.");
 						 dep = sc.nextInt();
                    }
                    if(dep==1) {
                 	   check.regWD(depAmt);
                 	   check.checkAcct();
                    }else if(dep==2) {
                 	   save.regWD(depAmt);
                 	   save.checkSave();
                    }
                    System.out.println(" ");
                    System.out.println("Withdrawal of $"+depAmt+" has been made.");
                    break;
                case 3:
                	System.out.println("Transfer from: ");
                    System.out.println("1. Checking to Savings");
                    System.out.println("2. Savings to Checking");
                    dep = sc.nextInt();
                    while(dep!=1&&dep!=2) {
 						 System.out.println("You have made an invalid entry, please try again.");
 						 dep = sc.nextInt();
 					 }
                    System.out.println("Please enter the amount: ");
                    depAmt=sc.nextDouble();
                    while(dep<0) {
                 	   System.out.println("You have made an invalid entry, please try again.");
 						 dep = sc.nextInt();
                    }
                    if(dep==1) {
                 	   check.transfer(save,depAmt);
                 	   check.checkAcct();
                    }else if(dep==2) {
                 	   save.transfer(check, depAmt);
                 	   save.checkSave();
                    }
                    System.out.println(" ");
                    
                	
                    break;
                case 4: 
                	System.out.println("See transaction for: ");
                    System.out.println("1. Checking");
                    System.out.println("2. Savings");
                    dep = sc.nextInt();
                    while(dep!=1&&dep!=2) {
 						 System.out.println("You have made an invalid entry, please try again.");
 						 dep = sc.nextInt();
 					 }
                    if(dep==1) {
                 	   check.display();
                    }else if(dep==2) {
                 	   save.display();
                    }
                	
                	break;
                case 5: 
                	System.out.println("Check balance for: ");
                    System.out.println("1. Checking");
                    System.out.println("2. Savings");
                    dep = sc.nextInt();
                    while(dep!=1&&dep!=2) {
 						 System.out.println("You have made an invalid entry, please try again.");
 						 dep = sc.nextInt();
 					 }
                    if(dep==1) {
                 	   System.out.println("Balance for Checking Account#"+check.getAcctNum()+" $"+check.getBalance());
                    }else if(dep==2) {
                    	System.out.println("Balance for Savings Account#"+save.getAcctNum()+" $"+save.getBalance());
                    }
                	break;
                case 6:
                	System.out.println(" ");
                	System.out.println("Logging out, "+check.getUsername()+".");
                	System.out.println("Thank you for banking with OOP Bank!");
                	check.goodbye();
                    flag=true;
                    break;
                	
               default:
                    System.out.println("Please enter a valid range from 1-6");
	            }
			  }
		 }
	 }
	 
	 /**
	  * 
	  * Static methods
	  * 
	  */
	 
	 
	 /**
	  * 
	  * Try/Catch Blocks for invalid inputs
	  */
	 public static int getNum(){
		  while (true)
		  {
		   try
		   {
		    return sc.nextInt();
		   }
		   catch (InputMismatchException e)
		   {
		    sc.next();
		    System.out.print("That is not a valid entry. "
		     + "Please try again: ");
		   }
		  }
	 }
	 public static double getDouble(){
		  while (true)
		  {
		   try
		   {
		    return sc.nextDouble();
		   }
		   catch (InputMismatchException e)
		   {
		    sc.next();
		    System.out.print("That is not a valid entry. "
		     + "Please try again: ");
		   }
		  }
	 }
	 public static String getString(){
		  while (true)
		  {
		   try
		   {
		    return sc.next();
		   }
		   catch (InputMismatchException e)
		   {
		    sc.next();
		    System.out.print("That is not a valid entry. "
		     + "Please try again: ");
		   }
		  }
	 }

	public static void displayMenu() {
		System.out.println(" ");
        System.out.println("What can I help you with?");

        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Transfer");
        System.out.println("4. See Transaction History");
        System.out.println("5. Check balance(s)");
        System.out.println("6. Log out");
    }

}
