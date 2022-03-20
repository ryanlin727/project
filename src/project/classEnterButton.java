package project;

public class classEnterButton extends mainButton {
	mainWin parent;

	classEnterButton(mainWin p)
	{
		parent = p;
		
		//初始化按鈕
		this.setBounds(300, 100, 100, 50);
		this.setVisible(true);
		this.setText("上課系統");
		this.setFocusPainted(false);
	}
	public void doSomthing() {
		//設定可見性切換視窗
		parent.jframe.setVisible(false);
		parent.cWin.jframe.setVisible(true);
	}
}
