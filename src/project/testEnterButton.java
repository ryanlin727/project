package project;

public class testEnterButton extends mainButton {
	mainWin parent;

	testEnterButton(mainWin p)
	{
		parent = p;
		
		//��l�ƫ��s
		this.setBounds(100, 300, 100, 50);
		this.setVisible(true);
		this.setText("�Ҹըt��");
		this.setFocusPainted(false);
	}
	public void doSomthing() {
		//�]�w�i���ʤ�������
		parent.jframe.setVisible(false);
		parent.tWin.jframe.setVisible(true);
	}
}
