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
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.ImageIcon;

public class _007_Window extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textEkran;
	private double answer, number;
	int operator;

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
	public void calculate()
	{
		switch(operator)
		{
		case 1: //Toplama
			answer = number + Double.parseDouble(textEkran.getText());
			textEkran.setText(Double.toString(answer)); //ustteki islemin tersi
			break;
			
		case 2: //Cıkarma
			answer = number - Double.parseDouble(textEkran.getText());
			textEkran.setText(Double.toString(answer)); //ustteki islemin tersi
			break;
			
		case 3:
			answer = number * Double.parseDouble(textEkran.getText());
			textEkran.setText(Double.toString(answer)); //ustteki islemin tersi
			break;
			
		case 4:
			answer = number / Double.parseDouble(textEkran.getText());
			textEkran.setText(Double.toString(answer)); //ustteki islemin tersi
			break;
		}
	}

	
	public void addInput(String str)
	{
		textEkran.setText(textEkran.getText() + str);
	}
	
	
	
	/**
	 * Create the frame.
	 */
	
	public _007_Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textEkran = new JTextField();
		textEkran.setBounds(106, 20, 356, 49);
		contentPane.add(textEkran);
		textEkran.setColumns(10);
		
		JLabel lblSonuc = new JLabel("SONUC");
		lblSonuc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSonuc.setBounds(527, 20, 81, 49);
		contentPane.add(lblSonuc);
		
		JPanel panel = new JPanel();
		panel.setBounds(44, 90, 612, 379);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 4, 10, 10));
		
		
		
		//------------------------------------------------------------------
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand()); //butonun degerini alma
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btn9);
		
		
		//------------------------------------------------------------------
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand()); //butonun degerini alma
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btn8);
		
		
		//------------------------------------------------------------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand()); //butonun degerini alma
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btn7);
		
		
		
		//------------------------------------------------------------------
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand()); //butonun degerini alma
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btn6);
		
		
		//------------------------------------------------------------------
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand()); //butonun degerini alma
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btn5);
		
		
		//------------------------------------------------------------------
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand()); //butonun degerini alma
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btn4);
		
		
		//------------------------------------------------------------------
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand()); //butonun degerini alma
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btn3);
		
		
		//------------------------------------------------------------------
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand()); //butonun degerini alma
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btn2);
		
		
		//------------------------------------------------------------------
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand()); //butonun degerini alma
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btn1);
		
		
		
		
		
		//------------------------------------------------------------------
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand()); //butonun degerini alma
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btn0);
		
		
		//------------------------------------------------------------------
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textEkran.setText("  ");//ekran temizleme
				lblSonuc.setText(" ");
				answer = 0;
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnClear);
		
		//------------------------------------------------------------------
				JButton btnTopla = new JButton("+");
				btnTopla.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						number = Double.parseDouble(textEkran.getText());
						operator = 1;
						textEkran.setText("");//CLEAR
						lblSonuc.setText(number + e.getActionCommand());
						
					}
				});
				btnTopla.setFont(new Font("Tahoma", Font.PLAIN, 32));
				panel.add(btnTopla);
				
		
		
		//------------------------------------------------------------------
				JButton btnCikar = new JButton("-");
				btnCikar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						number = Double.parseDouble(textEkran.getText());
						operator = 2;
						textEkran.setText("");//CLEAR
						lblSonuc.setText(number + e.getActionCommand());
					}
				});
				btnCikar.setFont(new Font("Tahoma", Font.PLAIN, 32));
				panel.add(btnCikar);
		
		
		
		//------------------------------------------------------------------
		JButton btnCarp = new JButton("X");
		btnCarp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(textEkran.getText());
				operator = 3;
				textEkran.setText("");//CLEAR
				lblSonuc.setText(number + e.getActionCommand());				
			}
		});
		btnCarp.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnCarp);
		
		
		//------------------------------------------------------------------

		JButton btnBol = new JButton("/");
		btnBol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(textEkran.getText());
				operator = 4;
				textEkran.setText("");//CLEAR
				lblSonuc.setText(number + e.getActionCommand());
			}
		});
		btnBol.setFont(new Font("Tahoma", Font.PLAIN, 32));
		panel.add(btnBol);
		
		//------------------------------------------------------------------
				JButton btnSonuc = new JButton("=");
				btnSonuc.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						calculate();
						lblSonuc.setText("");;
					}
				});
				btnSonuc.setFont(new Font("Tahoma", Font.PLAIN, 32));
				panel.add(btnSonuc);
				
	}
}
