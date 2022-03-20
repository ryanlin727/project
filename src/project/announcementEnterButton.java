package project;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;

public class announcementEnterButton extends mainButton {
	mainWin parent;

	announcementEnterButton(mainWin p)
	{
		parent = p;
		
		//初始化按鈕
		this.setBounds(100, 100, 100, 50);
		this.setVisible(true);
		this.setText("公告系統");
		this.setFocusPainted(false);
	}
	public void doSomthing() {
		//設定可見性切換視窗
		parent.jframe.setVisible(false);
		parent.aWin.jframe.setVisible(true);
	}
}
