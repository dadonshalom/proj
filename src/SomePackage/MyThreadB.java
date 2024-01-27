package SomePackage;

public class MyThreadB extends Thread{

		private MyThreadA t_;
		
		public MyThreadB() {
			t_ = new MyThreadA(this);
		}
		
		public void run() {
			System.out.println("in MyThreadB run()");
			t_.f();
			//t_.start();
		}
}
