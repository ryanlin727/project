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
		
		//��l�ƫ��s
		this.setBounds(250, 350, 100, 50);
		this.setVisible(true);
		this.setText("����");
		this.setFocusPainted(false);
	}
	
	public void doSomthing() {
		//����W�Ҫ���
		parent.startButton.start=0;
		
		//�M���W�u��
		File writename = new File("E:\\xampp\\htdocs\\inclass.txt");
		try {
			writename.createNewFile();// �إ߷s�ɮ�
			BufferedWriter out = new BufferedWriter(new FileWriter(writename));
			out.write("");
			out.flush(); // ��֨��Ϥ��e���J�ɮ�
			out.close(); // �̫�O�o�����ɮ�
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//�M����Ѭ���
		writename = new File("E:\\xampp\\htdocs\\chat.txt");
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
