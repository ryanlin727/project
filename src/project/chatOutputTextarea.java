package project;

import javax.swing.JTextArea;

public class chatOutputTextarea extends JTextArea {
	classChatWin parent;
	
	chatOutputTextarea(classChatWin p) {
		parent = p;
		
		this.setEditable(false);
		this.setVisible(true);
	}
	
}
