package project;

public class classStartButton extends mainButton {
	classWin parent;
	classStartButton(classWin p)
	{
		parent = p;
		
		//��l�ƫ��s
		this.setBounds(110, 350, 100, 50);
		this.setVisible(true);
		this.setText("�}�l");
		this.setFocusPainted(false);
	}
	
	public void doSomthing() {
		//�}�l�W�Ҫ���
	}
}
