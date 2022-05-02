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
			//�}�l�W�ҫ����s
			parent.startButton.doSomthing();
			//�g�J�ɮקi���w��s����
			File writename = new File("E:\\xampp\\htdocs\\img.txt");
			try {
				writename.createNewFile();// �إ߷s�ɮ�
				BufferedWriter out = new BufferedWriter(new FileWriter(writename));
				out.write("1");
				out.flush(); // ��֨��Ϥ��e���J�ɮ�
				out.close(); // �̫�O�o�����ɮ�
			} catch (IOException e) {
				e.printStackTrace();
			}
			//Ū���O�_���H�|��
			String pathname = "E:\\xampp\\htdocs\\handup.txt";
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
				//���X���ܵ���
				JOptionPane.showMessageDialog(parent.jframe, line+" �|��");
				//�M���|���
				writename = new File("E:\\xampp\\htdocs\\handup.txt");
				try {
					writename.createNewFile();// �إ߷s�ɮ�
					BufferedWriter out = new BufferedWriter(new FileWriter(writename));
					out.write("");
					out.flush(); // ��֨��Ϥ��e���J�ɮ�
					out.close(); // �̫�O�o�����ɮ�
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}