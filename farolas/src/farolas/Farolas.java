package farolas;

import java.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Farolas extends JFrame implements ActionListener{
	
	private JPanel panel1, panel2, panel3, panel4;
    private JLabel texto[]=new JLabel[5];
    private JLabel t1, t2, t4, t5, t6, t7;
    String[] calles={"Casco Viejo", "Indautxu", "Moyua", "Atxuri", "Abando"};
    private JButton boton1, boton2, boton3, boton4, boton5;
    private JComboBox comb1, comb2, comb3, comb4, comb5;
    private JTextField campo1, campo2, campo3, campo4, campo5;
    
    private JButton farolas[]=new JButton[15];
    //HAY QUE HACERLO CON MAS DIMENSIONES
    
    private int n1, n2, n3, n4, n5;

    
    
    Farolas(){
    	
    	  
    	    
          panel1=new JPanel();
          panel1.setLayout(null);
          panel1.setVisible(true);
          panel1.setBackground(Color.BLUE);
          panel1.setBounds(0, 0, 800, 600);
          add(panel1);
          
          panel2=new JPanel();
          panel2.setLayout(null);
          panel2.setVisible(false);
          panel2.setBackground(Color.BLUE);
          panel2.setBounds(0, 0, 800, 600);
          add(panel2);
          
          panel3=new JPanel();
          panel3.setLayout(null);
          panel3.setVisible(false);
          panel3.setBackground(Color.BLUE);
          panel3.setBounds(0, 0, 800, 600);
          add(panel3);
          
          panel4=new JPanel();
          panel4.setLayout(null);
          panel4.setVisible(false);
          panel4.setBackground(Color.BLUE);
          panel4.setBounds(0, 0, 800, 600);
          add(panel4);
          
          
          t1=new JLabel("Bienvenido al encendedor de farolas de Bilbao");
          t1.setBounds(200, 150, 300, 200);
          panel1.add(t1);
          
          int a1=50;
          int a=1;
          
          for (int x=0; x<5; x++){
        	  
        	  texto[x]=new JLabel("Calle " +a +":");
        	  texto[x].setBounds(a1, 40, 120, 40);
        	  panel2.add(texto[x]);
        	  
        	  a1=+100;
        	  //esta mal
        	  a++;
        	  
          }//se puede hacer con un for
          
          campo1=new JTextField("Casco viejo");
          campo1.setBounds(60, 170, 80, 60); 
          panel2.add(campo1);

          campo2=new JTextField(" ");
          campo2.setBounds(160, 170, 80, 60);
          panel2.add(campo2);

          campo3=new JTextField(" ");
          campo3.setBounds(260, 170, 80, 60);
          panel2.add(campo3);

          campo4=new JTextField(" ");
          campo4.setBounds(360, 170, 80, 60);
          panel2.add(campo4);

          campo5=new JTextField(" ");
          campo5.setBounds(460, 170, 80, 60);
          panel2.add(campo5);
          
          //botones
          
          boton1=new JButton("atras");
          boton1.setBounds(100,480,120,50);
          boton1.setBackground(Color.green);
          panel2.add(boton1);
          boton1.addActionListener(this);
          
          boton4=new JButton("atras");
          boton4.setBounds(100,480,120,50);
          boton4.setBackground(Color.green);
          panel3.add(boton4);
          boton4.addActionListener(this);
          
          boton2=new JButton("calles");
          boton2.setBounds(150,420,120,50);
          boton2.setBackground(Color.green);
          panel1.add(boton2);
          boton2.addActionListener(this);
   
          boton3=new JButton("encender");
          boton3.setBounds(350,420,120,50);
          boton3.setBackground(Color.green);
          panel1.add(boton3);
          boton3.addActionListener(this);
          
          
          /*esto no funciona, el array no esta bien puesto o no se que...
          int calles1=150;
          
      	for(int x=0; x<5; x++){
      		calles[x]=new String();
      		farolas[x].setBounds(calles1, 100, 30, 30);
      		farolas[x].setBackground(Color.red);
      		panel3.add(farolas[x]);
      		farolas[x].addActionListener(this);
      		
      		calles1=calles1+50;
      		
      	}
          */
          
          
          t2=new JLabel("CALLES:");
          t2.setBounds(350, 25, 50, 50);
          panel3.add(t2);
          
          
          int casc1=150;
          
        	for(int x=0; x<7; x++){
        		farolas[x]=new JButton();
        		farolas[x].setBounds(50, casc1, 30, 30);
        		farolas[x].setBackground(Color.red);
        		panel3.add(farolas[x]);
        		farolas[x].addActionListener(this);
        		
        		casc1=casc1+45;
        		
        	}
        	
        	int casc2=150;
        	
        	for(int x=0; x<7; x++){
        		farolas[x]=new JButton();
        		farolas[x].setBounds(100, casc2, 30, 30);
        		farolas[x].setBackground(Color.red);
        		panel3.add(farolas[x]);
        		farolas[x].addActionListener(this);
        		
        		casc2=casc2+45;
        		
        	}
        	
        	int inda1=150;
            
          	for(int x=0; x<7; x++){
          		farolas[x]=new JButton();
          		farolas[x].setBounds(200, inda1, 30, 30);
          		farolas[x].setBackground(Color.red);
          		panel3.add(farolas[x]);
          		farolas[x].addActionListener(this);
          		
          		inda1=inda1+45;
          		
          	}
          	
          	int inda2=150;
            
          	for(int x=0; x<7; x++){
          		farolas[x]=new JButton();
          		farolas[x].setBounds(250, inda2, 30, 30);
          		farolas[x].setBackground(Color.red);
          		panel3.add(farolas[x]);
          		farolas[x].addActionListener(this);
          		
          		inda2=inda2+45;
          		
          	}
          
          
          int moy1=150;
          
          	for(int x=0; x<7; x++){
          		farolas[x]=new JButton();
          		farolas[x].setBounds(350, moy1, 30, 30);
          		farolas[x].setBackground(Color.red);
          		panel3.add(farolas[x]);
          		farolas[x].addActionListener(this);
          		
          		moy1=moy1+45;
          		
          	}
          	
          	int moy2=150;
            
          	for(int x=0; x<7; x++){
          		farolas[x]=new JButton();
          		farolas[x].setBounds(400, moy2, 30, 30);
          		farolas[x].setBackground(Color.red);
          		panel3.add(farolas[x]);
          		farolas[x].addActionListener(this);
          		
          		moy2=moy2+45;
          		
          	}
          	
	int atxuri1=150;
            
          	for(int x=0; x<7; x++){
          		farolas[x]=new JButton();
          		farolas[x].setBounds(500, atxuri1, 30, 30);
          		farolas[x].setBackground(Color.red);
          		panel3.add(farolas[x]);
          		farolas[x].addActionListener(this);
          		
          		atxuri1=atxuri1+45;
          		
          	}
          	
int atxuri2=150;
            
          	for(int x=0; x<7; x++){
          		farolas[x]=new JButton();
          		farolas[x].setBounds(550, atxuri2, 30, 30);
          		farolas[x].setBackground(Color.red);
          		panel3.add(farolas[x]);
          		farolas[x].addActionListener(this);
          		
          		atxuri2=atxuri2+45;
          		
          	}
          	
	int abando1=150;
            
          	for(int x=0; x<7; x++){
          		farolas[x]=new JButton();
          		farolas[x].setBounds(650, abando1, 30, 30);
          		farolas[x].setBackground(Color.red);
          		panel3.add(farolas[x]);
          		farolas[x].addActionListener(this);
          		
          		abando1=abando1+45;
          		
          	}
          	
int abando2=150;
            
          	for(int x=0; x<7; x++){
          		farolas[x]=new JButton();
          		farolas[x].setBounds(700, abando2, 30, 30);
          		farolas[x].setBackground(Color.red);
          		panel3.add(farolas[x]);
          		farolas[x].addActionListener(this);
          		
          		abando2=abando2+45;
          		
          	}
    	
    }
    
  
    
      void metodo(){
          
            
           /*
            label1= new JLabel("CALLES:");                                 
            label1.setBounds(28,20,100,40); 
            add(label1); 

             label2 = new JLabel("Casco Viejo");                            
             label2.setBounds(8,60,100,40); 
             add(label2); 
    
             label3 = new JLabel("Indautxu");                            
             label3.setBounds(8,105,100,40); 
             add(label3); 
             
             label4 = new JLabel("Moyua");                            
             label4.setBounds(8,150,100,40); 
             add(label4); 
             
             label5 = new JLabel("Atxuri");                            
             label5.setBounds(8,195,100,40); 
             add(label5); 
             
             label6 = new JLabel("Abando");                            
             label6.setBounds(8,240,100,40); 
             add(label6); 
             
             comb1 = new JComboBox();                            
             comb1.setBounds(120,65,50,30); 
             add(comb1); 
         	for(int i=0;i<15;i++){ 
     			comb1.addItem(i);
     		}
  
         	comb2 = new JComboBox();                            
            comb2.setBounds(120,110,50,30); 
            panel3.add(comb2); 
        	for(int i=0;i<15;i++){ 
    			comb2.addItem(i);
    			
    		}
        	
        	comb3 = new JComboBox();                            
            comb3.setBounds(120,155,50,30); 
            panel3.add(comb3); 
        	for(int i=0;i<15;i++){ 
    			comb3.addItem(i);
    		}
        	
        	comb4 = new JComboBox();                            
        	comb4.setBounds(120,200,50,30); 
        	panel3.add(comb4); 
        	for(int i=0;i<15;i++){ 
        		comb4.addItem(i);
    		}
        	
        	comb5 = new JComboBox();                            
        	comb5.setBounds(120,245,50,30); 
        	panel3.add(comb5); 
        	for(int i=0;i<15;i++){ 
        		comb5.addItem(i);
    		}
         /*    
             boton = new JButton("¡Encender!");
             boton.setBounds(100,320, 120, 30);
             boton.addActionListener(this);
             add(boton);
             
         */
             
      }
      
  
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if (e.getSource()==boton1){
			
			panel1.setVisible(true);
			panel2.setVisible(false);
			panel3.setVisible(false);
			panel4.setVisible(false);
		}
		
		if (e.getSource()==boton4){
			
			panel1.setVisible(true);
			panel2.setVisible(false);
			panel3.setVisible(false);
			panel4.setVisible(false);
		}
		
		
		
	if (e.getSource()==boton2){
			
			panel1.setVisible(false);
			panel2.setVisible(true);
			panel3.setVisible(false);
			panel4.setVisible(false);
		}
	
	if (e.getSource()==boton3){
		
		panel1.setVisible(false);
		panel2.setVisible(false);
		panel3.setVisible(true);
		panel4.setVisible(false);
	}
	

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Farolas far = new Farolas();
		far.setLayout(null);
		far.setBounds(10,10,800,600);
		far.setVisible(true);
		far.setResizable(false);
		far.setTitle("Farolas");
		far.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		far.metodo();
		
	}

	

}
