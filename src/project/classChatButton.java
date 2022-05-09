package project;

import java.awt.Point;

public class classChatButton extends mainButton {

	classWin parent;
	
	classChatButton(classWin p){
		parent = p;
		
		//初始化按鈕
		this.setBounds(380, 350, 100, 50);
		this.setVisible(true);
		this.setText("聊天室");
		this.setFocusPainted(false);
	}
	public void doSomthing() {
		//顯示聊天室視窗
		parent.chatWin.jframe.setVisible(true);
		//調整聊天室位置
		Point Loc = parent.jframe.getLocationOnScreen();
		int x = Loc.x + 500;
		int y = Loc.y + 0;
		parent.chatWin.jframe.setLocation(x, y);
	}
}
