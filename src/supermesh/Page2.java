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
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Page2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_4;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void newScreen2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page2 frame = new Page2();
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
	public Page2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("<< Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Homepage frame = new Homepage();
				frame.setVisible(true);
				dispose();
			}
			
			
		});
		btnNewButton.setBounds(5, 5, 99, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Page2.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(15, 35, 444, 174);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(68, 220, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("R1:");
		lblNewLabel_1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(36, 220, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(68, 251, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("R2:");
		lblNewLabel_2.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(35, 252, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("R3:");
		lblNewLabel_3.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(36, 283, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(68, 282, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_4 = new JLabel("R4:");
		lblNewLabel_4.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(36, 313, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(68, 312, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(277, 220, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(277, 251, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(343, 357, 56, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Is:");
		lblNewLabel_5.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(252, 220, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Vs:");
		lblNewLabel_6.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(252, 254, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("v2:");
		lblNewLabel_7.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(317, 358, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("i1:");
		lblNewLabel_8.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(46, 358, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("i2:");
		lblNewLabel_9.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(136, 358, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("i3:");
		lblNewLabel_10.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(222, 358, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		JButton btnNewButton_1 = new JButton("Calculate");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double num1, num2, num3, num4, num5, num6, num7, ans1, ans2, ans3;
			
				try {
					num1 = Float.parseFloat(textField.getText() ); 
					num2 = Float.parseFloat(textField_1.getText() ); 
					num3 = Float.parseFloat(textField_2.getText() ); 
					num4 = Float.parseFloat(textField_3.getText() ); 
					num5 = Float.parseFloat(textField_4.getText() ); 
					num6 = Float.parseFloat(textField_5.getText() ); 
								
					
					ans2 = ((num6*(num3+num4))-(num5*(num3+num4)*num1))/((num2*(num3+num4)*-1)-((num3+num4)*num1));
					ans1 = Math.round((ans2 - num5)*100.0)/100.0 ;
					num7 =	Math.round((ans2 * num2));
					ans3 = Math.round(((num6/(num3 + num4))));
					textField_6.setText(Double.toString(num7));
					textField_7.setText(Double.toString(ans1));
					textField_8.setText(Double.toString(ans2));
					textField_9.setText(Double.toString(ans3));
				}catch (Exception e){
					JOptionPane.showMessageDialog(null, "Please enter valid number");
			
				}
			
		
			}
			
		});
		btnNewButton_1.setBounds(166, 398, 89, 23);
		contentPane.add(btnNewButton_1);
		
		textField_7 = new JTextField();
		textField_7.setBounds(68, 357, 56, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(156, 357, 56, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(242, 357, 56, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
	}
}
