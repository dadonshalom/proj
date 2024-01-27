package SomePackage;

import java.lang.*;

public class Main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		Depositor wife = new Depositor(account);
		Depositor husband = new Depositor(account);
		Thread wifeThread = new Thread(wife);
		Thread husbandThread = new Thread(husband);
		wifeThread.start();
		husbandThread.start();
		try {
			wifeThread.join();
			husbandThread.join();
		} catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(account.getCount());
	}
}
