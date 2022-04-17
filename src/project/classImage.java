package project;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.net.URL;

public class classImage extends JLabel{
	classWin parent;

	classImage(classWin p)
	{
		parent = p;
		
		
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("E:\\xampp\\htdocs\\Hello.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dimg = img.getScaledInstance(480, 250,Image.SCALE_SMOOTH);
		ImageIcon ii=new ImageIcon(dimg);
		this.setIcon(ii);
		this.setBounds(0, 90, 480, 250);
	}
}
