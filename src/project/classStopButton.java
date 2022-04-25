package project;

public class classStopButton extends mainButton {
	classWin parent;
	classStopButton(classWin p)
	{
		parent = p;
		
		//ªì©l¤Æ«ö¶s
		this.setBounds(250, 350, 100, 50);
		this.setVisible(true);
		this.setText("°±¤î");
		this.setFocusPainted(false);
	}
	
	public void doSomthing() {
		//°±¤î¤W½Òª½¼½
		parent.startButton.start=0;
	}
}
