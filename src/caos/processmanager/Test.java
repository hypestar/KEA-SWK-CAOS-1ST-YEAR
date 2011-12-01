package caos;

import caos.processmanager.ProcessManager;

public class Test {

	public Test() {
		simulate();
	}
	
	private void simulate() {
		ProcessManager pm = new ProcessManager();
		
		// Create processes and add them to the newQueue
		pm.createProcess(); 
		pm.createProcess();
		pm.createProcess();
		pm.createProcess();
		pm.createProcess();
		
		// Move from new list to readyQueue
		pm.initMemoryAllocatedEvent();
		pm.initMemoryAllocatedEvent();
		pm.initMemoryAllocatedEvent();
		pm.initMemoryAllocatedEvent();

		// Move the first process from the readyQueue to running state
		pm.dispatch();
		
		// Move running to blockedQueue
		pm.blockingActionEvent();
		
		// Move the first process from the readyQueue to running state
		pm.dispatch();
		
		// Move from new list to readyQueue
		pm.initMemoryAllocatedEvent();
		
		// Create process and add it to the newQueue
		pm.createProcess();
		
		// Move from new list to readyQueue
		pm.initMemoryAllocatedEvent();
		
		// Move the running process to the readyQueue
		pm.timeOutEvent();
		
		// Move the first process from the readyQueue to running state
		pm.dispatch();

		// Move running to blockedQueue
		pm.blockingActionEvent();
		
		// Move the first process from the readyQueue to running state
		pm.dispatch();
		
		// Move the running process to the readyQueue
		pm.timeOutEvent();
		
		// Move the first process from the readyQueue to running state
		pm.dispatch();

		pm.unBlockActionEvent();
		pm.listAllQueues();
	}

	public static void main(String[] args) {
		new Test();

	}
}
