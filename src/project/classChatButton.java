package project;

import java.awt.Point;

public class classChatButton extends mainButton {

	classWin parent;
	
	classChatButton(classWin p){
		parent = p;
		
		//��l�ƫ��s
		this.setBounds(380, 350, 100, 50);
		this.setVisible(true);
		this.setText("��ѫ�");
		this.setFocusPainted(false);
	}
	public void doSomthing() {
		//��ܲ�ѫǵ���
		parent.chatWin.jframe.setVisible(true);
		//�վ��ѫǦ�m
		Point Loc = parent.jframe.getLocationOnScreen();
		int x = Loc.x + 500;
		int y = Loc.y + 0;
		parent.chatWin.jframe.setLocation(x, y);
	}
}
