package project;

public class classStartButton extends mainButton {
	classWin parent;
	classStartButton(classWin p)
	{
		parent = p;
		
		//初始化按鈕
		this.setBounds(110, 350, 100, 50);
		this.setVisible(true);
		this.setText("開始");
		this.setFocusPainted(false);
	}
	
	public void doSomthing() {
		//開始上課直播
	}
}
