package _002_1_Visual_2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jf = new JFrame();
		
		jf.setSize(500, 600);
		jf.setLocation(100, 200);
		jf.getContentPane().setLayout(new FlowLayout());
	
		JCheckBox cbE = new JCheckBox("Evet");
		JCheckBox cbH = new JCheckBox("Hayır");

		cbE.setBounds(200, 200, 50, 50);
		
		jf.getContentPane().add(cbE); 
		jf.getContentPane().add(cbH); 

		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
