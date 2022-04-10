package project;

import java.io.*;

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
		//讀取目前有幾個公告
		String pathname = "E:\\xampp\\htdocs\\amount.txt";
		File filename = new File(pathname); // 要讀取以上路徑的txt檔案
		InputStreamReader reader = null;
		try {
			reader = new InputStreamReader(new FileInputStream(filename));// 建立一個輸入流物件reader
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		BufferedReader br = new BufferedReader(reader); // 建立一個物件，它把檔案內容轉成計算機能讀懂的語言
		String line = "";
		try {
			line = br.readLine();// 一次讀入一行資料
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.print(line);
		
		//建立公告檔
		int announceNO = Integer.parseInt(line)+1;
		File writename = new File("E:\\xampp\\htdocs\\"+announceNO+".txt");
		try {
			writename.createNewFile();// 建立新檔案
			BufferedWriter out = new BufferedWriter(new FileWriter(writename));
			out.write(parent.TextArea.getText());
			out.flush(); // 把快取區內容壓入檔案
			out.close(); // 最後記得關閉檔案
		} catch (IOException e) {
			e.printStackTrace();
		} 
		parent.comboBox.addItem(announceNO+". "+parent.TextArea.getText());
		
		//更改目前擁有的公告數量
		writename = new File("E:\\xampp\\htdocs\\amount.txt");
		try {
			writename.createNewFile();// 建立新檔案
			BufferedWriter out = new BufferedWriter(new FileWriter(writename));
			out.write(String.valueOf(announceNO));
			out.flush(); // 把快取區內容壓入檔案
			out.close(); // 最後記得關閉檔案
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}

