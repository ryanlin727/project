package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.*;

import javax.swing.JOptionPane;

public class classTimer extends Timer {
	classWin parent;
	classTimer(classWin p) {
		parent = p;
		
		TimerTask task = new TimerTask() {
			public void run() {
				reflesh();
			}
		};
		this.schedule(task, 100L, 100L);
	}

	public void reflesh() {
		if(parent.startButton.start==1)
		{
			//開始上課持續刷新
			parent.startButton.doSomthing();
			//寫入檔案告知已刷新完成
			File writename = new File("E:\\xampp\\htdocs\\img.txt");
			try {
				writename.createNewFile();// 建立新檔案
				BufferedWriter out = new BufferedWriter(new FileWriter(writename));
				out.write("1");
				out.flush(); // 把快取區內容壓入檔案
				out.close(); // 最後記得關閉檔案
			} catch (IOException e) {
				e.printStackTrace();
			}
			//讀取是否有人舉手
			String pathname = "E:\\xampp\\htdocs\\handup.txt";
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
			if(line!=null)
			{
				//跳出提示視窗
				JOptionPane.showMessageDialog(parent.jframe, line+" 舉手");
				//清除舉手者
				writename = new File("E:\\xampp\\htdocs\\handup.txt");
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
	}
}