package project;

public class testBackButton extends mainButton {
	testWin parent;
	testBackButton(testWin p)
	{
		parent = p;
		
		//��l�ƫ��s
		this.setBounds(180, 400, 100, 50);
		this.setVisible(true);
		this.setText("��^");
		this.setFocusPainted(false);
	}
	
	public void doSomthing() {
		//�]�w�i���ʤ�������
		parent.jframe.setVisible(false);
		parent.parent.jframe.setVisible(true);
	}
}
