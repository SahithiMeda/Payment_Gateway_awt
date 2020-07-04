
import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class otp {

	private JFrame frame;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					otp window = new otp();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public otp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0,0,1500,1500);
		frame.setVisible(true);
//		try {
//			frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("back2..jpg")))));
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 1370, 0);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(687, 491, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblOtp = new JLabel("OTP");
		lblOtp.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblOtp.setBounds(608, 489, 41, 17);
		frame.getContentPane().add(lblOtp);
		
		JLabel lblSentToYour = new JLabel("Sent to your registered mobile number");
		lblSentToYour.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSentToYour.setBounds(571, 522, 234, 20);
		frame.getContentPane().add(lblSentToYour);
		
		JLabel lblPleaseDoNot = new JLabel("Please do not click back or close this window");
		lblPleaseDoNot.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPleaseDoNot.setBounds(517, 169, 355, 14);
		frame.getContentPane().add(lblPleaseDoNot);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("loading.jpg"));
		lblNewLabel.setBounds(571, 214, 224, 225);
		frame.getContentPane().add(lblNewLabel);
		JButton b=new JButton("NEXT");
		b.setBounds(900,500,100,20);
		frame.add(b);
		 if(textField.getText()!="") {
		 b.addActionListener( new ActionListener() {
	        
	        	public void actionPerformed( ActionEvent aActionEvent ) {
	        	  frame.dispose();
	            done fr=new done();
	          }
	        } );
	}}

}
