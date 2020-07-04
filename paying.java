import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.table.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.IOException;
import java.util.Map.Entry;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;

public class paying {
 String NME;
 int Amt;
	private JFrame frame;
	private JTextField textField_1;
	private JPasswordField passwordField;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paying window = new paying("Sahithi");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public paying(String name) {
		initialize(name);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String name) {
		frame = new JFrame();
//		try {
//			frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("back2..jpg")))));
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
		
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.setBounds(0,0,1700,1700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("payto.jpg"));
		label.setBounds(225, 72, 900, 322);
		frame.getContentPane().add(label);
		
		JLabel lblPayTo = new JLabel("PAY TO");
		lblPayTo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPayTo.setBounds(529, 405, 61, 14);
		frame.getContentPane().add(lblPayTo);
		
		JLabel lblNewLabel = new JLabel("AMOUNT");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(529, 456, 81, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(612, 456, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		JLabel lblCard = new JLabel("CARD");
		lblCard.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCard.setBounds(529, 507, 61, 14);
		frame.getContentPane().add(lblCard);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setEditable(true);
		comboBox.setBounds(612, 507, 124, 20);
		
		 
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(612, 405, 155, 20);
		frame.getContentPane().add(comboBox_1);
		for(Entry<String, DATA> entry:DATA.map.entrySet()){    
		       String key=entry.getKey();  
		        DATA b=entry.getValue(); 
		        if(!key.contentEquals(name))
		        comboBox_1.addItem(key);
		        if(key.contentEquals(name)) {
		        	
		       for(int i=0;i<3;i++) {
		    	   if(b.Card_Number[i] !=0)
		      comboBox.addItem(b.Card_Number[i]);
		       }
		        }
		        
		 }
		
		
		JButton btnClickHereTo = new JButton("Click to Add A New Card");
		btnClickHereTo.setBounds(772, 506, 151, 23);
                int fill=DATA.filled(name);
                if(fill !=3){
		btnClickHereTo.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	frame.dispose();
		    	
		    	Pockets f4=new Pockets(6);
				f4.setSize(1500,1500);
				f4.setVisible(true);
				f4.setLayout(null);

				
		  		
				f4.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e){
				System.exit(0);
				}
				});
		        }  
		    });
}
		frame.getContentPane().add(btnClickHereTo);
		
		JLabel lblNewLabel_1 = new JLabel("CVV");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(529, 556, 42, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(612, 556, 66, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnClickToPay = new JButton("CLICK TO PAY");
		btnClickToPay.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClickToPay.setBounds(830, 639, 176, 23);
		frame.getContentPane().add(btnClickToPay);
		JRadioButton BILL = new JRadioButton("BILL");
		BILL.setBounds(529, 575, 70, 23);
		frame.getContentPane().add(BILL);
		
		JRadioButton MEDICINE = new JRadioButton("MED");
		MEDICINE.setBounds(600, 575, 60, 23);
		frame.getContentPane().add(MEDICINE);
		
		JRadioButton SHOP = new JRadioButton("SHOP");
		SHOP.setBounds(680, 575, 70, 23);
		frame.getContentPane().add(SHOP);

		JRadioButton GROCERY = new JRadioButton("GROCERY");
		GROCERY.setBounds(750, 575, 100, 23);
		frame.getContentPane().add(GROCERY);
		ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(BILL);
        bgroup.add(SHOP);
        bgroup.add(MEDICINE);
        bgroup.add(GROCERY);
        
		
		JRadioButton rdbtnIou = new JRadioButton("IOU");
		rdbtnIou.setBounds(600, 603, 50, 23);
		frame.getContentPane().add(rdbtnIou);
		
		JRadioButton rdbtnUome = new JRadioButton("UOMe");
		rdbtnUome.setBounds(650, 603, 65, 23);
		frame.getContentPane().add(rdbtnUome);
		
		JRadioButton rdbtnSplitBill = new JRadioButton("Split Bill");
		rdbtnSplitBill.setBounds(720, 603, 100, 23);
		frame.getContentPane().add(rdbtnSplitBill);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(529, 507, 100, 14);
		frame.getContentPane().add(label_1);
		
		JRadioButton rdbtnNormal = new JRadioButton("Normal");
		rdbtnNormal.setSelected(true);
		rdbtnNormal.setBounds(529, 603, 80, 23);
		frame.getContentPane().add(rdbtnNormal);
		btnClickToPay.addActionListener( new ActionListener() {
	         
	          public void actionPerformed( ActionEvent aActionEvent ) {
	        	  NME=comboBox_1.getSelectedItem().toString();
			    	System.out.println(NME);
			    	Amt=Integer.parseInt(textField_1.getText());
					DATA.Rc(NME, Amt);
					if(rdbtnIou.isSelected()) {
						 String S[]={NME,""+Amt,"",""};
						 
						 for(Entry<String, DATA> entry:DATA.map.entrySet()){  
								
						       String key=entry.getKey();  
						        DATA b=entry.getValue();  
						        if(key.contentEquals(Pockets.NAME)){
						        	
						        	
						         int a=b.count1;
						         System.out.println(a);
						         for(int j=0;j<2;j++) {
						        	 b.S[a][j]=S[j];
						        	
						         }
						       
						        }
						       b.count1=b.count1+1;
						 }   
					}
					if(rdbtnUome.isSelected()) {
						 String S[]={"","",NME,""+Amt};
						 
						    DATA.UOME(Pockets.NAME,S);
					}
					 for(Entry<String, DATA> entry:DATA.map.entrySet()){    
					       String key=entry.getKey();  
					        DATA b=entry.getValue();  
					        if(key.contentEquals(name) ) {
					if(BILL.isSelected()) {
						b.Bill=b.Bill+Amt;
					}
					if(MEDICINE.isSelected()) {
						System.out.println("entered");
						b.Medical=b.Medical+Amt;
					}
					if(SHOP.isSelected()) {
						b.Shopping=b.Shopping+Amt;
					}
					if(GROCERY.isSelected()) {
						b.Grocery=b.Grocery+Amt;
					}
					        }
					 }
		if((passwordField.getText().length()) != 0) {
	        	  frame.dispose();
	           otp fr=new otp();
					}
	        }
		
	});
	}	 
}