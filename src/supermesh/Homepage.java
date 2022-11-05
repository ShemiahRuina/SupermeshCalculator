package supermesh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Homepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage frame = new Homepage();
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
	public Homepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 389);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUPERMESH CALCULATOR");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Adobe Heiti Std R", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(0, 0, 434, 76);
		contentPane.add(lblNewLabel);
		Image icon1 = new ImageIcon(this.getClass().getResource("/Icon1.png")).getImage();
		
		JButton btnNewButton_1 = new JButton("");
		Image icon2 = new ImageIcon(this.getClass().getResource("/Icon2.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(icon2));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Page2 nw = new Page2();
				nw.newScreen2();
			}
		});
		btnNewButton_1.setBounds(0, 87, 218, 135);
		contentPane.add(btnNewButton_1);
		
		
		JButton btnNewButton_3 = new JButton("");
		Image icon4 = new ImageIcon(this.getClass().getResource("/Icon4.png")).getImage();
		btnNewButton_3.setIcon(new ImageIcon(icon4));
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Page4 nw = new Page4();
				nw.newScreen4();
			}
		});
		btnNewButton_3.setBounds(216, 87, 218, 135);
		contentPane.add(btnNewButton_3);
		
		JTextPane txtpnSubmittedByBarosa = new JTextPane();
		txtpnSubmittedByBarosa.setText("Submitted by:\r\n\tBarosa, Genevieve A.\tLagadon, Mary Kaye S.\r\n\tCabason, Lea M.\tRuina, Shemiah P.\r\n\tJimeno, Ira Jane B.\t(BSECE 2B)\r\n\t\t\r\n");
		txtpnSubmittedByBarosa.setBounds(40, 247, 359, 76);
		contentPane.add(txtpnSubmittedByBarosa);
	}
}
