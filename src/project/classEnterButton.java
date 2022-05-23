package project;

import java.awt.Point;

public class classEnterButton extends mainButton {
	mainWin parent;

	classEnterButton(mainWin p)
	{
		parent = p;
		
		//初始化按鈕
		this.setBounds(300, 200, 100, 50);
		this.setVisible(true);
		this.setText("上課系統");
		this.setFocusPainted(false);
	}
	public void doSomthing() {
		//設定可見性切換視窗
		Point Loc = parent.jframe.getLocationOnScreen();
		parent.jframe.setVisible(false);
		parent.cWin.jframe.setVisible(true);
		//設定上課視窗位置
		int x = Loc.x + 0;
		int y = Loc.y + 0;
		parent.cWin.jframe.setLocation(x, y);
	}
}
