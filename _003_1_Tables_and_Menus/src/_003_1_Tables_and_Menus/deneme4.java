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
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class deneme4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jf = new JFrame("Table example");
		jf.setSize(500, 600);
		jf.setLocation(100, 200);
		
		String [][] data = { 
				{"1", "Onur", "Osmaniye"}, 
				{"2", "Betul", "Kahramanmaraş"},
				{"3", "Osman", "Ankara"}
				
		};
		
		String [][] headers = { 
				{"Numara", "İsim", "Memleket"}, 
		}; 
		
		JTable table = new JTable(data, headers);
		JScrollPane sp = new JScrollPane(table);
		jf.add(sp);
		
		
		jf.setLayout(null);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
