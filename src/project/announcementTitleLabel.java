package project;

import java.awt.Font;

import javax.swing.JLabel;

public class announcementTitleLabel extends JLabel {
	announcementWin parent;
	announcementTitleLabel(announcementWin p)
	{
		parent = p;
		
		this.setText("���i�t��");
		this.setBounds(150, 30, 300, 50);
		this.setFont(new Font("�s�ө���",Font.BOLD,40));
		this.setVisible(true);
	}
}
