package _006_1_Progress_Bar;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class deneme7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame jf = new JFrame("Table example");
		jf.setSize(500, 600);
		jf.setLocation(100, 200);
		
		//oluşturma ve sınır belirleme
		JProgressBar pb = new JProgressBar(0, 2000);
		pb.setBounds(50, 50, 160, 40);
		
		pb.setValue(0);
		pb.setStringPainted(true);
		
		jf.add(pb);
		
		jf.setLayout(new FlowLayout());
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int i = 0;
		
		while(i <= 2000) //bitiş noktasına kadar
		{
			pb.setValue(i);
			
			
			//işlemi yavaşlatma**********ÖNEMLİ
			try {
				
				Thread.sleep(100); //100 ms uyutma/bekletme/geciktirme
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}i = i +  20;
		}
		
	
	}

}
