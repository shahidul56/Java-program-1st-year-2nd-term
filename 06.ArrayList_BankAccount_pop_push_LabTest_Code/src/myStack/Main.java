package myStack;

public class Main {

	public static void main(String[] args) {
		
		MyStack<Account> arrayAc = new MyStack<Account>(Account.class, 12);
     //student id 140225
		Account a1 = new Account("shahidul", "Current", 6000);
		Account a2 = new Account("pappu", "saving", 800);
		Account a3 = new Account("islam", "saving", 230);
		Account a4 = new Account("computer", "Current",452);
		

		
		arrayAc.push(a1);
		arrayAc.push(a2);
		arrayAc.push(a3);
		arrayAc.push(a4);
		
		while ((arrayAc.isEmpty() != true)) {
			System.out.println(arrayAc.pop().tosString());
		}
		
		System.out.println(arrayAc.search(a1));
		System.out.println(arrayAc.search(a2));
		System.out.println(arrayAc.search(a3));
		System.out.println(arrayAc.search(a4));
		
		
		
		
		
	}

}
