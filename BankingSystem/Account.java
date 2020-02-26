/**
 * Created by Kaishini Ragumar 
 */
package BankingSystem;

import java.util.ArrayList;

public class Account {
	
	private String user ;
	private String password;
	private double balance;
	
	ArrayList<String> transactionHist;
	ArrayList<Double> transactionAmt; 

	public Account(String userName, String pw) {
		user = userName;
		password = pw;
		balance = 0;
		transactionHist = new ArrayList<String>();
		transactionAmt = new ArrayList<Double>();	
	}
	
	public Account() {
		user = "";
		password = "";
		balance = 0;
	}
	
	public void setUsername(String user) {
		this.user = user;
	}
	
	/**
	 * Overriding
	 */
	public void goodbye() {
		System.out.println("Have a good day!");
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getUsername() {
		return user;
	}
	
	public void withdraw(double amt) {
		balance = balance - amt;
	}
	public void deposit(double amt) {
		balance = balance + amt;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void addTrans(String des, double amt) {
		transactionHist.add(des);
		transactionAmt.add(amt);
	}
	
	/**
	 * 
	 * Use of ArrayList
	 * 
	 */
	public void firstDisplay() {
		System.out.println("");
		System.out.println("Recent Transaction History");
		for(int i=0;i<transactionHist.size();i++) {
			System.out.println(transactionHist.get(i)+"     $"+transactionAmt.get(i));
		}
		System.out.println(" ");
	}
	
	

}
