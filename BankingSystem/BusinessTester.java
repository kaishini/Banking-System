/**
 * Created by Kaishini Ragumar
 */
package BankingSystem;

public class BusinessTester implements Welcome {

	public static void main(String[] args) {
		Business millionaireCo = new Business("MillionaireCo", "Mc123");

		
		millionaireCo.businessDep(10000);
		millionaireCo.businessDep(1000);
		millionaireCo.businessDep(5000);
		millionaireCo.withdrawal(10000);
		millionaireCo.withdrawal(20000);
		millionaireCo.businessDep(75000);
		millionaireCo.withdrawal(15000);
		
		
		
		displayName();
		System.out.println("");
		System.out.println("Just as a reminder, there is a $10 overdraft fee and always a "
				+ "%5 fee for withdrawals "
				+"larger than $10,000");
		System.out.println("Let's take a look at your recent transaction history:"
				+ "");
		millionaireCo.display();
		System.out.println("");
		System.out.println("Have a nice day, Millionaire Company!");
		millionaireCo.goodbye();

		
	}
	public static void displayName() {
		System.out.println(welcome);
		System.out.println("Welcome back, Millionaire Company!");
		}
	}


