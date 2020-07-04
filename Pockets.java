import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

class Pockets extends Frame implements MouseListener  {
	 static String NAME;
	Button b1;
	TextField card_name,card_n,CVV,E1;
	TextField name; 
	BufferedImage img,img1,img2,img3;
	BufferedImage img5,img6,img7,img8,img11;
	int a;
	private Panel controlPanel;
	
	Pockets(int a){
		this.a=a;
		if(a==1) {
       
		setLayout(null); 
		
		showImageDemo2();
		setFont(new Font("Tahoma", Font.PLAIN, 16));
		Label n=new Label("NAME:",Label.CENTER);
		Label p=new Label("PASSWORD",Label.CENTER);
		 name = new TextField(20);
		TextField password = new TextField(20);
		
		n.setBounds(150,350, 100, 20);
		p.setBounds(150, 400, 100, 20);
		name.setBounds(300,350,150,20);
		password.setBounds(300,400,150,20);
		name.setForeground(Color.BLUE);
		password.setForeground(Color.BLUE);
		password.setEchoChar('*');
		b1=new Button("LOGIN");
		b1.setBounds(350, 450,  95, 40);
        Button New=new Button("NEW USER");
        New.setBounds(250, 450, 95, 40);
//		showImageDemo();
		
		controlPanel=new Panel();
		add(n);
		add(New);
		add(name);
		add(p);
		add(password);
		add(b1);
		add(controlPanel);
	
		New.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	dispose();
		    	Pockets f2=new Pockets(12);
				f2.setSize(1500,1500);
				f2.setVisible(true);
				f2.setLayout(null);
                
				f2.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e){
				System.exit(0);
				}
				});
		    	 
		    }
		});
	  	 
			     
			b1.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){
			    	 
			    	  NAME=name.getText();
			    	  Boolean Check;
				  	  Check=DATA.check_LOGIN(name.getText(), password.getText());
				  	  if(Check==true) {
			    	dispose();
			    	Pockets f2=new Pockets(2);
					f2.setSize(1500,1500);
					f2.setVisible(true);
					f2.setLayout(null);
	                
					f2.addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent e){
					System.exit(0);
					}
					});
				  	  }
				  	  else
				  	  {
				  		dispose();
				    	Pockets f2=new Pockets(11);
						f2.setSize(1500,1500);
						f2.setVisible(true);
						
						f2.addWindowListener(new WindowAdapter(){
							public void windowClosing(WindowEvent e){
							System.exit(0);
							}
							});
						f2.setLayout(null);
				  		
				  		
				  	  }
			        }  
			    }); 
	  	  }
		if(a==12) {
			this.a=1;
			setLayout(null); 
			setFont(new Font("Tahoma", Font.PLAIN, 16));
			showImageDemo2();
	        a=20;
			Label n=new Label("NAME:",Label.CENTER);
			Label p=new Label("PASSWORD",Label.CENTER);
			 name = new TextField(20);
			TextField password = new TextField(20);
			name.setForeground(Color.BLUE);
			password.setForeground(Color.BLUE);
			n.setBounds(150,350, 100, 20);
			p.setBounds(150, 400, 100, 20);
			name.setBounds(300,350,150,20);
			password.setBounds(300,400,150,20);
			
			
			password.setEchoChar('*');
			b1=new Button("LOGIN");
			b1.setBounds(350, 450, 95, 40);
	        

			
			
			add(n);
			
			add(name);
			add(p);
			add(password);
			add(b1);
			
			b1.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){
			    	if(DATA.Check_Key(name.getText()) || name.getText().equals("")) {
			    		Write();
			    	}
			    	else {
			    		System.out.println(name.getText());
			    		DATA.newLoad(name.getText(), password.getText());
			    		NAME=name.getText();
			    		dispose();
				    	Pockets f2=new Pockets(2);
						f2.setSize(1500,1500);
						f2.setVisible(true);
						f2.setLayout(null);
		                
						f2.addWindowListener(new WindowAdapter(){
						public void windowClosing(WindowEvent e){
						System.exit(0);
						}
						});
			    	}
			    	
			   
			    	
				  	  }
			    
			});
			
		}
		if(a==11) {
			this.a=a;
			setLayout(null);
			
			try {
			img11 = ImageIO.read(new File("b3.jpg"));
			}
			catch(Exception e) {}
			Label Detail=new Label("INCORRECT PASSWORD");
			Button b=new Button("RETRY");
			add(Detail);
			Detail.setBackground(Color.white);
			Detail.setForeground(Color.red);
			Detail.setBounds(800,250,300,40);
			Font myFont = new Font("Serif", Font.ITALIC | Font.BOLD, 25);
			Detail.setFont(myFont);
			b.setBounds(900,300,100,20);
			add(b);
			b.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){
			    	dispose();
			    	Pockets f4=new Pockets(1);
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
		if(a==21) {
			this.a=a;
			setLayout(null);
			
			try {
			img11 = ImageIO.read(new File("b3.jpg"));
			}
			catch(Exception e) {}
			Label Detail=new Label("CANNOT ADD MORE THAN 3 CARDS");
			Button b=new Button("RETRY");
			add(Detail);
			Detail.setBackground(Color.white);
			Detail.setForeground(Color.red);
			Detail.setBounds(800,250,300,40);
			Font myFont = new Font("Serif", Font.ITALIC | Font.BOLD, 15);
			Detail.setFont(myFont);
			b.setBounds(900,300,100,20);
			add(b);
			b.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){
			    	dispose();
			    	Pockets f4=new Pockets(4);
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
		
		if(a==2) {
			this.a=a;
			setLayout(null);
//			showImageDemo();
			showImageDemo1("b2.png");
			
			Button b2=new Button("+ ADD CARD");
			b2.setForeground(Color.BLUE);
		    Button New=new Button("SKIP");
		    New.setForeground(Color.BLUE);
			New.setBackground(Color.WHITE);
		    New.setBounds(1100,600,100,50);
			b2.setBounds(600, 300, 200, 100);
			b2.setBackground(Color.WHITE);
			add(b2);
			add(New);
			New.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){  
			    	dispose();
			    	Pockets f3=new Pockets(4);
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
			
			int fill=DATA.filled(NAME);
			if(fill !=3) {
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
			else {
				b2.addActionListener(new ActionListener(){  
				    public void actionPerformed(ActionEvent e){  
				    	dispose();
				    	Pockets f3=new Pockets(21);
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
		if(a==3) {
			this.a=a;
			setLayout(null);
			showImageDemo();
			
			Label c=new Label(" USER NAME:",Label.LEFT);
			Label card=new Label(" CARD NUMBER:",Label.LEFT);
			Label cvv=new Label("CVV",Label.LEFT);
			Label Expires=new Label("Expires",Label.LEFT);
			Label Address=new Label("ADDRESS",Label.LEFT);
			 card_name = new TextField(20);
			 CVV = new TextField(20);
			 E1 = new TextField(2);
			TextField E2 = new TextField(2);
			TextField E3 = new TextField(2);
			 card_n = new TextField(20);
			
			
			TextField ars = new TextField(50);
			c.setBackground(Color.white);
			
			card_name.setBackground(Color.white);
			
			c.setBounds(150, 200, 100, 20);
			card.setBounds(150, 250, 100, 20);
			cvv.setBounds(150, 300, 100, 20);
			card_n.setBounds(300,200,100,20);
			card_name.setBounds(300,250,100,20);
			CVV.setBounds(300,300,100,20);
			Expires.setBounds(150,350,100,20);
			E1.setBounds(300,350,30,20);
			E2.setBounds(330,350,30,20);
			E3.setBounds(360,350,30,20);
			Address.setBounds(150,400,100,20);
			ars.setBounds(300,400,200,40);
			CVV.setBackground(Color.white);
			CVV.setForeground(Color.orange);
			CVV.setEchoChar('*');
			
			Button next=new Button("NEXT");
			next.setBounds(450,450,40,40);
			add(c);
			add(card_n);
			card_n.addMouseListener(this);
			add(card);
			add(card_name);
			card_name.addMouseListener(this);
			add(cvv);
			add(CVV);
			CVV.addMouseListener(this);
			add(Expires);
			add(E1);
			E1.addMouseListener(this);
			add(E2);
			add(E3);
			add(Address);
			add(ars);
			add(next);
			next.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){
			    	int card=Integer.parseInt(card_name.getText());
			    	DATA.ADD(NAME, card);
			    	dispose();
			    	Pockets f4=new Pockets(4);
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
		if(a==6) {
			this.a=a;
			setLayout(null);
			showImageDemo();
			
			Label c=new Label(" USER NAME:",Label.LEFT);
			Label card=new Label(" CARD NUMBER:",Label.LEFT);
			Label cvv=new Label("CVV",Label.LEFT);
			Label Expires=new Label("Expires",Label.LEFT);
			Label Address=new Label("ADDRESS",Label.LEFT);
			 card_name = new TextField(20);
			 CVV = new TextField(20);
			 E1 = new TextField(2);
			TextField E2 = new TextField(2);
			TextField E3 = new TextField(2);
			 card_n = new TextField(20);
			
			
			TextField ars = new TextField(50);
			c.setBackground(Color.white);
			
			card_name.setBackground(Color.white);
			
			c.setBounds(150, 200, 100, 20);
			card.setBounds(150, 250, 100, 20);
			cvv.setBounds(150, 300, 100, 20);
			card_n.setBounds(300,200,100,20);
			card_name.setBounds(300,250,100,20);
			CVV.setBounds(300,300,100,20);
			Expires.setBounds(150,350,100,20);
			E1.setBounds(300,350,30,20);
			E2.setBounds(330,350,30,20);
			E3.setBounds(360,350,30,20);
			Address.setBounds(150,400,100,20);
			ars.setBounds(300,400,200,40);
			CVV.setBackground(Color.white);
			CVV.setForeground(Color.orange);
			CVV.setEchoChar('*');
			
			Button next=new Button("RETURN");
			next.setBounds(450,450,100,60);
			add(c);
			add(card_n);
			card_n.addMouseListener(this);
			add(card);
			add(card_name);
			card_name.addMouseListener(this);
			add(cvv);
			add(CVV);
			CVV.addMouseListener(this);
			add(Expires);
			add(E1);
			E1.addMouseListener(this);
			add(E2);
			add(E3);
			add(Address);
			add(ars);
			add(next);
			next.addActionListener(new ActionListener(){  
			    public void actionPerformed(ActionEvent e){

			    	int card=Integer.parseInt(card_name.getText());
			    	DATA.ADD(NAME, card);
			    	dispose();
			    	paying f4=new paying(NAME);
					
			        }  
			    });
			
			
			
		}
		if(a==4) {

			this.a=a;
			//need to fill
			setLayout(null);
		Button next =new Button("NEXT");
		add(next);
		next.setBounds(900, 600, 100, 30);
		try {
		      img5 = ImageIO.read(new File("s1.png"));
		   }
			catch (IOException E) {
	            E.printStackTrace();
	         }
		try {
		      img6 = ImageIO.read(new File("s2.png"));
		   }
			catch (IOException E) {
	            E.printStackTrace();
	         }
		try {
		      img7 = ImageIO.read(new File("s3.png"));
		   }
			catch (IOException E) {
	            E.printStackTrace();
	         }
		
		
		

		
//		showImageDemo();
		next.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	dispose();
			Pockets f5=new Pockets(5);
			
		    }  
	    });
			
			
		}
		if(a==5) {
			this.a=a;
			setLayout(null);
//			showImageDemo();
			Ani f=new Ani(NAME);
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
void Write() {
	Graphics g=this.getGraphics();
	Font myFont = new Font("Serif", Font.ITALIC | Font.BOLD, 15);
	g.setFont(myFont);
	Graphics2D g2 = (Graphics2D) g;
	g2.setPaint(Color.RED);
	g.drawString("TRY NEW USER NAME ", 200, 500);
}
	public void mouseClicked(MouseEvent e) {  
        
    }  
    public void mouseEntered(MouseEvent e) {  
        
    }  
    public void mouseExited(MouseEvent e) {  
        
    }  
    public void mousePressed(MouseEvent e) {  
    	if(e.getSource()==(card_n)) {
    		try {
    		      img3 = ImageIO.read(new File("A1.jpg"));
    		   }
    			catch (IOException E) {
    	            E.printStackTrace();
    	         }
    		
    		Graphics g=this.getGraphics();
    		g.drawImage(img3, 600, 200, null);
    		
    	}
    	if(e.getSource()==(card_name)) {
    		try {
    		      img3 = ImageIO.read(new File("A2.jpg"));
    		   }
    			catch (IOException E) {
    	            E.printStackTrace();
    	         }
    		
    		Graphics g=this.getGraphics();
    		g.drawImage(img3, 600, 200, null);
    		
    	}
    	if(e.getSource()==(CVV)) {
    		try {
    		      img3 = ImageIO.read(new File("A4.jpg"));
    		   }
    			catch (IOException E) {
    	            E.printStackTrace();
    	         }
    		
    		Graphics g=this.getGraphics();
    		g.drawImage(img3, 600, 200, null);
    		
    	}
    	if(e.getSource()==(E1)) {
    		try {
    		      img3 = ImageIO.read(new File("A3.jpg"));
    		   }
    			catch (IOException E) {
    	            E.printStackTrace();
    	         }
    		
    		Graphics g=this.getGraphics();
    		g.drawImage(img3, 600, 200, null);
    		
    	}
        
    }  
    public void mouseReleased(MouseEvent e) {  
         
    }  
    
	
	
	private void showImageDemo1(String s){
	     
		try {
	      img1 = ImageIO.read(new File(s));
	   }
		catch (IOException e) {
            e.printStackTrace();
         }
      }
	private void showImageDemo2(){
	     
		try {
	      img2 = ImageIO.read(new File("b1.png"));
	   }
		catch (IOException e) {
            e.printStackTrace();
         }
      }
	
	private void showImageDemo(){
	     
		try {
      img = ImageIO.read(new File("back2..jpg"));
	   }
		catch (IOException e) {
            e.printStackTrace();
         }
      }
	
	
	

public void paint(Graphics g){
Font myFont = new Font("Serif", Font.ITALIC | Font.BOLD, 50);
 Font newFont = myFont.deriveFont(100F);
 Graphics2D g2 = (Graphics2D) g;
      if(a==1) {
    	  g.setFont(newFont);
    	  g2.setPaint(Color.RED);
    	  g2.drawString("POCKETS", 115, 250);
    	  g2.setPaint(Color.BLUE);
    	  g.draw3DRect(100, 100,475, 500, true);
    	 
      }
      if(a==20) {
    	  g.setFont(newFont);
    	  g2.setPaint(Color.RED);
    	  g2.drawString("ADD CARD", 115, 250);
    	  g2.setPaint(Color.BLUE);
    	  g.draw3DRect(100, 100,475, 500, true);
    	  
      }
       if(a==4) {
    	   Font my = new Font("Serif", Font.ITALIC | Font.BOLD, 40);
    	  g.setFont(my);
     	  g2.setPaint(Color.BLUE);
     	  g2.drawString("KEEP SHOPPING WE PROVIDE OUR SUPPORT", 350, 100);
    	   
       }
	   g.drawImage(img11,50,50,null);
	   g.drawImage(img, 0, 0, null);
	   g.drawImage(img2, 650, 25, null);
	   g.drawImage(img1, 300, 0, null);
	   g.drawImage(img5, 250, 150, null );
	   if(img5 !=null) {
	 		try {
	 			Thread.sleep(1000);
	 			}
	 			catch( InterruptedException e) {
	 			}
	 		}
 		g.drawImage(img6,400 ,150,null);
 		if(img6 !=null) {
 	 		try {
 	 			Thread.sleep(1000);
 	 			}
 	 			catch( InterruptedException e) {
 	 			}
 	 		}
 		g.drawImage(img7,550 ,150,null);
 		if(img7 !=null) {
 	 		try {
 	 			Thread.sleep(1000);
 	 			}
 	 			catch( InterruptedException e) {
 	 			}
 	 		}
 		
 		g.drawImage(img5,700 ,150,null);
 		if(img5 !=null) {
 		try {
 			Thread.sleep(1000);
 			}
 			catch( InterruptedException e) {
 			}
 		}
 		g.drawImage(img6,850 ,150,null);
 		g.drawImage(img8,750 ,250,null);
 		
g.setFont(newFont);

}
public static void main(String arg[]){
	DATA.Load();
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

}
