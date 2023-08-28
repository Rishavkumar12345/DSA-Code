package pratice;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class first {
	public static void main(String args[]) {
		
		JLabel label=new JLabel();
		label.setText("hello to gui interface");
		//label.setIcon(image1);
		//label.setHorizontalTextPosition(JLabel.CENTER);
		//label.setVerticalTextPosition(JLabel.TOP);
		//label.setForeground(new Color(0x00FF00));
		
		JFrame frame=new JFrame();
		frame.setTitle("Welcome To Jframe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(420,420);
		frame.setVisible(true);
	}
}
