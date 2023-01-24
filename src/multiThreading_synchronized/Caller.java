package multiThreading_synchronized;

public class Caller implements Runnable{
	private String message;
	private Thread myThread;
	private CallMe target;
	
	public Caller(CallMe target, String message) {
		this.setTarget(target);
		this.setMessage(message);
		this.setMyThread(new Thread(this));
		this.getMyThread().start();
	}
	@Override
	public void run() {
		synchronized (this.getTarget()) {
			this.getTarget().call(this.getMessage());
		}
	}


	public Thread getMyThread() {
		return myThread;
	}


	public void setMyThread(Thread myThread) {
		this.myThread = myThread;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public CallMe getTarget() {
		return target;
	}


	public void setTarget(CallMe target) {
		this.target = target;
	}

}
