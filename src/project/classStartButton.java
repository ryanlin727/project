package project;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class classStartButton extends mainButton {
	classWin parent;
	
	private String defaultName = "E:\\xampp\\htdocs\\screen";
	private String defaultImageFormat="png";
	Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	public int start=0;
	
	classStartButton(classWin p)
	{
		parent = p;
		
		//��l�ƫ��s
		this.setBounds(110, 350, 100, 50);
		this.setVisible(true);
		this.setText("�}�l");
		this.setFocusPainted(false);
	}
	
	 public void snapShot() {

		 try {
		 //�����ù���@��BufferedImage����screenshot
		 BufferedImage screenshot = (new Robot()).createScreenCapture(new
		 Rectangle(0, 0, (int) d.getWidth(), (int) d.getHeight()));

		 //�ھ��ɮצr���ܼƩM�ɮ׮榡�ܼơA�۰ʥͦ��ɦW
		 String name=defaultName+"."+defaultImageFormat;
		 File f = new File(name);
		 System.out.print("Save File"+name);
		 //�Nscreenshot����g�J�v�H�ɮ�
		 ImageIO.write(screenshot, defaultImageFormat, f);
		 System.out.print("..Finished!\n");
		 }
		 catch (Exception ex) {
		 System.out.println(ex);
		 }
	 } 
	
	public void doSomthing() {
		//�}�l�W�Ҫ���
		start=1;
		snapShot();
		
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File(defaultName+"."+defaultImageFormat));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dimg = img.getScaledInstance(480, 250,Image.SCALE_SMOOTH);
		ImageIcon ii=new ImageIcon(dimg);
		parent.image.setIcon(ii);
		parent.image.setBounds(0, 90, 480, 250);
	}
}
