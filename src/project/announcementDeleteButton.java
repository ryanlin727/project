package project;

import java.io.*;
import java.nio.file.*;

public class announcementDeleteButton extends mainButton {
	announcementWin parent;

	announcementDeleteButton(announcementWin p) {
		parent = p;

		// ��l�ƫ��s
		this.setBounds(180, 300, 100, 50);
		this.setVisible(true);
		this.setText("�R��");
		this.setFocusPainted(false);
	}

	public void doSomthing() {
		int i = parent.comboBox.getSelectedIndex() + 1;
		
		//�R�����w�ɮ�
		System.out.print(i);
		Path path = Paths.get("E:\\xampp\\htdocs\\" + i + ".txt");
		try {
			System.gc();
			Files.delete(path);
		} catch (IOException e) {
			e.printStackTrace();
		}

		//Ū���ثe���X�Ӥ��i
		String pathname = "E:\\xampp\\htdocs\\amount.txt";
		File filename = new File(pathname); // �nŪ���H�W���|��txt�ɮ�
		InputStreamReader reader = null;
		try {
			reader = new InputStreamReader(new FileInputStream(filename));// �إߤ@�ӿ�J�y����reader
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
		int announceAmount = Integer.parseInt(line);
		
		// �N����ɮ׽s�����e��
		for (int j = i; j < announceAmount; j++) {
			//��Ū����@���ɮ�
			int k=j+1;
			pathname = "E:\\xampp\\htdocs\\"+k+".txt";
			filename = new File(pathname); // �nŪ���H�W���|��txt�ɮ�
			reader = null;
			try {
				reader = new InputStreamReader(new FileInputStream(filename));// �إߤ@�ӿ�J�y����reader
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			br = new BufferedReader(reader); // �إߤ@�Ӫ���A�����ɮפ��e�ন�p�����Ū�����y��
			line = "";
			try {
				line = br.readLine();// �@��Ū�J�@����
			} catch (IOException e) {
				e.printStackTrace();
			}
			//�g�J
			File writename = new File("E:\\xampp\\htdocs\\"+j+".txt");
			try {
				writename.createNewFile();// �إ߷s�ɮ�
				BufferedWriter out = new BufferedWriter(new FileWriter(writename));
				out.write(line);
				out.flush(); // ��֨��Ϥ��e���J�ɮ�
				out.close(); // �̫�O�o�����ɮ�
			} catch (IOException e) {
				e.printStackTrace();
			} 

		}
		File writename = new File("E:\\xampp\\htdocs\\amount.txt");
		try {
			writename.createNewFile();// �إ߷s�ɮ�
			BufferedWriter out = new BufferedWriter(new FileWriter(writename));
			out.write(String.valueOf(announceAmount-1));
			out.flush(); // ��֨��Ϥ��e���J�ɮ�
			out.close(); // �̫�O�o�����ɮ�
		} catch (IOException e) {
			e.printStackTrace();
		}
		parent.comboBox.load();

	}
}
