package project;


public class announcementDeleteButton extends mainButton{
	announcementWin parent;
	announcementDeleteButton(announcementWin p)
	{
		parent = p;
		
		//��l�ƫ��s
		this.setBounds(180, 300, 100, 50);
		this.setVisible(true);
		this.setText("�R��");
		this.setFocusPainted(false);
	}
	
	public void doSomthing() {
		
	}
}
