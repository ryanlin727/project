package project;

import java.awt.Font;
import javax.swing.JLabel;

public class classTitleLabel extends JLabel {
	classWin parent;
	classTitleLabel(classWin p)
	{
		parent = p;
		
		this.setText("�W�Ҩt��");
		this.setBounds(150, 30, 300, 50);
		this.setFont(new Font("�s�ө���",Font.BOLD,40));
		this.setVisible(true);
	}
}
