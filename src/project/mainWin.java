package project;

import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.Position;

public class mainWin extends win{
	announcementEnterButton aeb;
	announcementWin aWin;
	classEnterButton ceb;
	classWin cWin;
	
	titleLabel title;
	
	mainWin() {
		//���������i��
		jframe.setVisible(true);
		
		//���D
		title = new titleLabel(this);
		jframe.add(title);
		
		//��L�����i�J���s
		aeb = new announcementEnterButton(this);
		jframe.add(aeb);
		ceb = new classEnterButton(this);
		jframe.add(ceb);
		
		//�إߨ�L����
		aWin = new announcementWin(this);
		cWin = new classWin(this);
	}
	
	
}
