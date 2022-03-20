package project;

public class testWin extends win {
	mainWin parent;
	testTitleLabel title;
	testBackButton backButton;
	
	testWin(mainWin p)
	{
		parent = p;
		
		title = new testTitleLabel(this);
		jframe.add(title);
		
		backButton = new testBackButton(this);
		jframe.add(backButton);
	}
}
