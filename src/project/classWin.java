package project;

public class classWin extends win {
	mainWin parent;
	classTitleLabel title;
	classStartButton startButton;
	classStopButton stopButton;
	classBackButton backButton;
	
	classWin(mainWin p)
	{
		parent = p;
		
		title = new classTitleLabel(this);
		jframe.add(title);
		
		startButton = new classStartButton(this);
		jframe.add(startButton);
		stopButton = new classStopButton(this);
		jframe.add(stopButton);
		
		backButton = new classBackButton(this);
		jframe.add(backButton);
	}
}
