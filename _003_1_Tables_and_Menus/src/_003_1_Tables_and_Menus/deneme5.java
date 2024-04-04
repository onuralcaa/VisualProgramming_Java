package _003_1_Tables_and_Menus;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class deneme5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jf = new JFrame("Table example");
		jf.setSize(500, 600);
		jf.setLocation(100, 200);
		
		JMenuBar mb = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenu submenu = new JMenu("Submenu");
		
		//menu ekleme
		JMenuItem i1 = new JMenuItem("File");
		JMenuItem i2 = new JMenuItem("Open File");
		JMenuItem i3 = new JMenuItem("Recent Files");
		JMenuItem i4 = new JMenuItem("Close Editor");
		
		//alt menuler 
		JMenuItem a1 = new JMenuItem("Java Project");
		JMenuItem a2 = new JMenuItem("Maven Project");
		
		submenu.add(a1);
		submenu.add(a2);
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(i4);

		menu.add(submenu);
		mb.add(menu);
		
		jf.setJMenuBar(mb); //son aşama
	

		
		jf.setLayout(new FlowLayout());
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
