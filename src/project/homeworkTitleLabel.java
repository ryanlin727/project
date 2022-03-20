package project;

import java.awt.Font;

import javax.swing.JLabel;

public class homeworkTitleLabel extends JLabel {
	homeworkWin parent;
	homeworkTitleLabel(homeworkWin p)
	{
		parent = p;
		
		this.setText("作業系統");
		this.setBounds(150, 30, 300, 50);
		this.setFont(new Font("新細明體",Font.BOLD,40));
		this.setVisible(true);
	}
}
