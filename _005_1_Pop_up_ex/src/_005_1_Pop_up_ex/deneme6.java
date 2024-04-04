package _005_1_Pop_up_ex;

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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class deneme6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame jf = new JFrame("Table example");
		jf.setSize(500, 600);
		jf.setLocation(100, 200);
		
		JPopupMenu pm = new JPopupMenu("Menu");
		
		JMenuItem cut = new JMenuItem("Cut");
		JMenuItem copy = new JMenuItem("Copy");
		JMenuItem paste = new JMenuItem("Paste");
		
		pm.add(cut);
		pm.add(copy);
		pm.add(paste);
		


		
		
		
		
		jf.setLayout(new FlowLayout());
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
