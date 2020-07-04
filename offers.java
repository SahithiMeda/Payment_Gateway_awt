import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class offers {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					offers window = new offers();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public offers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0,0,1500,1500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		JLabel lblOffersRewardsCoupons = new JLabel("OFFERS! REWARDS! COUPONS! DEALS! CASHBACKS! AND MUCH MORE!! ");
		lblOffersRewardsCoupons.setFont(new Font("Stencil", Font.BOLD, 25));
		lblOffersRewardsCoupons.setBounds(259, 44, 882, 38);
		frame.getContentPane().add(lblOffersRewardsCoupons);
		
		JLabel lblOnlyOnYour = new JLabel("Only On Your MyPocket!");
		lblOnlyOnYour.setFont(new Font("Stencil", Font.BOLD, 24));
		lblOnlyOnYour.setBounds(563, 93, 330, 38);
		frame.getContentPane().add(lblOnlyOnYour);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("vacay.png"));
		label.setBounds(236, 129, 950, 315);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("cb_offer.png"));
		label_1.setBounds(226, 483, 420, 255);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("pizza.png"));
		label_2.setBounds(667, 483, 519, 255);
		frame.getContentPane().add(label_2);
		
		JLabel lblNewLabel = new JLabel("USE THE COUPON CODE MPVACAY999 WHEN BOOKING FLIGHTS/HOTELS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(354, 455, 744, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("COUPON CODE ");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setFont(new Font("Segoe Script", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(41, 538, 181, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblMpseven = new JLabel("MPSEVEN70");
		lblMpseven.setFont(new Font("Stencil", Font.PLAIN, 21));
		lblMpseven.setBounds(72, 581, 116, 34);
		frame.getContentPane().add(lblMpseven);
		JButton b=new JButton("Return");
		b.setBounds(50,650,100,20);
		  b.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){
			    	 frame.dispose();
			    	Pockets f4=new Pockets(5);
					
			        }  
			    });
		  frame.add(b);
		JLabel label_3 = new JLabel("COUPON CODE ");
		label_3.setVerticalAlignment(SwingConstants.TOP);
		label_3.setFont(new Font("Segoe Script", Font.PLAIN, 21));
		label_3.setBounds(1189, 550, 181, 34);
		frame.getContentPane().add(label_3);
		
		JLabel lblMppiz = new JLabel("MPPIZ150");
		lblMppiz.setFont(new Font("Stencil", Font.PLAIN, 21));
		lblMppiz.setBounds(1189, 592, 116, 34);
		frame.getContentPane().add(lblMppiz);
	}
}