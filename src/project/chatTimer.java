package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class chatTimer extends Timer {
	classChatWin parent;
	chatTimer(classChatWin p) {
		parent = p;
		
		TimerTask task = new TimerTask() {
			public void run() {
				reflesh();
			}
		};
		this.schedule(task, 100L, 100L);
	}
	public void reflesh() {
		String pathname = "E:\\xampp\\htdocs\\chat.txt";
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
		if(line != null)
			if(line.contains(","))
				line = line.replace(",", "\n");
		parent.outputTextarea.setText(line);
		parent.jframe.repaint();
	}
}
