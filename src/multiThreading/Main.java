package multiThreading;

public class Main {
	public static void main(String[] args) {
		Thread myThread = new Thread();//создание потока исполнения и передача ссылки на него переменной myThread
		myThread.setName("My newest thread");
		myThread.setPriority(1);
		
		System.out.println("Current thread" + "\n\tname: "+ myThread.getName() + "\n\tpriority: " + myThread.getPriority());
		System.out.println("Full info about current thread: " + myThread);
		
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println("test print " + i);
				Thread.sleep(1500);
			}
		} catch (InterruptedException ie) {
			System.out.println(myThread + " is terminated");
			ie.getStackTrace();//в реальных задачах данное исключение обрабатывается иначе
		}
	}
}
