package project;

public class homeworkEnterButton extends mainButton {
	mainWin parent;

	homeworkEnterButton (mainWin p)
	{
		parent = p;
		
		//��l�ƫ��s
		this.setBounds(300, 300, 100, 50);
		this.setVisible(true);
		this.setText("�@�~�t��");
		this.setFocusPainted(false);
	}
	public void doSomthing() {
		//�]�w�i���ʤ�������
		parent.jframe.setVisible(false);
		parent.hWin.jframe.setVisible(true);
	}
}
