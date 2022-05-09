package project;

import javax.swing.JTextArea;

public class chatInputTextarea extends JTextArea {
	classChatWin parent;
	
	chatInputTextarea(classChatWin p) {
		parent = p;
		
		this.setVisible(true);
	}

}
