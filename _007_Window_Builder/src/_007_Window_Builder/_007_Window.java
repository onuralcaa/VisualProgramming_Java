package _007_Window_Builder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class _007_Window extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textSifre;
	private JTextField textName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_007_Window frame = new _007_Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public _007_Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textName = new JTextField();
		textName.setBounds(126, 65, 86, 17);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JButton btnGiris = new JButton("Giriş");
		btnGiris.setForeground(new Color(255, 0, 0));
		btnGiris.setBackground(new Color(255, 255, 255));
		btnGiris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGiris.setBounds(126, 140, 79, 19);
		contentPane.add(btnGiris);
		
		textSifre = new JTextField();
		textSifre.setBounds(126, 93, 86, 17);
		contentPane.add(textSifre);
		textSifre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Kullanıcı adı");
		lblNewLabel.setBounds(44, 65, 62, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Şifre");
		lblNewLabel_1.setBounds(44, 93, 62, 14);
		contentPane.add(lblNewLabel_1);
	}

}
