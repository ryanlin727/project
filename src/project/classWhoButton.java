package project;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.swing.*;

public class classWhoButton extends mainButton {
	classWin parent;
	
	classWhoButton(classWin p){
		parent = p;
		
		//初始化按鈕
		this.setBounds(380, 400, 100, 50);
		this.setVisible(true);
		this.setText("人員");
		this.setFocusPainted(false);
	}
	public void doSomthing() {
		//顯示有誰上線
		String pathname = "E:\\xampp\\htdocs\\inclass.txt";
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
			int times=0;
			for(int i = 0; i < line.length(); i++) {
	            if(line.charAt(i)==',') {
	            	times++;
	            }
	        }
			line="共有"+times+"人上線"+line.replace(",", "\n");
			//跳出提示視窗
			JOptionPane.showMessageDialog(parent.jframe, line);
		}
		else
		{
			//跳出提示視窗
			JOptionPane.showMessageDialog(parent.jframe, "無人上線");
		}
	}
}
