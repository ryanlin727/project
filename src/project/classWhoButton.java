package project;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.swing.*;

public class classWhoButton extends mainButton {
	classWin parent;
	
	classWhoButton(classWin p){
		parent = p;
		
		//��l�ƫ��s
		this.setBounds(380, 400, 100, 50);
		this.setVisible(true);
		this.setText("�H��");
		this.setFocusPainted(false);
	}
	public void doSomthing() {
		//��ܦ��֤W�u
		String pathname = "E:\\xampp\\htdocs\\inclass.txt";
		File filename = new File(pathname); // �nŪ���H�W���|��txt�ɮ�
		InputStreamReader reader = null;
		try {
			try {
				reader = new InputStreamReader(new FileInputStream(filename),"UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}// �إߤ@�ӿ�J�y����reader
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		BufferedReader br = new BufferedReader(reader); // �إߤ@�Ӫ���A�����ɮפ��e�ন�p�����Ū�����y��
		String line = "";
		try {
			line = br.readLine();// �@��Ū�J�@����
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
			line="�@��"+times+"�H�W�u"+line.replace(",", "\n");
			//���X���ܵ���
			JOptionPane.showMessageDialog(parent.jframe, line);
		}
		else
		{
			//���X���ܵ���
			JOptionPane.showMessageDialog(parent.jframe, "�L�H�W�u");
		}
	}
}
