package project;

import java.awt.Point;

public class classBackButton extends mainButton {
	classWin parent;
	classBackButton(classWin p)
	{
		parent = p;
		
		//��l�ƫ��s
		this.setBounds(180, 400, 100, 50);
		this.setVisible(true);
		this.setText("��^");
		this.setFocusPainted(false);
	}
	
	public void doSomthing() {
		//�]�w�i���ʤ�������
		Point Loc = parent.jframe.getLocationOnScreen();
		parent.jframe.setVisible(false);
		parent.parent.jframe.setVisible(true);
		//�]�w���i������m
		int x = Loc.x + 0;
		int y = Loc.y + 0;
		parent.parent.jframe.setLocation(x, y);
	}
}
