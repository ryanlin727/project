package project;

import javax.swing.JComboBox;

public class announcementComboBox extends JComboBox{
	announcementWin parent;
	announcementComboBox(announcementWin p)
	{
		parent = p;
		
		this.setBounds(50,280,400,20);
	}
	
}
