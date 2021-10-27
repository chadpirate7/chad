package test20210618_4;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class test20211027_2 {
	public MyFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		
		setSize(300, 200);
		
		setLocation(screenSize.width / 2, screenSize.height / 2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		Image img = kit.getImange("icon.png");
		setIconImage(img);
		setLayout(new FlowLayout());
		JButton btn = new JButton("¹öÆ°");
		this.add(btn);
		setVisible(true);
		
	}

}
