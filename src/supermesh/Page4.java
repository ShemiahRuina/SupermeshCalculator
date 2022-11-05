package supermesh;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mathworks.engine.MatlabEngine;
import com.mathworks.engine.EngineException;
import com.mathworks.engine.MatlabExecutionException;
import com.mathworks.engine.MatlabSyntaxException;


import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutionException;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Page4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	

	/**
	 * Launch the application.
	 */
	public static void newScreen4() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page4 frame = new Page4();
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
	public Page4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 659);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("<< Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage frame = new Homepage();
				frame.setVisible(true);
				dispose();
			}
		
		});
		btnNewButton.setBounds(0, 0, 101, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Page4.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(10, 53, 434, 231);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(95, 406, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 437, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(95, 468, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(95, 499, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(306, 405, 62, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(306, 436, 62, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(306, 467, 62, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Calculate");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				try  {
					double vs, is, r1, r2, c1, c2, l1, m1, m2, n1, n2, o1, o2,real1,real2, u1,u2, p1, p2, q1, q2, s1, s2;
					
					vs = Double.parseDouble(textField.getText()) ;
					is = Double.parseDouble(textField_1.getText()) ;
					r1 = Double.parseDouble(textField_2.getText()) ;
					r2 = Double.parseDouble(textField_3.getText()) ;
					c1 = Double.parseDouble(textField_4.getText()) ;
					c2 = Double.parseDouble(textField_5.getText()) ;
					l1 = Double.parseDouble(textField_6.getText()) ;
					
					m1 = (vs+r2*is)*r2;
					m2 = ((vs+r2*is))*((l1-c1)- c2);
					
					n1 = (1*r1*r2)-(c1*c2*is);
					n2 = (-1*r1*c1)+(-1* r2*c2*is);
					
					o1 = m1 - n1;
					o2 = m2 - n2;
					
					real1 = Math.sqrt((o1*o1)+(o2*o2));
						
						double theta1 = 0;
						
						if (o1 != 0)
						    theta1 = Math.atan(o2/o1);
					      
						else if (o2 != 0)
						    theta1 = Math.PI/2.0;
					      
						if (o1 < 0)
						    theta1 += Math.PI;
					        else if (o2 < 0)
						    if (o1 == 0)
							theta1 += Math.PI;
						    else 
							theta1 += 2.0 * Math.PI;
						        
						
					p1 = ((r1 + r2)*r2)+(c1*((l1-c1)-c2));
					p2 = ((r1 + r2)*(l1-c1-c2))+(-1*r2*c1);
					
					q1 =(-1*r2*-1*r2)+ (-1*c1*c1);
					q2 = (-1*r2*c1) + (-1*r2*c1);
					
					u1 = p1 - q1;
					u2 = p2 - q2;
						
					real2 = Math.sqrt((u1*u1)+(u2*u2));
					
					double theta2 = 0;
					
					if (u1 != 0)
					    theta2 = Math.atan(u2/u1);
				      
					else if (u2 != 0)
					    theta2 = Math.PI/2.0;
				      
					if (u1 < 0)
					    theta2 += Math.PI;
				        else if (u2 < 0)
					    if (u1 == 0)
						theta2 += Math.PI;
					    else 
						theta2 += 2.0 * Math.PI;
					
					s1 = real1/real2;
					s2 = 360 - Math.toDegrees(theta1);
					double s3 = 360 - Math.toDegrees(theta2);
					double s4 = (s2 - s3)*-1;
					
					double ans1, ans2;
					ans1 = Math.round(s1*100.0)/100.0;
					ans2 = Math.round(s4*100.0)/100.0;
					
		
				textField_7.setText(Double.toString(ans1)); 
				textField_8.setText(Double.toString(ans2)); 
				
				
					
				} catch (Exception e) {
				
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				} 
		
			
				
			}
	});
		btnNewButton_1.setBounds(295, 498, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Vs:");
		lblNewLabel_1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(65, 406, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Is:");
		lblNewLabel_2.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(65, 438, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("R1:");
		lblNewLabel_3.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(65, 468, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("R2:");
		lblNewLabel_4.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(65, 500, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("C1:");
		lblNewLabel_5.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(276, 405, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("C2:");
		lblNewLabel_6.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(276, 438, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("L1:");
		lblNewLabel_7.setFont(new Font("Arial Unicode MS", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(276, 469, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_7 = new JTextField();
		textField_7.setBounds(157, 550, 54, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(260, 550, 51, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("j");
		lblNewLabel_10.setFont(new Font("Arial Unicode MS", Font.BOLD, 20));
		lblNewLabel_10.setBounds(378, 462, 46, 23);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblj_1 = new JLabel("-j");
		lblj_1.setFont(new Font("Arial Unicode MS", Font.BOLD, 20));
		lblj_1.setBounds(378, 431, 46, 23);
		contentPane.add(lblj_1);
		
		JLabel lblj = new JLabel("-j");
		lblj.setFont(new Font("Arial Unicode MS", Font.BOLD, 20));
		lblj.setBounds(378, 400, 46, 23);
		contentPane.add(lblj);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(186, 401, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Find Io");
		lblNewLabel_9.setFont(new Font("Arial Unicode MS", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(53, 22, 101, 28);
		contentPane.add(lblNewLabel_9);
		
		JTextPane txtpnTryVs = new JTextPane();
		txtpnTryVs.setBackground(Color.WHITE);
		txtpnTryVs.setFont(new Font("Arial Unicode MS", Font.ITALIC, 13));
		txtpnTryVs.setText("try :\r\n\tVs = 50\t\tC1 = 4\r\n\tIs = 2\t\tC2 = 6\r\n\tR1 = 10\t\tL1 = 8\r\n\tR2 = 5");
		txtpnTryVs.setBounds(65, 276, 345, 103);
		contentPane.add(txtpnTryVs);
		
		lblNewLabel_11 = new JLabel("Io:");
		lblNewLabel_11.setFont(new Font("Arial Unicode MS", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(124, 550, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/Icon5.png")).getImage();
		lblNewLabel_12.setIcon(new ImageIcon(img2));
		lblNewLabel_12.setBounds(218, 544, 32, 26);
		contentPane.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/Icon6..png")).getImage();
		lblNewLabel_13 .setIcon(new ImageIcon(img3));
		lblNewLabel_13 .setBounds(321, 537, 39, 33);
		contentPane.add(lblNewLabel_13);
	}
}
