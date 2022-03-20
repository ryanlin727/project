package project;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class mainButton extends JButton{

	mainButton() {
		this.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				doSomthing();
			}
		});
	}
	public void doSomthing() {
		// TODO Auto-generated method stub
		
	}
}