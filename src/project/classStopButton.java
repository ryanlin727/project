package project;

public class classStopButton extends mainButton {
	classWin parent;
	classStopButton(classWin p)
	{
		parent = p;
		
		//��l�ƫ��s
		this.setBounds(250, 350, 100, 50);
		this.setVisible(true);
		this.setText("����");
		this.setFocusPainted(false);
	}
	
	public void doSomthing() {
		//����W�Ҫ���
		parent.startButton.start=0;
	}
}
