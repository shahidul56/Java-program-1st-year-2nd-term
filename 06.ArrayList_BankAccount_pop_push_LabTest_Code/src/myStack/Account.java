package myStack;

public class Account {
	private String name;
	private String type;
	private float balance;
	
	public Account (String name, String type, float balance) {
		this.name = name;
		this.type = type;
		this.balance = balance;
	}
	public String tosString () {
		return "Name: " + name + ", type: " + type + ", Balance: " + balance + ".";
	}
	
}
