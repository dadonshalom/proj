package SomePackage;

public class MyThreadA extends Thread {
	
	private MyThreadB t_;
	
	public MyThreadA(MyThreadB t) {
		t_ = t;
	}
	
	public void run() {
		System.out.println("in MyThreadA run()");
		t_.start();
	}
	
	public void f() {
		System.out.println("f() is called");
	}

}
