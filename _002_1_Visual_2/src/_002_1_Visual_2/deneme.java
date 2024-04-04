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
import javax.swing.JTextArea;

public class deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jf = new JFrame();
		
		jf.setSize(500, 600);
		jf.setLocation(100, 200);
		
		jf.getContentPane().setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Send");
		jf.getContentPane().add(btn1);
		
		JTextArea ar1 = new JTextArea();
		
		JLabel lblKelime = new JLabel();
		JLabel lblMetin = new JLabel();
		
		jf.getContentPane().add(ar1);
		jf.getContentPane().add(lblKelime);
		jf.getContentPane().add(lblMetin);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String metin = ar1.getText(); //string metin alma
				String kelime[] = metin.split("\\s"); //her bir boşlukta bu kelimeleri alıp diziye atma işlemi
				
				lblMetin.setText("Karakter sayısı : " +metin.length());
				lblKelime.setText("Kelime sayısı : "+kelime.length);
				
			}
		});
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
