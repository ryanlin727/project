package project;

public class classEnterButton extends mainButton {
	mainWin parent;

	classEnterButton(mainWin p)
	{
		parent = p;
		
		//��l�ƫ��s
		this.setBounds(300, 100, 100, 50);
		this.setVisible(true);
		this.setText("�W�Ҩt��");
		this.setFocusPainted(false);
	}
	public void doSomthing() {
		//�]�w�i���ʤ�������
		parent.jframe.setVisible(false);
		parent.cWin.jframe.setVisible(true);
	}
}
