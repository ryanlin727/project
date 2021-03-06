package project;

import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.Position;

public class mainWin extends win{
	announcementEnterButton aeb;
	announcementWin aWin;
	classEnterButton ceb;
	classWin cWin;
	testEnterButton teb;
	testWin tWin;
	homeworkEnterButton heb;
	homeworkWin hWin;
	
	titleLabel title;
	
	mainWin() {
		//首頁視窗可見
		jframe.setVisible(true);
		
		//標題
		title = new titleLabel(this);
		jframe.add(title);
		
		//其他視窗進入按鈕
		aeb = new announcementEnterButton(this);
		jframe.add(aeb);
		ceb = new classEnterButton(this);
		jframe.add(ceb);
		teb = new testEnterButton(this);
		jframe.add(teb);
		heb = new homeworkEnterButton(this);
		jframe.add(heb);
		
		//建立其他視窗
		aWin = new announcementWin(this);
		cWin = new classWin(this);
		tWin = new testWin(this);
		hWin = new homeworkWin(this);
	}
	
	
}
