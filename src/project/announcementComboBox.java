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
		// Ū���ثe���X�Ӥ��i
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

		int announceNO = Integer.parseInt(line);
		// �s�W�ثe���i
		for (int i = 1; i <= announceNO; i++) {

			pathname = "E:\\xampp\\htdocs\\" + i + ".txt";
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
				line = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			} // �@��Ū�J�@����

			this.addItem(i + ". " + line);
		}

		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
