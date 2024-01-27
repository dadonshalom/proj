package SomePackage;

public class Depositor implements Runnable{
	BankAccount counter;
	
	Depositor(BankAccount counter){
		this.counter = counter;
	}
	
	public void run() {
		for (int i=0;i<1005;i++)
			counter.addOne();
	}
}
