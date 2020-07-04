import java.util.*;
import java.util.Map.Entry;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class Budget  extends Frame{
	BufferedImage img;
	String name;
	Budget(String name){
		this.name=name;
		setLayout(null);
		
		 Button R=new Button("RETURN");
		 R.setBounds(1150,650,100,50);
		 add(R);
		 R.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){
			    	dispose();
			    	Pockets f4=new Pockets(5);
					
			        }  
			    });
		 
	}
	public void paint(Graphics g){
		try {
		      img = ImageIO.read(new File("budget.jpg"));
		   }
			catch (IOException e) {
	            e.printStackTrace();
	         }
		g.drawImage(img, 0,0 ,null);
		 Graphics2D g2 = (Graphics2D) g;
		g.drawLine(300, 200, 300, 650);
		g.drawLine(300, 650, 1100, 650);
		for(Entry<String, DATA> entry:DATA.map.entrySet()){  
			Font my = new Font("Serif", Font.ITALIC | Font.BOLD, 40);
			g.setFont(my);
			g2.setPaint(Color.RED);
			g.drawString("BUDGET TRACKER", 500,100);
			
		       String key=entry.getKey();  
		        DATA b=entry.getValue();  
		        if(key.contentEquals(name) ) {
		        	if(b.Grocery ==0 &&b.Bill ==0 && b.Medical ==0 && b.Shopping==0  ) {}
		        	else {
		        	
		        		Font myFont = new Font("Serif", Font.ITALIC | Font.BOLD, 15);
		        	if(b.Grocery!=0) {
		        	g.draw3DRect(350, 650-(b.Grocery/10)-200 ,100,200+(b.Grocery/10) , true);
		        	
		        	
		        	g2.setPaint(Color.YELLOW);
		        	
		        	
		        	g.fillRect(350, 650-(b.Grocery/10)-200 ,100,200+(b.Grocery/10));
		        	}
		        	g.setFont(myFont);
		        	g.drawString("GROCERY", 360, 670);
		        	g2.setPaint(Color.green);
		        	if(b.Medical!=0) {
		        	g.draw3DRect(450+50, 650-(b.Medical/20)-200 ,100,200+(b.Medical/20) , true);
		        	g.fillRect(450+50, 650-(b.Medical/20)-200 ,100,200+(b.Medical/20));
		        	
		        	}
		        	g.drawString("MEDICAL", 450+60, 670);
		        	g2.setPaint(Color. BLUE);
		        	g.draw3DRect(550+100, 650-(b.Shopping/10) ,100,(b.Shopping/10) , true);
		        	g.fillRect(550+100, 650-(b.Shopping/10) ,100,(b.Shopping/10));
		        	g.drawString("SHOPPING", 550+110, 670);
		        	g2.setPaint(Color.MAGENTA);
		        	g.draw3DRect(650+150, 650-(b.Bill/10) ,100,(b.Bill/10) , true);
		        	g.fillRect(650+150, 650-(b.Bill/10) ,100,(b.Bill/10));
		        	g.drawString("BILLS", 650+180, 670);
		        	break;
		        	}
		        }}
		
	}
	
	public static void main(String arg[]){
		Budget  f=new Budget("Sahithi");
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
