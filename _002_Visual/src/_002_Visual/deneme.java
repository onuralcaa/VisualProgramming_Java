package _002_Visual;

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
		
		btn1.setBackground(Color.yellow);
		btn1.setForeground(Color.red);
		
		Color newcolor = new Color(105, 208, 125); //color definition
		
		jf.getContentPane().setBackground(newcolor); //sensitivy color settings, crate and usage color 
		
		Color oldcolor = btn1.getBackground();
		
		JLabel lbl1 = new JLabel();
		
		jf.getContentPane().add(lbl1);
		
		Image img1 = new ImageIcon(deneme.class.getResource("/image/lblimage.png")).getImage();
		
		lbl1.setIcon(new ImageIcon(img1));
		
		
		
		btn1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				btn1.setBackground(oldcolor);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
			
				btn1.setBackground(Color.darkGray);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
		
		
		
		
		jf.setResizable(true);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
