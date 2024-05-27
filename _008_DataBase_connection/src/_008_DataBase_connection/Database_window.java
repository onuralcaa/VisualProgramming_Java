package _008_DataBase_connection;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

public class Database_window extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static Connection con;
	private JTextField txtNo;
	private JTextField txtAd;
	private JTextField txtMemleket;
	private JTextField txtYas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Database_window frame = new Database_window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	//VERITABANI BAGLANMA
	public static void Baglan()
	{
		try {
			
			String url = "jdbc:mysql://localhost:3306/okul";
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, "root", "mysql");
			System.out.println("Bağlantı başarılı");
			
		}catch (Exception e) {
			System.out.println("Bağlantı başarısız.");
	}
		
	}
	
	
	//KAYIT BULMA
	public void Bul()
	{
		try {
			Statement sta = con.createStatement(); //try catch in içine yazılmalı...
			String sorgu = "Select * from ogrenci where Ogr_no = "+ txtNo.getText();
			
			ResultSet res = sta.executeQuery(sorgu);
			
			res.next();
			
			txtAd.setText(res.getString("Ogr_Ad"));
			txtMemleket.setText(res.getString("Ogr_Memleket"));
			txtYas.setText(res.getString("Ogr_Yas"));


		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	//BAGLANTI KAPATMA
	public static void Baglanti_kapat()
	{
		try {
			con.close();
			System.out.println("Bağlantı kapatıldı.");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Bağlantı kapatma başarısız.");
		}
	}
	
	//KAYIT EKLEME
	public void Ekle()
	{
		String  tAd, tMem, tYas;
		int tNo; //tablo olusturulurken int veri tipi ile yapildi.
		
		tNo = (int) Double.parseDouble(txtNo.getText());
		tAd = txtAd.getText();
		tMem = txtMemleket.getText();
		tYas = txtYas.getText();
		
		String sorgu = "Insert into ogrenci Values('"+tNo+"', '"+tAd+"', '"+tMem+"' ,'"+tYas+"')"; //HATA NOKTASI
		
		try {
			Statement sta = con.createStatement();
			sta.execute(sorgu);
			System.out.println("Kayıt eklendi.");

			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Kayıt eklenemedi.");

		}

	}
	
	//KAYIT SILME
	public void Sil()
	{
		
		
		try {
			String sorgu = "Delete from ogrenci where Ogr_No = "+txtNo.getText();
			Statement sta;
			
			sta = con.createStatement();
			
			sta.execute(sorgu);
			System.out.println("Kayıt başarılı bir şekilde silindi.");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Kayıt silinemedi." + e.toString());

		}
		
		

		
		
	}


	
	public Database_window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnAc = new JButton("Bağlantı Aç");
		btnAc.setBackground(new Color(0, 255, 0));
		btnAc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAc.setBounds(310, 8, 105, 44);
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Baglan();
				Baglanti_kapat();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnAc);
		
		JLabel lblNewLabel = new JLabel("Öğrenci Numarası");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(43, 57, 105, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Öğrenci Adı");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(43, 85, 105, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Öğrenci Memleket");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(43, 112, 105, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Öğrenci Yaş");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(43, 139, 105, 27);
		contentPane.add(lblNewLabel_3);
		
		txtNo = new JTextField();
		txtNo.setBounds(167, 60, 86, 17);
		contentPane.add(txtNo);
		txtNo.setColumns(10);
		
		txtAd = new JTextField();
		txtAd.setBounds(167, 87, 86, 17);
		contentPane.add(txtAd);
		txtAd.setColumns(10);
		
		txtMemleket = new JTextField();
		txtMemleket.setBounds(167, 114, 86, 17);
		contentPane.add(txtMemleket);
		txtMemleket.setColumns(10);
		
		txtYas = new JTextField();
		txtYas.setBounds(167, 145, 86, 17);
		contentPane.add(txtYas);
		txtYas.setColumns(10);
		
		JButton btnKaydet = new JButton("KAYDET");
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Baglan();
				Ekle();
				Baglanti_kapat();
			}
		});
		btnKaydet.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnKaydet.setBounds(310, 60, 105, 44);
		contentPane.add(btnKaydet);
		
		JButton btnGetir = new JButton("VERİ GETİR");
		btnGetir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Baglan();
				Bul();
				Baglanti_kapat();			
			}
		});
		btnGetir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnGetir.setBounds(310, 112, 105, 34);
		contentPane.add(btnGetir);
		
		JButton btnDuzenle = new JButton("DÜZENLE");
		btnDuzenle.setBackground(new Color(240, 240, 240));
		btnDuzenle.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDuzenle.setBounds(310, 154, 105, 34);
		contentPane.add(btnDuzenle);
		
		JButton btnSil = new JButton("SİL");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Baglan();
				Sil();
				Baglanti_kapat();
			}
		});
		btnSil.setBackground(new Color(255, 0, 0));
		btnSil.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSil.setBounds(310, 207, 105, 36);
		contentPane.add(btnSil);
	}
}
