package project;

public class announcementSendButton extends mainButton {
	announcementWin parent;
	announcementSendButton(announcementWin p)
	{
		parent = p;
		
		//��l�ƫ��s
		this.setBounds(180, 200, 100, 50);
		this.setVisible(true);
		this.setText("�e�X");
		this.setFocusPainted(false);
	}
	
	public void doSomthing() {
		//�e�X���i�ܸ�Ʈw
	}
}
