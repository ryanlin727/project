package project;

import java.awt.Font;
import javax.swing.JLabel;

public class testTitleLabel extends JLabel {
	testWin parent;
	testTitleLabel(testWin p)
	{
		parent = p;
		
		this.setText("�Ҹըt��");
		this.setBounds(150, 30, 300, 50);
		this.setFont(new Font("�s�ө���",Font.BOLD,40));
		this.setVisible(true);
	}
}
