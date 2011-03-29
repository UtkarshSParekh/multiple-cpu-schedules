import java.util.*;

public abstract class Scheduler {
	boolean stillRunning = true;
	int sizeOfQueue = 20;
	int currentTime = 0;
	Vector <int> waitTimes;
	Vector <int> turnaroundTimes;
	private Vector <Process> queue;
	private Vector <Process> inactive;
	
	public abstract void Run();
	public abstract void checkNewProcesses();
	public abstract void addProcesses(Vector <Process> p) {
		inactive = p;
		Collections.sort(inactive, new startTimeComparator());
	}
	public abstract void contextSwitch();
}