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
	classWhoButton whoButton;
	classChatButton chatButton;
	classChatWin chatWin;
	classTimer timer;
	
	classWin(mainWin p)
	{
		parent = p;
		
		title = new classTitleLabel(this);
		jframe.add(title);
		
		image = new classImage(this);
		jframe.add(image);
		timer = new classTimer(this);
		
		startButton = new classStartButton(this);
		jframe.add(startButton);
		stopButton = new classStopButton(this);
		jframe.add(stopButton);
		whoButton = new classWhoButton(this);
		jframe.add(whoButton);
		
		chatButton = new classChatButton(this);
		jframe.add(chatButton);
		chatWin = new classChatWin(this);
		
		backButton = new classBackButton(this);
		jframe.add(backButton);
	}
}
