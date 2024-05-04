package _002_1_Visual_2;

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
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jf = new JFrame();
		
		jf.setSize(500, 600);
		jf.setLocation(100, 200);
		jf.getContentPane().setLayout(new FlowLayout());
	
		JCheckBox cbE = new JCheckBox("Evet");
		JCheckBox cbH = new JCheckBox("Hayır");
		cbE.setBounds(200, 200, 50, 50);//sizing process
		
		JRadioButton rb1 = new JRadioButton("Erkek");
		
		//ComboBox a eleman ekleme
		String str[] = {"C", "C++", "Java", "PHP"};
		
		JComboBox cb1 = new JComboBox(str);
	
		
		//Hangi checkbox ın seçildiğini anlamak
		JButton btn1 = new JButton("Selected");
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String yaz = "Selected programming language "+cb1.getSelectedItem();
				System.out.println(yaz);
				
			}
		});
		
		//ögeleri container a dahil etme 
		jf.getContentPane().add(cbE); 
		jf.getContentPane().add(cbH); 
		jf.getContentPane().add(btn1);
		jf.getContentPane().add(rb1);
		jf.getContentPane().add(cb1);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
