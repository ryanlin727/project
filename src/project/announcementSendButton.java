package project;

public class announcementSendButton extends mainButton {
	announcementWin parent;
	announcementSendButton(announcementWin p)
	{
		parent = p;
		
		//初始化按鈕
		this.setBounds(180, 200, 100, 50);
		this.setVisible(true);
		this.setText("送出");
		this.setFocusPainted(false);
	}
	
	public void doSomthing() {
		//送出公告至資料庫
	}
}
