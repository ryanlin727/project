package project;

import java.awt.Point;

public class classEnterButton extends mainButton {
	mainWin parent;

	classEnterButton(mainWin p)
	{
		parent = p;
		
		//��l�ƫ��s
		this.setBounds(300, 200, 100, 50);
		this.setVisible(true);
		this.setText("�W�Ҩt��");
		this.setFocusPainted(false);
	}
	public void doSomthing() {
		//�]�w�i���ʤ�������
		Point Loc = parent.jframe.getLocationOnScreen();
		parent.jframe.setVisible(false);
		parent.cWin.jframe.setVisible(true);
		//�]�w�W�ҵ�����m
		int x = Loc.x + 0;
		int y = Loc.y + 0;
		parent.cWin.jframe.setLocation(x, y);
	}
}
