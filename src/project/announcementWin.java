package project;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class announcementWin extends win {
	mainWin parent;
	announcementTitleLabel title;
	announcementTextArea TextArea;
	announcementSendButton sendButton;
	announcementComboBox comboBox;
	announcementDeleteButton deleteButton;
	announcementBackButton backButton;
	
	
	announcementWin(mainWin p)
	{
		parent = p;
		
		title = new announcementTitleLabel(this);
		jframe.add(title);
		
		//公告新增區
		TextArea = new announcementTextArea(this);
		JScrollPane sp = new JScrollPane(TextArea);
		sp.setBounds(50,100,400,100);
		jframe.add(sp);
		sendButton = new announcementSendButton(this);
		jframe.add(sendButton);
		
		//公告刪除區
		comboBox = new announcementComboBox(this);
		jframe.add(comboBox);
		deleteButton = new announcementDeleteButton(this);
		jframe.add(deleteButton);
		
		backButton = new announcementBackButton(this);
		jframe.add(backButton);
	}
}
