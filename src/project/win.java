package project;

import javax.swing.JFrame;

public class win {
	JFrame jframe;
	win()
	{
		jframe = new JFrame("教學輔助系統");
		jframe.setSize(500, 500);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(false);
		jframe.setLayout(null);
	}
}