package myVendingMachine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


@SuppressWarnings("serial")
public class vendingMachine_01 extends JFrame implements ActionListener{
	
	public double ck,ps,sd;
	public JLabel vn, ich, chng;
	public JButton clear, exit, Coke, Pepsi, Soda;
	
	public TextField ichtf,chngta;
	public TextArea ch;
	
	public vendingMachine_01 () {
		Container c = getContentPane();
		c.setLayout(null);
		
		c.add(vn = new JLabel ("Vending Machine"));
		c.add(ich = new  JLabel ("Insert Coin Here"));
		c.add(chng = new JLabel ("Change"));
		
		c.add(Coke = new JButton ("Coke 25¢"));
		c.add(Pepsi = new JButton ("Pepsi 35¢"));
		c.add(Soda = new JButton("Soda 45¢"));
		c.add(clear = new JButton("Clear"));
		c.add(exit = new JButton ("Exit"));
		
		c.add(ichtf = new TextField ());
		c.add(chngta = new TextField ());
		Coke.addActionListener(this);
		Pepsi.addActionListener(this);
		Soda.addActionListener(this);
		clear.addActionListener(this);
		exit.addActionListener(this);
		
		Color c1 = Color.lightGray;
		Color c2 = Color.black;
		Font f = (new Font ("Verdana", Font.PLAIN, 14));
		Font f1 = (new Font ("Verdana", Font.BOLD, 22));
		
		vn.setFont(f1);ich.setFont(f);chng.setFont(f);ichtf.setFont(f);chngta.setFont(f);
		
		c.setBackground(c2);
		vn.setForeground(c1);ich.setForeground(c1);chng.setForeground(c1);
		
		vn.setBounds(245,20,240,30);
		ich.setBounds(293,60,150,20);
		ichtf.setBounds(330,100,40,20);
		
		Coke.setBounds(100,180,90,20);
		Pepsi.setBounds(300,180,90,20);
		Soda.setBounds(500,180,90,20);
		
		
		chngta.setBounds(260,240,180,120);
		
		clear.setBounds(70,380,70,20);
		exit.setBounds(560,380,70,20);
		
		chngta.setEditable(false);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==Coke) {
			
		}
		
	}
}
