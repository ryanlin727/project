package project;

import java.io.*;

public class announcementSendButton extends mainButton {
	announcementWin parent;
	announcementSendButton(announcementWin p)
	{
		parent = p;
		
		//��l�ƫ��s
		this.setBounds(180, 200, 100, 50);
		this.setVisible(true);
		this.setText("�e�X");
		this.setFocusPainted(false);
	}
	
	public void doSomthing() {
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
		System.out.print(line);
		
		//�إߤ��i��
		int announceNO = Integer.parseInt(line)+1;
		File writename = new File("E:\\xampp\\htdocs\\"+announceNO+".txt");
		try {
			writename.createNewFile();// �إ߷s�ɮ�
			BufferedWriter out = new BufferedWriter(new FileWriter(writename));
			out.write(parent.TextArea.getText());
			out.flush(); // ��֨��Ϥ��e���J�ɮ�
			out.close(); // �̫�O�o�����ɮ�
		} catch (IOException e) {
			e.printStackTrace();
		} 
		parent.comboBox.addItem(announceNO+". "+parent.TextArea.getText());
		
		//���ثe�֦������i�ƶq
		writename = new File("E:\\xampp\\htdocs\\amount.txt");
		try {
			writename.createNewFile();// �إ߷s�ɮ�
			BufferedWriter out = new BufferedWriter(new FileWriter(writename));
			out.write(String.valueOf(announceNO));
			out.flush(); // ��֨��Ϥ��e���J�ɮ�
			out.close(); // �̫�O�o�����ɮ�
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}

