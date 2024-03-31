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
	
		int vize, odev, final1;
		
		String svize = JOptionPane.showInputDialog("Please enter your exam 1 score");
		vize = Integer.parseInt(svize);
		
		while(vize < 0 || vize > 100)
		{
			svize = JOptionPane.showInputDialog(null, "Please enter your exam 1 score", "exam 1 score ", JOptionPane.WARNING_MESSAGE);
			vize = Integer.parseInt(svize);
		}
		
		String sodev = JOptionPane.showInputDialog("Please enter your homework score");
		odev = Integer.parseInt(sodev);
		
		while(odev < 0 || odev > 100)
		{
			sodev = JOptionPane.showInputDialog(null, "Please enter your homework score", "homework score ", JOptionPane.WARNING_MESSAGE);
			odev = Integer.parseInt(sodev);
		}
	
		
		String sfinal1 = JOptionPane.showInputDialog("Please enter your final score");
		final1 = Integer.parseInt(sfinal1);
		
		while(final1 < 0 || final1 > 100)
		{
			sfinal1 = JOptionPane.showInputDialog(null, "Please enter your final score", "final score ", JOptionPane.WARNING_MESSAGE);
			final1 = Integer.parseInt(sfinal1);
		}
		
		double notOrt = vize*0.4 + odev*0.1 + final1*0.5;
		String sonuc = "";
		
		if(notOrt > 50) sonuc = notOrt + " Passed.";
		else sonuc = notOrt + " Fail.";
		
		JOptionPane.showMessageDialog(null, sonuc);
		
		
		
		
		//-----------------------------------------------------------------------------------
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
