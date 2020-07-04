import java.util.*;
import java.util.Map.Entry;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class Profile  extends Frame {
	String name;
	static int i;
	 int req_number;
	 BufferedImage img,img1;
	Profile(String name,int a){
		this.name=name;
		req_number=a;
		setLayout(null);
		
		 System.out.println(req_number);
		 DATA.change( name ,req_number);
		 for(Entry<String, DATA> entry:DATA.map.entrySet()){  
			 String key=entry.getKey();  
		        DATA b=entry.getValue();  
		        if(key.contentEquals(name) ) {
		        	int count=0;
		        	Button CD[]= new Button[3];
		        	Button delete[]= new Button[3];
		        	for ( i=0;i<3;i++) {
		        		
		        	if(b.Card_Number[i] !=0) {
		        		
		        		System.out.println(b.Card_Number[i]);
		        	 CD[i]=new Button(Integer.toString(b.Card_Number[i]));
		        	  delete[i]=new Button("delete");
		        	delete[i].setBounds(800,425+count,100,40);
		        	delete[i].setBackground(Color.red);
		        	delete[i].setForeground(Color.yellow);
		        	CD[i].setBounds(600,425+count,200,40);
		        	count=count+50;
		        	
		        	add(CD[i]);
		        	add(delete[i]);
		        	 delete[i].addActionListener(new ActionListener(){  
		 			    public void actionPerformed(ActionEvent e){
		 			    	
		 			    			 for(Entry<String, DATA> entry:DATA.map.entrySet()){  
		 			    				 String key=entry.getKey();  
		 			    			        DATA b=entry.getValue();  
		 			    			        if(key.contentEquals(name) ) {
		 			    			        	for(int a=0;a<3;a++) {
		 					 			    		if(e.getSource()==(delete[a])) {
		 					 			    			req_number=b.Card_Number[a];
		 					 			    			
		 					 			    			
		 					 			    		
		 			    			       
		 			    		                    }
		 			    			        	}
		 			    			        }
		 			    			        
		 			    	}
		 			    	
		 			    	dispose();
		 			    	
		 			    	
		 			    	
		 			    Profile  f=new Profile(name,req_number);
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
		        	
		        	}
		        	}
		        }
			}
		 Button R=new Button("RETURN");
		 R.setBounds(1150,650,100,50);
		 add(R);
		 R.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){
			    	dispose();
			    	Pockets f4=new Pockets(5);
					
			        }  
			    });
		 int fill=DATA.filled(name);
		 if(fill!=3) {
			 Button b2=new Button("+ ADD CARD");
			 b2.setForeground(Color.BLUE);
			 b2.setBounds(600,525,200,40);
			 add(b2);
			 b2.addActionListener(new ActionListener(){  
				    public void actionPerformed(ActionEvent e){  
				    	dispose();
				    	Pockets f3=new Pockets(3);
						f3.setSize(1500,1500);
						f3.setVisible(true);
						f3.setLayout(null);

						f3.addWindowListener(new WindowAdapter(){
						public void windowClosing(WindowEvent e){
						System.exit(0);
						}
						});
				        }  
				    });
			 
		 }
		 
		 
	}
	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(Color.white);
		g.fillRect(450, 100, 550, 550);
		try {
		      img1 = ImageIO.read(new File("connect.jpg"));
		   }
			catch (IOException e) {
	            e.printStackTrace();
	         }
		try {
		      img = ImageIO.read(new File("profile.png"));
		   }
			catch (IOException e) {
	            e.printStackTrace();
	         }
		
		g.drawImage(img1, 0,0 ,null);
		
		g.fillRect(450, 100, 550, 550);
		
		g.drawImage(img, 575,100 ,null);
		
		g2.setPaint(Color.BLUE);
		Font my = new Font("Serif", Font.ITALIC | Font.BOLD, 50);
  	    g.setFont(my);
		g.drawString(name, 650, 310);
		 for(Entry<String, DATA> entry:DATA.map.entrySet()){    
		       String key=entry.getKey();  
		        DATA b=entry.getValue();  
		        if(key.contentEquals(name) ) {
		       g2.setPaint(Color.green);
		       Font m = new Font("Serif", Font.ITALIC | Font.BOLD, 30);
		       g.setFont(m);
		g.drawString(" "+"RECIEVED"+" -RS"+b.rec+"", 600, 370);
		        }
		 }
		g2.setPaint(Color.MAGENTA);
		Font mys= new Font("Serif",  Font.BOLD, 25);
  	    g.setFont(mys);
		g.drawString(" CARDS ADDED:", 600, 420);
		
	
	}
	public static void main(String arg[]){
	DATA.Load();
    Profile  f=new Profile("Anitha",0);
	f.setSize(1500,1500);
	f.setVisible(true);
	f.setLayout(null);
	f.addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
	System.exit(0);
	}
	});
	}
}