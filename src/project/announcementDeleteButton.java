package project;

import java.io.*;
import java.nio.file.*;

public class announcementDeleteButton extends mainButton {
	announcementWin parent;

	announcementDeleteButton(announcementWin p) {
		parent = p;

		// 初始化按鈕
		this.setBounds(180, 300, 100, 50);
		this.setVisible(true);
		this.setText("刪除");
		this.setFocusPainted(false);
	}

	public void doSomthing() {
		int i = parent.comboBox.getSelectedIndex() + 1;
		
		//刪除指定檔案
		System.out.print(i);
		Path path = Paths.get("E:\\xampp\\htdocs\\" + i + ".txt");
		try {
			System.gc();
			Files.delete(path);
		} catch (IOException e) {
			e.printStackTrace();
		}

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
		int announceAmount = Integer.parseInt(line);
		
		// 將後方檔案編號往前移
		for (int j = i; j < announceAmount; j++) {
			//先讀取後一個檔案
			int k=j+1;
			pathname = "E:\\xampp\\htdocs\\"+k+".txt";
			filename = new File(pathname); // 要讀取以上路徑的txt檔案
			reader = null;
			try {
				reader = new InputStreamReader(new FileInputStream(filename));// 建立一個輸入流物件reader
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			br = new BufferedReader(reader); // 建立一個物件，它把檔案內容轉成計算機能讀懂的語言
			line = "";
			try {
				line = br.readLine();// 一次讀入一行資料
			} catch (IOException e) {
				e.printStackTrace();
			}
			//寫入
			File writename = new File("E:\\xampp\\htdocs\\"+j+".txt");
			try {
				writename.createNewFile();// 建立新檔案
				BufferedWriter out = new BufferedWriter(new FileWriter(writename));
				out.write(line);
				out.flush(); // 把快取區內容壓入檔案
				out.close(); // 最後記得關閉檔案
			} catch (IOException e) {
				e.printStackTrace();
			} 

		}
		File writename = new File("E:\\xampp\\htdocs\\amount.txt");
		try {
			writename.createNewFile();// 建立新檔案
			BufferedWriter out = new BufferedWriter(new FileWriter(writename));
			out.write(String.valueOf(announceAmount-1));
			out.flush(); // 把快取區內容壓入檔案
			out.close(); // 最後記得關閉檔案
		} catch (IOException e) {
			e.printStackTrace();
		}
		parent.comboBox.load();

	}
}
