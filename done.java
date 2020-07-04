import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class done {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					done window = new done();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public done() {
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
		JLabel lblYourTransactionIs = new JLabel("Your Transaction Is Successful");
		lblYourTransactionIs.setFont(new Font("Tahoma", Font.ITALIC, 27));
		lblYourTransactionIs.setBounds(494, 154, 378, 26);
		frame.getContentPane().add(lblYourTransactionIs);
		
		JLabel lblNewLabel = new JLabel("");
		JButton b=new JButton("", new ImageIcon("scard.png"));    
		b.setBounds(376, 215, 622, 380);    
		frame.add(b);    
		
		b.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	frame.dispose();
		    	SCard f=new SCard();
		    	f.setSize(1500,1500);
		    	f.setVisible(true);
		    	f.setLayout(null);
		    	f.addWindowListener(new WindowAdapter(){
		    	public void windowClosing(WindowEvent e){
		    	System.exit(0);
		    	}
		    	});
		    	}
				
		    	  
		    });
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblThankYouFor = new JLabel("Thank You For Using MyPocket! Click on the scratch card to try your luck on discounts, cashbacks, and more!");
		lblThankYouFor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblThankYouFor.setBounds(267, 606, 867, 26);
		frame.getContentPane().add(lblThankYouFor);
		
	}

}