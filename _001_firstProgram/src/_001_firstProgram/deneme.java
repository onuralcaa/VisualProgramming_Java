package _001_firstProgram;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		JFrame jf = new JFrame();
		
		jf.setTitle("First");
		
		jf.setSize(500,600); //pencere boyutu
		
		jf.setLocation(100, 200);
		
		jf.getContentPane().setLayout(new FlowLayout()); //container added.
		
		JTextField txt1 = new JTextField(20);
		JButton btn1 = new JButton("Send");
		JLabel jlbl1 = new JLabel();
		jlbl1.setText("Please enter name :");
		
		jf.getContentPane().add(jlbl1);
		jf.getContentPane().add(txt1);
		jf.getContentPane().add(btn1);
		
		
		//butona tıklandığına gerçekleşecek komutlar
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jlbl1.setText("Hello "  + txt1.getText() + " welcome to first code.");
				
			}
		});
		
		JButton btn2 = new JButton("Click");
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JOptionPane panel = new JOptionPane();
				panel.showMessageDialog(null, "Hello, this is a new window.");
				
			}
		});
		
		JButton btn3 = new JButton("Get name");
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String isim = JOptionPane.showInputDialog("Please enter name : ");
				
				JOptionPane.showMessageDialog(null, isim);
			}
		});
		
		jf.getContentPane().add(btn3);
		jf.getContentPane().add(btn2);
		
		jf.setResizable(false); //pencere ölçeklendirme açık/kapalı
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
