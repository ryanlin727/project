package project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class classStopButton extends mainButton {
	classWin parent;
	classStopButton(classWin p)
	{
		parent = p;
		
		//初始化按鈕
		this.setBounds(250, 350, 100, 50);
		this.setVisible(true);
		this.setText("停止");
		this.setFocusPainted(false);
	}
	
	public void doSomthing() {
		//停止上課直播
		parent.startButton.start=0;
		
		//清除上線者
		File writename = new File("E:\\xampp\\htdocs\\inclass.txt");
		try {
			writename.createNewFile();// 建立新檔案
			BufferedWriter out = new BufferedWriter(new FileWriter(writename));
			out.write("");
			out.flush(); // 把快取區內容壓入檔案
			out.close(); // 最後記得關閉檔案
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//清除聊天紀錄
		writename = new File("E:\\xampp\\htdocs\\chat.txt");
		try {
			writename.createNewFile();// 建立新檔案
			BufferedWriter out = new BufferedWriter(new FileWriter(writename));
			out.write("");
			out.flush(); // 把快取區內容壓入檔案
			out.close(); // 最後記得關閉檔案
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
