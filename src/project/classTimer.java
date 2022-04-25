package project;

import java.util.*;

public class classTimer extends Timer {
	classWin parent;
	classTimer(classWin p) {
		parent = p;
		
		TimerTask task = new TimerTask() {
			public void run() {
				reflesh();
			}
		};
		this.schedule(task, 50L, 50L);
	}

	public void reflesh() {
		if(parent.startButton.start==1)
			parent.startButton.doSomthing();
	}
}