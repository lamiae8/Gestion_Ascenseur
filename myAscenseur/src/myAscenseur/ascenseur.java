package myAscenseur;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.table.DefaultTableModel;




public class ascenseur extends JFrame implements Runnable{
	private int  i=0;
	private int locPos=0;
	private int desPos=0;
	timeG t=new timeG(1000,TimeUnit.MILLISECONDS);
	JButton asc=new JButton();
	JButton btn0=new JButton();
	JButton btn1=new JButton();
	JButton btn2=new JButton();
	JButton btn3=new JButton();
	JButton btn4=new JButton();
	JButton btn00=new JButton();
	JButton btn11=new JButton();
	JButton btn22=new JButton();
	JButton btn33=new JButton();
	JButton btn44=new JButton();
	JButton dmd=new JButton();
	JTextField t2=new JTextField();
	JOptionPane jop= new JOptionPane();
	
	public ascenseur() throws InterruptedException {
		super("Ascenseur");
		this.setSize(1000,500);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.body();
		
	}
	
	public void ascDes(int k) {
		   asc.setBounds(220, k-=80, 40, 60);
			t.sleeptime();
	   }
	
	public void ascMon(int k) {
		asc.setBounds(220, k+=80, 40, 60);
		t.sleeptime();
	}
	
	
	
	private void body() {
		
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		
		p1.setBounds(20, 20, 450, 390);
		p1.setLayout(null);
		p1.setBackground(new Color(230, 230, 255));
		
		p2.setBounds(500, 20, 450, 390);
		p2.setLayout(null);
		p2.setBackground(new Color(230, 230, 255));

		//Boutton d'ascenceur localisation
		
		JLabel loc=new JLabel("votre localisation: ");
		loc.setBounds(50,10,150,40);
		p1.add(loc);
		
		btn4.setText("Etage 4");
		btn4.setBounds(40, 40, 100, 40);
		p1.add(btn4);
		
		btn3.setText("Etage 3");
		btn3.setBounds(40, 80, 100, 40);
		p1.add(btn3);
		
		btn2.setText("Etage 2");
		btn2.setBounds(40, 120, 100, 40);
		p1.add(btn2);
		
		btn1.setText("Etage 1");
		btn1.setBounds(40, 160, 100, 40);
		p1.add(btn1);
		
		btn0.setText("Etage 0");
		btn0.setBounds(40, 200, 100, 40);
		p1.add(btn0);
		
		
		//***************Boutton d'ascenceur destination

		
		
		JLabel des=new JLabel("votre destination: ");
		des.setBounds(310,10,150,40);
		p1.add(des);
		
		JButton btn44 = new JButton("Etage 4");
		btn44.setBounds(300, 40, 100, 40);
		p1.add(btn44);
		
		JButton btn33 = new JButton("Etage 3");
		btn33.setBounds(300, 80, 100, 40);
		p1.add(btn33);
		
		JButton btn22 = new JButton("Etage 2");
		btn22.setBounds(300, 120, 100, 40);
		p1.add(btn22);
		
		JButton btn11= new JButton("Etage 1");
		btn11.setBounds(300, 160, 100, 40);
		p1.add(btn11);
		
		JButton btn00 = new JButton("Etage 0");
		btn00.setBounds(300, 200, 100, 40);
		p1.add(btn00);
		
		//**********
		
		JButton dmd = new JButton("demender ascenceur");
		dmd.setBounds(20, 250, 140, 40);
		dmd.setEnabled(false);
		p1.add(dmd);
		
		JTextField t2=new JTextField("L'ascenceur est à l'étage numero: "+this.i);
		t2.setBounds(120, 320, 210,30);
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setEditable(false);
		p1.add(t2); 
		btn0.setBackground(new Color(255, 255, 255));
		btn1.setBackground(new Color(255, 255, 255));
		btn2.setBackground(new Color(255, 255, 255));
		btn3.setBackground(new Color(255, 255, 255));
		btn4.setBackground(new Color(255, 255, 255));
		btn00.setBackground(new Color(255, 255, 255));
		btn11.setBackground(new Color(255, 255, 255));
		btn22.setBackground(new Color(255, 255, 255));
		btn33.setBackground(new Color(255, 255, 255));
		btn44.setBackground(new Color(255, 255, 255));
        
        this.add(p1);
        
        //**********************2éme panel******************
       /*
        JLabel d[]=new JLabel[5];
        
        for(int j=0;j<5;j++) {
        	int k=10;
        	d[j].setText("Etage: "+j);
    		d[j].setBounds(510,k+=40,150,40);
    		p2.add(d[j]);
        }
        */
        JLabel e1= new JLabel("Etage: 0");
        e1.setBounds(30,330,150,40);
        p2.add(e1);
        
        JLabel e2= new JLabel("Etage: 1");
        e2.setBounds(30,250,150,40);
        p2.add(e2);
		
        JLabel e3= new JLabel("Etage: 2");
        e3.setBounds(30,170,150,40);
        p2.add(e3);
        
        JLabel e4= new JLabel("Etage: 3");
        e4.setBounds(30,90,150,40);
        p2.add(e4);
        
        JLabel e5= new JLabel("Etage: 4");
        e5.setBounds(30,20,150,40);
        p2.add(e5);
		
        
        asc.setBounds(220, 330, 40, 60);
        ImageIcon icon1 = new ImageIcon("C:\\Users\\LM\\eclipse-workspace\\myAscenseur\\src\\images\\ascenseur.png");
		Image img1 = icon1.getImage();  
		Image newimg1 = img1.getScaledInstance( 40, 60,  java.awt.Image.SCALE_SMOOTH);  
		icon1 = new ImageIcon( newimg1 );
		asc.setIcon(icon1);

		asc.setBackground(new Color(128, 204, 255));
        p2.add(asc);
        
        
       
        JButton go = new JButton("Go");
		go.setBounds(290, 250, 120, 40);
		go.setEnabled(false);
		p1.add(go);
		btn11.setEnabled(false);
		btn33.setEnabled(false);
		btn22.setEnabled(false);
		btn44.setEnabled(false);
		btn00.setEnabled(false);
		
        this.add(p2);
        
        //************************Quitter******************
        
        JButton qt=new JButton("Quitter");
        qt.setBounds(870, 410, 70, 30);
        this.add(qt);
        
        
        //************************ACTIONS*******************************
       
        
        //*******Quitter*******
        
        	qt.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
        	
        	//***********Action bouttons localitaion*****************
        	
        	btn0.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					//btn0.setEnabled(false);
			
					btn0.setBackground(new Color(128, 204, 255));
					locPos=0;
					System.out.println("localisation="+locPos);
					System.out.println("etage="+i);
    				btn1.setBackground(new Color(255, 255, 255));
    				btn2.setBackground(new Color(255, 255, 255));
    				btn3.setBackground(new Color(255, 255, 255));
    				btn4.setBackground(new Color(255, 255, 255));
					dmd.setEnabled(true);
				}
			});
        	btn1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					//btn0.setEnabled(false);
				
					btn1.setBackground(new Color(128, 204, 255));
					locPos=1;
					System.out.println("localisation="+locPos);
					System.out.println("etage="+i);
					btn0.setBackground(new Color(255, 255, 255));
    				btn2.setBackground(new Color(255, 255, 255));
    				btn3.setBackground(new Color(255, 255, 255));
    				btn4.setBackground(new Color(255, 255, 255));
					dmd.setEnabled(true);
				}
			});
        	btn2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					//btn0.setEnabled(false);
				
					btn2.setBackground(new Color(128, 204, 255));
					locPos=2;
					System.out.println("localisation="+locPos);
					System.out.println("etage="+i);
					btn0.setBackground(new Color(255, 255, 255));
    				btn1.setBackground(new Color(255, 255, 255));
    				btn3.setBackground(new Color(255, 255, 255));
    				btn4.setBackground(new Color(255, 255, 255));
					dmd.setEnabled(true);
				}
			});
        	btn3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					//btn0.setEnabled(false);
					
					btn3.setBackground(new Color(128, 204, 255));
					locPos=3;
					System.out.println("localisation="+locPos);
					System.out.println("etage="+i);
					btn0.setBackground(new Color(255, 255, 255));
    				btn1.setBackground(new Color(255, 255, 255));
    				btn2.setBackground(new Color(255, 255, 255));
    				btn4.setBackground(new Color(255, 255, 255));
					dmd.setEnabled(true);
				}
			});
        	btn4.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					//btn0.setEnabled(false);
				
					btn4.setBackground(new Color(128, 204, 255));
					locPos=4;
					System.out.println("localiastion="+locPos);
					System.out.println("etage="+i);
					btn0.setBackground(new Color(255, 255, 255));
    				btn1.setBackground(new Color(255, 255, 255));
    				btn2.setBackground(new Color(255, 255, 255));
    				btn3.setBackground(new Color(255, 255, 255));
					dmd.setEnabled(true);
				}
			});
        
        	
        	
        	
        	//*******************Action boutton destination***********
        	
        	btn00.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					//btn0.setEnabled(false);
					btn00.setBackground(new Color(128, 204, 255));
					desPos=0;
					System.out.println("destination="+desPos);
    				btn11.setBackground(new Color(255, 255, 255));
    				btn22.setBackground(new Color(255, 255, 255));
    				btn33.setBackground(new Color(255, 255, 255));
    				btn44.setBackground(new Color(255, 255, 255));
					go.setEnabled(true);
				}
			});
        	btn11.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
										
					btn11.setBackground(new Color(128, 204, 255));
					desPos=1;
					System.out.println("destination="+desPos);
					btn00.setBackground(new Color(255, 255, 255));
    				btn22.setBackground(new Color(255, 255, 255));
    				btn33.setBackground(new Color(255, 255, 255));
    				btn44.setBackground(new Color(255, 255, 255));
					go.setEnabled(true);
				}
			});
        	btn22.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					
					btn22.setBackground(new Color(128, 204, 255));
					desPos=2;
					System.out.println("destination="+desPos);
					btn00.setBackground(new Color(255, 255, 255));
    				btn11.setBackground(new Color(255, 255, 255));
    				btn33.setBackground(new Color(255, 255, 255));
    				btn44.setBackground(new Color(255, 255, 255));
					go.setEnabled(true);
				}
			});
        	btn33.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					btn33.setBackground(new Color(128, 204, 255));
					desPos=3;
					System.out.println("destination="+desPos);
					btn00.setBackground(new Color(255, 255, 255));
    				btn11.setBackground(new Color(255, 255, 255));
    				btn22.setBackground(new Color(255, 255, 255));
    				btn44.setBackground(new Color(255, 255, 255));
					go.setEnabled(true);
				}
			});
        	btn44.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					btn44.setBackground(new Color(128, 204, 255));
					desPos=4;
					System.out.println("destination="+desPos);
					btn00.setBackground(new Color(255, 255, 255));
    				btn11.setBackground(new Color(255, 255, 255));
    				btn22.setBackground(new Color(255, 255, 255));
    				btn33.setBackground(new Color(255, 255, 255));
					go.setEnabled(true);
				}
			});
				//************ Action de mouvement du demande **********
        	
        	dmd.addActionListener(new ActionListener() {
    			@Override
    			public void actionPerformed(ActionEvent e) {
    				
    				if(i==locPos) {
    					jop.showMessageDialog(null, "vous etes à l'étage "+i, "ASCENSEUR", JOptionPane.INFORMATION_MESSAGE);
    					jop.showMessageDialog(null, "choissisez votre destination et cliquer sur Go", "ASCENSEUR", JOptionPane.OK_OPTION);
    					btn4.setEnabled(false);
        				btn1.setEnabled(false);
    					btn3.setEnabled(false);
    					btn2.setEnabled(false);
    					btn0.setEnabled(false);
    					
    					btn44.setEnabled(true);
        				btn11.setEnabled(true);
    					btn33.setEnabled(true);
    					btn22.setEnabled(true);
    					btn00.setEnabled(true);
    					
    					btn00.setBackground(new Color(255, 255, 255));
        				btn11.setBackground(new Color(255, 255, 255));
        				btn22.setBackground(new Color(255, 255, 255));
        				btn33.setBackground(new Color(255, 255, 255));
        				btn44.setBackground(new Color(255, 255, 255));
        				dmd.setEnabled(false);
    					return ;
    				}
    				
					jop.showMessageDialog(null, "l'ascenceur est a l'étage "+i+" veullez attendez un peu", "ASCENSEUR", JOptionPane.OK_OPTION);
    				if(i<locPos) {
        				int k=0;
        				if(i==0)k=330;
        				if(i==1)k=250;
        				if(i==2)k=170;
        				if(i==3)k=90;
        				if(i==4)k=20;
        				while(i<locPos) {
        						t.sleeptime();
        						asc.setBounds(220, k-=80, 40, 60);
        						i++;
        						t2.setText("L'ascenceur est à l'étage numero: "+i);
        						if(i!=locPos) {
        							     jop.showMessageDialog(null, "l'ascenceur est a l'étage "+i+" veullez attendez un peu", "ASCENSEUR", JOptionPane.OK_OPTION);
        						}
        						
        						t.sleeptime();
        				}
    				}
    				
    				if(i>locPos) {
    						int k=0;
    						if(i==0)k=330;
    						if(i==1)k=250;
    						if(i==2)k=170;
    						if(i==3)k=90;
    						if(i==4)k=20;
    						
    					while(i>locPos) {
    						asc.setBounds(220, k+=80, 40, 60);
    						t.sleeptime();
    						i--;
    						t2.setText("L'ascenceur est à l'étage numero: "+i);
    						if(i!=locPos) {
							     jop.showMessageDialog(null, "l'ascenceur est a l'étage "+i+" veullez attendez un peu", "ASCENSEUR", JOptionPane.OK_OPTION);
						}
    						
    						t.sleeptime();
    					}
    				}
					jop.showMessageDialog(null, "l'ascenceur est arrivé \n choisissez votre destination et cliquer sur Go", "ASCENSEUR", JOptionPane.INFORMATION_MESSAGE);

    				
    				
					btn4.setEnabled(false);
    				btn1.setEnabled(false);
					btn3.setEnabled(false);
					btn2.setEnabled(false);
					btn0.setEnabled(false);
					
					btn44.setEnabled(true);
    				btn11.setEnabled(true);
					btn33.setEnabled(true);
					btn22.setEnabled(true);
					btn00.setEnabled(true);
					
					btn00.setBackground(new Color(255, 255, 255));
    				btn11.setBackground(new Color(255, 255, 255));
    				btn22.setBackground(new Color(255, 255, 255));
    				btn33.setBackground(new Color(255, 255, 255));
    				btn44.setBackground(new Color(255, 255, 255));
    				
    				
    				dmd.setEnabled(false);
    				

    				i=locPos;
    				
    			}
    			
    		});
        	
        	
        	
        	   
        	   
        	   //*****************Goo**********
        	go.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					if(locPos>desPos) {
							int k=0;
							if(i==0)k=330;
							if(i==1)k=250;
							if(i==2)k=170;
							if(i==3)k=90;
							if(i==4)k=20;
							
						while(desPos<locPos) {
							asc.setBounds(220, k+=80, 40, 60);
							t.sleeptime();
							i--;
							locPos--;
							t2.setText("L'ascenceur est à l'étage numero: "+i);
							if(desPos!=locPos) {
							     jop.showMessageDialog(null, "vous etes à l'étage "+i, "ASCENSEUR", JOptionPane.OK_OPTION);
							}
							
							t.sleeptime();
						}
					     jop.showMessageDialog(null, "vous etes arrivé a votre destination", "ASCENSEUR", JOptionPane.INFORMATION_MESSAGE);
				
					}
					
					else if(locPos<desPos) {
						int k=0;
						if(i==0)k=330;
						if(i==1)k=250;
						if(i==2)k=170;
						if(i==3)k=90;
						if(i==4)k=20;
						
					while(desPos>locPos) {
						asc.setBounds(220, k-=80, 40, 60);
						t.sleeptime();
						i++;
						locPos++;
						t2.setText("L'ascenceur est à l'étage numero: "+i);
						if(desPos!=locPos) {
						     jop.showMessageDialog(null, "vous etes à l'étage "+i, "ASCENSEUR", JOptionPane.OK_OPTION);
						}
						
						t.sleeptime();
					}
				     jop.showMessageDialog(null, "vous etes arrivé a votre destination", "ASCENSEUR", JOptionPane.INFORMATION_MESSAGE);
			
				}
					else {
					     jop.showMessageDialog(null, "vous etes à l'étage"+i, "ASCENSEUR", JOptionPane.OK_OPTION);
					}
					
					
					
				
					
    				
    				btn11.setEnabled(false);
    				btn33.setEnabled(false);
    				btn22.setEnabled(false);
    				btn44.setEnabled(false);
    				btn00.setEnabled(false);
    				
    				btn1.setEnabled(true);
    				btn3.setEnabled(true);
    				btn2.setEnabled(true);
    				btn4.setEnabled(true);
    				btn0.setEnabled(true);
    				
    				btn0.setBackground(new Color(255, 255, 255));
    				btn1.setBackground(new Color(255, 255, 255));
    				btn2.setBackground(new Color(255, 255, 255));
    				btn3.setBackground(new Color(255, 255, 255));
    				btn4.setBackground(new Color(255, 255, 255));
    				go.setEnabled(false);
				}
			});
        	
        	   
        	   		
}
	
	
	public static void main(String[] args)throws InterruptedException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		ascenseur ct=new ascenseur ();
		Thread f=new Thread(ct);
		f.start();
		ct.setVisible(true);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		
	}

}
