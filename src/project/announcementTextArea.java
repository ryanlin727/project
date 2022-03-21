package project;

import javax.swing.JTextArea;

public class announcementTextArea extends JTextArea {
	announcementWin parent;
	
	announcementTextArea(announcementWin p)
	{
		parent = p;
		
		this.setBounds(40, 100, 300, 50);
		this.setVisible(true);
	}
}
