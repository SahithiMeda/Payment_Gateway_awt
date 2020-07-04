import java.util.*;
import java.util.Map.Entry;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class SCard extends Frame {
	BufferedImage img;
	
	SCard(){
		
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
		      img = ImageIO.read(new File("party.jpg"));
		   }
			catch (IOException E) {
	            E.printStackTrace();
	         }
		
		g.drawImage(img, 0, 0, null);
	Graphics2D g2 = (Graphics2D) g;
	g2.setPaint(Color.yellow);
	g.drawOval(550, 230, 300, 300);
	g.fillOval(550, 230, 300, 300);
	g2.setPaint(Color.BLUE);
	Font my = new Font("Serif", Font.ITALIC | Font.BOLD, 50);
	g.setFont(my);
	Random rand = new Random(); 
	 int rand_int1 = rand.nextInt(10); 
	
	 DATA.Scratch(Pockets.NAME, rand_int1*50);
	 g.drawString("RS "+Integer.toString(rand_int1*50)+"/-", 600, 400);
	}
    
    
    

}

