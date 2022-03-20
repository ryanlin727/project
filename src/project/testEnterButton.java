package project;

public class testEnterButton extends mainButton {
	mainWin parent;

	testEnterButton(mainWin p)
	{
		parent = p;
		
		//初始化按鈕
		this.setBounds(100, 300, 100, 50);
		this.setVisible(true);
		this.setText("考試系統");
		this.setFocusPainted(false);
	}
	public void doSomthing() {
		//設定可見性切換視窗
		parent.jframe.setVisible(false);
		parent.tWin.jframe.setVisible(true);
	}
}
