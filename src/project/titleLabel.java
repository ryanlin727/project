package project;

import java.awt.Font;
import javax.swing.JLabel;

public class titleLabel extends JLabel {
	mainWin parent;
	titleLabel(mainWin p)
	{
		parent=p;

		this.setText("課程輔助系統");
		this.setBounds(130, 30, 300, 50);
		this.setFont(new Font("新細明體",Font.BOLD,40));
		this.setVisible(true);
	}
}
