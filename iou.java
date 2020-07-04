import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map.Entry;

public class iou {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					iou window = new iou();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public iou() {
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
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("iou.png"));
		label.setBounds(528, 36, 392, 384);
		frame.getContentPane().add(label);
		JButton b=new JButton("Return");
		b.setBounds(1100,600,100,20);
		  b.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){
			    	 frame.dispose();
			    	Pockets f4=new Pockets(5);
					
			        }  
			    });
		  frame.add(b);
		
			String Sa[][]=new String [10][4];
		    Sa[0][0]= "IOU";
		    Sa[0][1]="Amount";
		    Sa[0][2]="UOMe";
		    Sa[0][3]="Amount";
		    for(Entry<String, DATA> entry:DATA.map.entrySet()){    
			       String key=entry.getKey();  
			        DATA ba=entry.getValue();  
			        int a;
			        if(key.contentEquals(Pockets.NAME)){
			        	if(ba.count1>ba.count2) {
			        		a=ba.count1;
			        	}
			        	else
			        		a=ba.count2;
			        	System.out.println(a);
			        for(int i=0;i<a;i++) {
			        	for(int j=0;j<4;j++) {
			        		Sa[i+1][j]=ba.S[i][j];
			        		
			        		
			        	}
			        }
			        
			        }}
			
	
		 
		 
		 
		 table = new JTable(Sa,new String[] {
					"IOU", "Amount", "UOMe", "Amount"
				});
//		table.setModel(new DefaultTableModel(
//			S,
//			new String[] {
//				"IOU", "Amount", "UOMe", "Amount"
//			}
//		));
//		
	
		
		table.setBounds(484, 484, 516, 160);
		frame.getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("KEEP TRACK OF WHO OWES YOU MONEY!");
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(101, 142, 419, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SO YOU NEVER FORGET PAYIN EM BACK!");
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 21));
		lblNewLabel_1.setBounds(930, 288, 430, 39);
		frame.getContentPane().add(lblNewLabel_1);
	}
}