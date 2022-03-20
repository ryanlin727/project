package project;

public class classWin extends win {
	mainWin parent;
	classTitleLabel title;
	classBackButton backButton;
	
	classWin(mainWin p)
	{
		parent = p;
		
		title = new classTitleLabel(this);
		jframe.add(title);
		
		backButton = new classBackButton(this);
		jframe.add(backButton);
	}
}
