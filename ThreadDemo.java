import java.sql.Time;

class A extends Thread{
	public void run() {
		int res = 1;//2
		for(int i=1;i<=7;i++) {
			res = res*i;
			try{A.sleep(1000);}catch (Exception e) {}
		}
		System.out.println("a -"+res);
		
		
	}
}
class B extends Thread{
	public void run() {
		int res = 1;//2
		for(int i=1;i<=11;i++) {
			res = i+res;
			try{B.sleep(1000);}catch (Exception e) {}
		}
		System.out.println("b -"+res);
		run(5);
	}
	public void run(int a) {
		System.out.println("this is the run parameter method - "+a+9);
		try{B.sleep(1000);}catch (Exception e) {}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo demo = new ThreadDemo();
		Thread t = new A();
		Thread t1 = new B();
		System.out.println("Loading.......");
		t.start();
		t1.start();
	
	}

}
