package project;

public class classBackButton extends mainButton {
	classWin parent;
	classBackButton(classWin p)
	{
		parent = p;
		
		//初始化按鈕
		this.setBounds(180, 400, 100, 50);
		this.setVisible(true);
		this.setText("返回");
		this.setFocusPainted(false);
	}
	
	public void doSomthing() {
		//設定可見性切換視窗
		parent.jframe.setVisible(false);
		parent.parent.jframe.setVisible(true);
	}
}
