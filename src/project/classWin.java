package project;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class classWin extends win {
	mainWin parent;
	classTitleLabel title;
	classImage image;
	classStartButton startButton;
	classStopButton stopButton;
	classBackButton backButton;
	
	classWin(mainWin p)
	{
		parent = p;
		
		title = new classTitleLabel(this);
		jframe.add(title);
		
		image = new classImage(this);
		jframe.add(image);
		
		startButton = new classStartButton(this);
		jframe.add(startButton);
		stopButton = new classStopButton(this);
		jframe.add(stopButton);
		
		backButton = new classBackButton(this);
		jframe.add(backButton);
	}
}
