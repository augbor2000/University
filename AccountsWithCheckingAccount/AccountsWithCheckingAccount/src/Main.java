
public class Main {

	public static void main(String[] args) {
		
		BankAccount ba1 = new BankAccount("Roberts", 1200);
		ba1.printInfo();

		SavingsAccount sa1 = new SavingsAccount("Jones", 1000, 0.05);
		sa1.addInterest();
		
		sa1.printInfo();
		
		CheckingAccount ca1 = new CheckingAccount("Biden", 1800);
		ca1.deposit(100);
		ca1.deposit(100);
		ca1.deposit(100);
		ca1.deposit(100);
		
		ca1.printInfo();
	}

}
