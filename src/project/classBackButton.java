package project;

import java.awt.Point;

public class classBackButton extends mainButton {
	classWin parent;
	classBackButton(classWin p)
	{
		parent = p;
		
		//初始化按鈕
		this.setBounds(180, 400, 100, 50);
		this.setVisible(true);
		this.setText("返回");
		this.setFocusPainted(false);
	}
	
	public void doSomthing() {
		//設定可見性切換視窗
		Point Loc = parent.jframe.getLocationOnScreen();
		parent.jframe.setVisible(false);
		parent.parent.jframe.setVisible(true);
		//設定公告視窗位置
		int x = Loc.x + 0;
		int y = Loc.y + 0;
		parent.parent.jframe.setLocation(x, y);
	}
}
