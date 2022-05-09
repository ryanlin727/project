package project;

import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class chatSendButton extends mainButton{
	classChatWin parent;
	
	chatSendButton(classChatWin p) {
		parent = p;
		
		this.setBounds(65, 370, 100, 50);
		this.setVisible(true);
		this.setText("�e�X");
		this.setFocusPainted(false);
	}
	public void doSomthing() {
		//�榡�Ʋ{�b�ɶ���T
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd HH:mm:ss");
		
		//��Ū�����e����
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
		
		//�g�J�ɮװO����Ѥ��e
		File writename = new File("E:\\xampp\\htdocs\\chat.txt");
		try {
			writename.createNewFile();// �إ߷s�ɮ�
			FileOutputStream writerStream = new FileOutputStream(writename);   
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(writerStream, "UTF-8"));
			String input = parent.inputTextarea.getText();
			input = "�Ѯv " + dtf.format(LocalDateTime.now()) + ":," + input.replace("\n",",") + ",";
			if(line != null)
				out.write(line+input);
			else 
				out.write(input);
			
			out.flush(); // ��֨��Ϥ��e���J�ɮ�
			out.close(); // �̫�O�o�����ɮ�
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//�e�X��M���쥻���e
		parent.inputTextarea.setText("");
	}
}
