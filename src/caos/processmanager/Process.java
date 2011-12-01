package caos.processmanager;

public class Process {
	public static final int BLOCKED = 0, RUNNING = 1, READY = 2, NEW = 3;
	private int state;
	private int pid;
	private int priority;
	
	public Process(int state, int pid, int priority) {
		this.state = state;
		this.pid = pid;
		this.priority = priority;
	}

	public int getState() {
		return state;
	}
	
	public String getStateName() {
		switch (state) {
		case Process.BLOCKED: 
			return "BLOCKED";
		case Process.READY:
			return "READY";
		case Process.RUNNING:
			return "RUNNING";
		case Process.NEW:
			return "NEW";
		default:
			return "UNKNOWN";
		}
	}

	public void setState(int state) {
		this.state = state;
	}
	
	

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getPid() {
		return pid;
	}

	
	
	

}
