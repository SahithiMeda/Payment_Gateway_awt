import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class Ani extends Frame {
	BufferedImage img,img8,img1,img2,img3,img4,img5;
	Ani(String NAME){
		Button b1=new Button("PROFILE");
		b1.setFont(new Font("Serif",  Font.BOLD, 15));
		b1.setBounds(1050, 300, 100, 100);
		add(b1);
		b1.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	dispose();
//		   
		    	Profile  f=new Profile(NAME,0);
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
		
		
//		Button b2=new Button("SETTINGS");
//		b2.setBounds(100, 150, 100, 100);
//		add(b2);
		Button b6=new Button("LOGOUT");
		b6.setFont(new Font("Serif",  Font.BOLD, 15));
		b6.setBounds(1175, 300, 100, 100);
		b6.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	dispose();
		    	Pockets  f=new Pockets(1);
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
		add(b6);
		Button b3=new Button("BUDGET TRAKER");
		b3.setFont(new Font("Serif",  Font.BOLD, 10));
		b3.setBounds(400, 300, 100, 100);
		add(b3);
		Button b4=new Button("GIFT CARD");
		b4.setFont(new Font("Serif",  Font.BOLD, 15));
		b4.setBounds(200, 500, 100, 100);
		add(b4);
		Button b5=new Button("OFFERS");
		b5.setFont(new Font("Serif",  Font.BOLD, 15));
		b5.setBounds(750, 300, 100, 100);
		add(b5);
		b4.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	dispose();
		    	Gift window = new Gift(NAME);
				
		    	}  
		    });
		b5.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	dispose();
		    	offers window = new offers();
				
		    	}  
		    });
		
		
		Button b7=new Button("IOU");
		b7.setFont(new Font("Serif",  Font.BOLD, 15));
		b7.setBounds(600, 500, 100, 100);
		add(b7);
		b7.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	dispose();
		    	iou window = new iou();
				
		    	}  
		    });
		Button b8=new Button("CLICK TO PAY");
		
		b8.setFont(new Font("Serif",  Font.BOLD, 25));
		b8.setBackground(Color.YELLOW);
		b8.setForeground(Color.blue);
		
		b8.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	dispose();
		    	paying window = new paying(NAME);
				
		    	}  
		    });
		
		
		b8.setBounds(1100, 450, 200, 200);
		add(b8);
	
		b3.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	dispose();
		    	Budget  f=new Budget(NAME);
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
	
	void draw() {
		
		Graphics g=this.getGraphics();
		 Graphics2D g2 = (Graphics2D) g;
		 try {
			 img1 = ImageIO.read(new File("bj.jpg"));
			 img2 = ImageIO.read(new File("sd.jpg"));
			 img3 = ImageIO.read(new File("IOU.jpg"));
			 img4 = ImageIO.read(new File("gift.png"));
		      img5 = ImageIO.read(new File("click.jpg"));
		      img8 = ImageIO.read(new File("ppic.png"));
		   }
			catch (IOException e) {
	            e.printStackTrace();
	         }
		 
		g.drawImage(img1, 50, 275, null);
		g.drawImage(img2, 500, 300, null);
		g.drawImage(img3, 375, 475, null);
		g.drawImage(img4, 250, 500, null);
		g.drawImage(img5, 900, 450, null);
	    g.drawImage(img8, 950, 300, null);
		
		int count1=5;
		int count=30;
		for(int i=0;i<10;i++) {
			try {
			      img = ImageIO.read(new File("walk.jpg"));
			   }
				catch (IOException e) {
		            e.printStackTrace();
		         }
			try {
			Thread.sleep(400);
			
//			
			g2.setPaint(Color.white);
			
			 g.fillRect(0, 0, 1500, 1000);
			 Font newFont = new Font("Serif",  Font.BOLD, 140);
			 g.setFont(newFont);
	   	     g2.setPaint(Color.RED);
	   	    
	   	     g2.drawString("P O C K E T S", 115, 190);
	   	     g2.setPaint(Color.white);
	   	     g.fillRect(40+count, 0, 1500, 250);
			 g.drawImage(img,60+count,50,null);
			 g.drawImage(img1, 150+count1, 275, null);
			 g.drawImage(img8, 950, 300, null);
			 g.drawImage(img2, 500+count1, 300, null);
			 g.drawImage(img3, 375+count1, 475, null);
			 g.drawImage(img4, 200-count1, 500, null);
			 g.drawImage(img5, 900, 450, null);
			 g2.setPaint(Color.red);
			 g.drawRect(950,290,330,120);
			 count=count+105;
			 count1=count1+10;
			}
			catch(Exception e) {
			}
			}
		try {
		      img = ImageIO.read(new File("walk1.jpg"));
		   }
			catch (IOException e) {
	            e.printStackTrace();
	         }
		g.drawImage(img,count+105,50,null);
	
		
		 
		 
		
	}
	public void paint(Graphics g){
	 Graphics2D g2 = (Graphics2D) g;
	g2.setPaint(Color.red);
	g.drawRect(950,290,330,120);
	draw();
		
	}
	public static void main(String arg[]) {
		Ani f=new Ani("Sahithi");
		f.setSize(1500,1500);
		f.setLayout(null);
		f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
		System.exit(0);
		}
		});
		f.setVisible(true);
	}

	
}
