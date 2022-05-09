package project;

import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class classChatWin extends win {
	classWin parent;
	
	chatOutputTextarea outputTextarea;
	chatInputTextarea inputTextarea;
	chatSendButton sendButton;
	chatTimer timer;
	
	classChatWin(classWin p) {
		parent = p;
		
		jframe.setSize(250,500);
		jframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		outputTextarea = new chatOutputTextarea(this);
		jframe.add(outputTextarea);
		JScrollPane sp1 = new JScrollPane(outputTextarea);
		sp1.setBounds(20, 50, 200, 200);
		jframe.add(sp1);
		
		inputTextarea = new chatInputTextarea(this);
		jframe.add(inputTextarea);
		JScrollPane sp2 = new JScrollPane(inputTextarea);
		sp2.setBounds(20, 260, 200, 100);
		jframe.add(sp2);
		
		sendButton = new chatSendButton(this);
		jframe.add(sendButton);
		
		timer = new chatTimer(this);
	}
}
