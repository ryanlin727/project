package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JComboBox;
import javax.swing.event.*;

public class announcementComboBox extends JComboBox {
	announcementWin parent;

	announcementComboBox(announcementWin p) {
		parent = p;

		this.setBounds(50, 280, 400, 20);
		load();

	}

	public void load() {
		this.removeAllItems();
		// 讀取目前有幾個公告
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

		int announceNO = Integer.parseInt(line);
		// 新增目前公告
		for (int i = 1; i <= announceNO; i++) {

			pathname = "E:\\xampp\\htdocs\\" + i + ".txt";
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
				line = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			} // 一次讀入一行資料

			this.addItem(i + ". " + line);
		}

		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
