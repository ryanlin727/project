package project;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;

public class announcementEnterButton extends mainButton {
	mainWin parent;

	announcementEnterButton(mainWin p)
	{
		parent = p;
		
		//��l�ƫ��s
		this.setBounds(100, 200, 100, 50);
		this.setVisible(true);
		this.setText("���i�t��");
		this.setFocusPainted(false);
	}
	public void doSomthing() {
		//�]�w�i���ʤ�������
		Point Loc = parent.jframe.getLocationOnScreen();
		parent.jframe.setVisible(false);	
		parent.aWin.jframe.setVisible(true);
		//�]�w���i������m
		int x = Loc.x + 0;
		int y = Loc.y + 0;
		parent.aWin.jframe.setLocation(x, y);
	}
}
