package project;

public class homeworkEnterButton extends mainButton {
	mainWin parent;

	homeworkEnterButton (mainWin p)
	{
		parent = p;
		
		//初始化按鈕
		this.setBounds(300, 300, 100, 50);
		this.setVisible(true);
		this.setText("作業系統");
		this.setFocusPainted(false);
	}
	public void doSomthing() {
		//設定可見性切換視窗
		parent.jframe.setVisible(false);
		parent.hWin.jframe.setVisible(true);
	}
}
