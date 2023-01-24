package multithreading_unSynchronized;

public class Caller implements Runnable {
	private String message;
	private CallMe target;
	private Thread myThread;
	
	public Thread getMyThread() {
		return myThread;
	}

	public void setMyThread(Thread myThread) {
		this.myThread = myThread;
	}

	public Caller(CallMe target, String message) {
		this.target = target;
		this.message = message;
		this.setMyThread( new Thread(this));
		this.getMyThread().start();
	}
	
	@Override
	public void run() {
		getTarget().call(this.getMessage());
	}
	
	/******************Getters and Setters*************************/
	public CallMe getTarget() {
		return target;
	}
	public void setTarget(CallMe target) {
		this.target = target;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
