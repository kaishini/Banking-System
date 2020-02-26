/**
 * Created by Kaishini Ragumar 
 */
package BankingSystem;
import java.util.ArrayList;

public class Business extends Account{
	ArrayList<String> transactionHist;
	ArrayList<Double> transactionAmt;
	double balance;
	public Business(String userName, String pw){
		super(userName, pw);
		transactionHist = new ArrayList<String>();
		transactionAmt = new ArrayList<Double>();
		balance = 0;
	}

	
	public Business() {
		super();
	}
	
	public void wdFee(double wd) {
		withdraw(wd*.05);
	}
	
	public void businessDep(int wd) {
		deposit(wd);
		addTrans("Deposit       ",wd);
	}
	
	/**
	 * Overriding
	 */
	public void goodbye() {
		System.out.println("Thank you for trusting us with your business!");
	}
	public void businessDep(double wd) {
		deposit(wd);
		addTrans("Deposit       ",wd);
	}
	
	public void withdrawal(double amt) {
		withdraw(amt);
		checkAmt();
		addTrans("Withdrawal    ",amt);
		if(amt>9999) {
			wdFee(amt);
			addTrans("Withdrawal Fee", amt*.05);
		}
	}
	public void checkAmt() {
	if(getBalance()<0) {
		withdraw(100);
		addTrans("Overdraft Fee ", 100);
	}
	}
	public void display() {
		super.firstDisplay();
		System.out.println("Current Balance: $"+getBalance());
	}
	
}
