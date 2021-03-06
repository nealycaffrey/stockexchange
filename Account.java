import java.util.HashMap;

/* Account class. Contains account info of clients like
 * 1. Client ID
 * 2. Balance
 * 3. List of stocks owned by the clients, with shares
 */
public class Account {

	private int id;
	private int balance;
	private HashMap<String, Integer> clientStockInfo = new HashMap<String, Integer>();
	
	public Account(int id, int balance) {
		
		this.id = id;
		this.balance = balance;
	}
	
	public void setStockInfo(String stockName, Integer quantity) {
		
		clientStockInfo.put(stockName, quantity);
	}
	
	public int getBalance() {
		
		return this.balance;
	}
	
	public void setBalance(int newBalance) {
		
//		System.out.println("Setting balance to " + newBalance);
		
		this.balance = newBalance;
	}
	
	public int getID() {
		return this.id;
	}
	
	public void printAccountInfo() {
		
		System.out.print("C" + id + " " + balance + "," + " ");
	}

}
