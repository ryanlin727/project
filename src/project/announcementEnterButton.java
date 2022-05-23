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
		
		//初始化按鈕
		this.setBounds(100, 200, 100, 50);
		this.setVisible(true);
		this.setText("公告系統");
		this.setFocusPainted(false);
	}
	public void doSomthing() {
		//設定可見性切換視窗
		Point Loc = parent.jframe.getLocationOnScreen();
		parent.jframe.setVisible(false);	
		parent.aWin.jframe.setVisible(true);
		//設定公告視窗位置
		int x = Loc.x + 0;
		int y = Loc.y + 0;
		parent.aWin.jframe.setLocation(x, y);
	}
}
