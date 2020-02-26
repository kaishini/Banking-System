/**
 * Created by Kaishini Ragumar 
 */
package BankingSystem;
/**
 * Use of inheritance
 */
public class Personal extends Account{
	private String acctNum;
	public Personal(String userName, String pw){
		super(userName, pw);
		acctNum="";
	}
	public Personal() {
		super();
	}
	
	public void transfer(Personal add, double amt) {
		add.deposit(amt);
		add.addTrans("Transferred from      "+add.getAcctNum(),amt);
		withdraw(amt);
		addTrans("Transfer to           "+add.getAcctNum(), amt*-1);
		System.out.println(" ");
		System.out.println("Transfer completed.");
	}
	
	public boolean goodUser(String login) {
		boolean good=getUsername().equals(login);
		return good;
	}
	
	public boolean goodPw(String login) {
		boolean good=getPassword().equals(login);
		return good;
	}
	
	public void fee() {
		withdraw(5);
		addTrans("Account Fee                    ", -5);
	}
	public void setAcctNum(String acct) {
		this.acctNum= acct;
		
	}
	public String getAcctNum() {
		return acctNum;	
	}
	/**
	 * 
	 * Overloading
	 * 
	 */
	public void firstDep(String type, double amt) {
		deposit(amt);
		addTrans(type, amt);
	}
	
	public void firstDep(String type, int amt) {
		deposit(amt);
		addTrans(type, amt);
	}
	
	
	public void regDep(double amt) {
		addTrans("Deposit                        ", amt);
		deposit(amt);
	}
	public void regWD(double amt) {
		addTrans("Withdrawal                     ",amt*-1);
		withdraw(amt);
	}
	public void checkAcct() {
		if(getBalance()<1) {
			fee();
			System.out.println("Account has been charged $5 for overdraft.");
		}
	}
	public void checkSave() {
		if(getBalance()<100) {
			fee();
			System.out.println("Account has been charged $5 for being under the minium balance of $100.");
		}
		
	}
	
	public void display() {
		super.firstDisplay();
		System.out.println(" ");
		System.out.println("Current Balance: $"+getBalance());
		System.out.println(" ");
	}
	
	
}
