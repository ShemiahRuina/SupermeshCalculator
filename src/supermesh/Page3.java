package supermesh;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;

public class Page3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void newScreen3() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page3 frame = new Page3();
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
	public Page3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 544);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 0, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Page3.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 22, 434, 244);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(91, 277, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(91, 308, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(91, 339, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(91, 369, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(293, 277, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(293, 308, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(293, 339, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(293, 369, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Calculate");
		btnNewButton_1.setBounds(191, 409, 89, 23);
		contentPane.add(btnNewButton_1);
		
		textField_8 = new JTextField();
		textField_8.setText("");
		textField_8.setBounds(55, 443, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(211, 443, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(353, 443, 86, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(239, 474, 86, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Vs:");
		lblNewLabel_1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(63, 277, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("R1:");
		lblNewLabel_2.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(63, 308, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("R2:");
		lblNewLabel_3.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(63, 339, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("C1:");
		lblNewLabel_4.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(63, 370, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("C2:");
		lblNewLabel_5.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(266, 277, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("L2:");
		lblNewLabel_6.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(266, 308, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Is1:");
		lblNewLabel_7.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(266, 339, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Is2:");
		lblNewLabel_8.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(266, 369, 46, 14);
		contentPane.add(lblNewLabel_8);
	}
}
