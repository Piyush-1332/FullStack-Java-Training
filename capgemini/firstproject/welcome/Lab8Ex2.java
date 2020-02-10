package capgemini.firstproject.welcome;

public class Lab8Ex2 {

	public static void main(String[] args) {
		Timer tm = new Timer("Timer Thread");
		Thread t=new Thread(tm);
		t.start();
	}
}

class Timer implements Runnable {
	String name;

	public Timer(String string) {
		this.name = string;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		long startTime = System.currentTimeMillis();
		System.out.println("Start " + startTime);
		while(true) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			long elapsedTime = System.currentTimeMillis() - startTime;
			long elapsedSeconds = elapsedTime / 1000;
			long secondsDisplay = elapsedSeconds % 60;
			long elapsedMinutes = elapsedSeconds / 60;
			System.out.println(elapsedMinutes+" : "+secondsDisplay);
		}
	}

}
