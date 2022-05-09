package project;

import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class chatSendButton extends mainButton{
	classChatWin parent;
	
	chatSendButton(classChatWin p) {
		parent = p;
		
		this.setBounds(65, 370, 100, 50);
		this.setVisible(true);
		this.setText("送出");
		this.setFocusPainted(false);
	}
	public void doSomthing() {
		//格式化現在時間資訊
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd HH:mm:ss");
		
		//先讀取先前紀錄
		String pathname = "E:\\xampp\\htdocs\\chat.txt";
		File filename = new File(pathname); // 要讀取以上路徑的txt檔案
		InputStreamReader reader = null;
		try {
			try {
				reader = new InputStreamReader(new FileInputStream(filename),"UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}// 建立一個輸入流物件reader
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
		
		//寫入檔案記錄聊天內容
		File writename = new File("E:\\xampp\\htdocs\\chat.txt");
		try {
			writename.createNewFile();// 建立新檔案
			FileOutputStream writerStream = new FileOutputStream(writename);   
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(writerStream, "UTF-8"));
			String input = parent.inputTextarea.getText();
			input = "老師 " + dtf.format(LocalDateTime.now()) + ":," + input.replace("\n",",") + ",";
			if(line != null)
				out.write(line+input);
			else 
				out.write(input);
			
			out.flush(); // 把快取區內容壓入檔案
			out.close(); // 最後記得關閉檔案
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//送出後清除原本內容
		parent.inputTextarea.setText("");
	}
}
