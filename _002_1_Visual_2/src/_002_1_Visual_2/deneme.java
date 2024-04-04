package _002_1_Visual_2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jf = new JFrame();
		
		jf.setSize(500, 600);
		jf.setLocation(100, 200);
		
		jf.getContentPane().setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Send");
		jf.getContentPane().add(btn1);
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
