package project;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;

public class announcementEnterButton extends mainButton {
	mainWin parent;

	announcementEnterButton(mainWin p)
	{
		parent = p;
		
		//��l�ƫ��s
		this.setBounds(100, 100, 100, 50);
		this.setVisible(true);
		this.setText("���i�t��");
		this.setFocusPainted(false);
	}
	public void doSomthing() {
		//�]�w�i���ʤ�������
		parent.jframe.setVisible(false);
		parent.aWin.jframe.setVisible(true);
	}
}
