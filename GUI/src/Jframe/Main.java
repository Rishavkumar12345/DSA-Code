package Jframe;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class Main {
	public static void main(String args[]) {
		
		ImageIcon image1=new ImageIcon("peter.gif");
		Border border=BorderFactory.createLineBorder(Color.red, 3);
		
		JLabel label=new JLabel();
		label.setText("hello to gui interface");
		label.setIcon(image1);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.CENTER);
		label.setForeground(Color.white);
		label.setBackground(Color.black);
		label.setIconTextGap(100);
		label.setFont(new Font("hello",Font.PLAIN,20));
		label.setOpaque(true);
		label.setBorder(border);
		
		JFrame frame=new JFrame();
		frame.setTitle("Welcome To Jframe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setResizable(false);
		frame.setSize(420,420);
		frame.setVisible(true);
		
		ImageIcon image=new ImageIcon("peter.gif");
		frame.setIconImage(image.getImage());
		//frame.getContentPane().setBackground(Color.blue);
		frame.add(label);
		
	}
}
