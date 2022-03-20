package project;

import java.awt.Font;

import javax.swing.JFrame;

public class announcementWin extends win {
	mainWin parent;
	announcementTitleLabel title;
	announcementBackButton backButton;
	
	announcementWin(mainWin p)
	{
		parent = p;
		
		title = new announcementTitleLabel(this);
		jframe.add(title);
		
		backButton = new announcementBackButton(this);
		jframe.add(backButton);
	}
}
