package project;

import java.awt.Font;
import javax.swing.JLabel;

public class titleLabel extends JLabel {
	mainWin parent;
	titleLabel(mainWin p)
	{
		parent=p;

		this.setText("�ҵ{���U�t��");
		this.setBounds(130, 30, 300, 50);
		this.setFont(new Font("�s�ө���",Font.BOLD,40));
		this.setVisible(true);
	}
}
