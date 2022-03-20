package project;

public class homeworkWin extends win {
	mainWin parent;
	homeworkTitleLabel title;
	homeworkBackButton backButton;
	
	homeworkWin(mainWin p)
	{
		parent = p;
		
		title = new homeworkTitleLabel(this);
		jframe.add(title);
		
		backButton = new homeworkBackButton(this);
		jframe.add(backButton);
	}
}
