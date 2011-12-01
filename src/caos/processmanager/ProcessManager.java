package caos.processmanager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ProcessManager {
	
	Process runningProcess = null;
	
	
	private static int pid;
	Queue<Process> readyQueue = new LinkedList<Process>();
	Queue<Process> blockedQueue = new LinkedList<Process>();
	Queue<Process> newQueue = new LinkedList<Process>();
	
	public ProcessManager() {
		pid = 0;
	}
	
	public void createProcess(){
	 newQueue.add(new Process(Process.READY,++ProcessManager.pid , 1));	
	}
	
	public void timeOutEvent(){
		moveToReadyQueue(runningProcess);
		runningProcess = null;
	}
	
	public void initMemoryAllocatedEvent(){
		if(!newQueue.isEmpty()) moveToReadyQueue(newQueue.poll());
	}
	
	public void blockingActionEvent(){
		block();
	}
	
	public void unBlockActionEvent(){
		if(!blockedQueue.isEmpty()){
			moveToReadyQueue(blockedQueue.poll());
		}
		if(runningProcess !=null){
			moveToReadyQueue(runningProcess);
			runningProcess = null;
		}
		dispatch();
	}

	public void dispatch(){
		
		if(runningProcess == null && !readyQueue.isEmpty()){
			setRunning(readyQueue.poll());
		}
	}
	
	public void listAllQueues(){
		Iterator<Process> rI = readyQueue.iterator();
		Iterator<Process> bI = blockedQueue.iterator();
		Iterator<Process> nI = newQueue.iterator();
		
		if(runningProcess != null) {
			System.out.println("Running Process :" + runningProcess.getPid());
		}else {
			System.out.println("Running Process :");
		}
		System.out.print("New Processes : ");
		while(nI.hasNext()){
			System.out.print(nI.next().getPid() + ", ");
		}
		System.out.print("\n");
		System.out.print("Ready Processes : ");
		while(rI.hasNext()){
			System.out.print(rI.next().getPid() + ", ");
		}
		System.out.print("\n");
		System.out.print("Blocked Processes : ");
		while(bI.hasNext()){
			System.out.print(bI.next().getPid() + ", ");
		}
		
	}

	private void moveToReadyQueue(Process p){
		p.setState(Process.READY);
		readyQueue.add(p);
	}
	
	private void setRunning(Process p) {
		p.setState(Process.RUNNING);
		runningProcess = p;
	}
	
	private void block(){
		if (runningProcess != null){
			runningProcess.setState(Process.BLOCKED);
			blockedQueue.add(runningProcess);
			runningProcess = null;
		}
	}
	
	
	
	
}
