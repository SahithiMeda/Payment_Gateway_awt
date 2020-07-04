import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Map.Entry;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Gift {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gift window = new Gift("Sahithi");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gift(String name) {
		initialize(name);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String name) {
		
		frame = new JFrame();
		frame.setBounds(0,0,1500,1500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		JLabel lblGiftYourLoved = new JLabel("Gift Your Loved Ones Via MyPocket!");
		lblGiftYourLoved.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 24));
		lblGiftYourLoved.setBounds(30, 39, 481, 51);
		frame.getContentPane().add(lblGiftYourLoved);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("Gift_card.png"));
		label_1.setBounds(1119, 29, 211, 200);
		frame.getContentPane().add(label_1);
		
		JLabel lblBirthdayAnniversaryHousewarming = new JLabel("Birthday, Anniversary, Housewarming, Baby Shower, whatever be the occasion, we've got you covered! ");
		lblBirthdayAnniversaryHousewarming.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 18));
		lblBirthdayAnniversaryHousewarming.setBounds(10, 101, 1010, 28);
		frame.getContentPane().add(lblBirthdayAnniversaryHousewarming);
		
		JLabel lblNewLabel = new JLabel("Gift them a MyPocket Gift CARD this festive season and spread the love!");
		lblNewLabel.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 18));
		lblNewLabel.setBounds(42, 140, 725, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("circle_Gift.png"));
		label.setBounds(30, 230, 522, 519);
		frame.getContentPane().add(label);
		
		JLabel lblSendTo = new JLabel("Send To");
		lblSendTo.setFont(new Font("Lucida Calligraphy", Font.BOLD, 18));
		lblSendTo.setBounds(674, 289, 93, 28);
		frame.getContentPane().add(lblSendTo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setBounds(796, 296, 219, 20);
		frame.getContentPane().add(comboBox);
		
		
		JLabel lblChooseCard = new JLabel("Choose Card");
		lblChooseCard.setFont(new Font("Lucida Calligraphy", Font.BOLD, 18));
		lblChooseCard.setBounds(632, 358, 135, 14);
		frame.getContentPane().add(lblChooseCard);
		
		JLabel label_2 = new JLabel("Send To");
		label_2.setFont(new Font("Lucida Calligraphy", Font.BOLD, 18));
		label_2.setBounds(674, 289, 93, 28);
		frame.getContentPane().add(label_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(796, 358, 219, 20);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Lucida Calligraphy", Font.BOLD, 18));
		lblAmount.setBounds(666, 419, 101, 14);
		frame.getContentPane().add(lblAmount);
		JButton b=new JButton("Return");
		b.setBounds(900,500,100,20);
		JButton b1=new JButton("Pay");
		b1.setBounds(900,419,100,20);
		frame.add(b1);
	    frame.add(b);
	    b1.addActionListener( new ActionListener() {
	         
	          public void actionPerformed( ActionEvent aActionEvent ) {
	        	  frame.dispose();
	           otp fr=new otp();
	          }
	        } );
	    for(Entry<String, DATA> entry:DATA.map.entrySet()){    
		       String key=entry.getKey();  
		        DATA B=entry.getValue(); 
		        if(!key.contentEquals(name))
		        comboBox.addItem(key);
		        if(key.contentEquals(name)) {
		        	
		       for(int i=0;i<3;i++) {
		    	   if(B.Card_Number[i] !=0)
		      comboBox_1.addItem(B.Card_Number[i]);
		       }
		        }
		        
		 }
	    b.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	 frame.dispose();
		    	Pockets f4=new Pockets(5);
				
		        }  
		    });
		textField = new JTextField();
		textField.setBounds(796, 419, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
