package app;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 public class calculator  implements ActionListener{
	double input,result;
	String cal;
	JFrame frame;
	JLabel label=new JLabel("");
	JTextField textview=new JTextField();
	JButton symclr=new JButton("CLR");
	JButton symdel=new JButton("DEL");
	JButton symmul=new JButton("*");
	JButton symdiv=new JButton("/"); 
	
	JButton symseven=new JButton("7");
	JButton symeight=new JButton("8");
	JButton symnine=new JButton("9");
	JButton symminus=new JButton("-");
	
	JButton symfour=new JButton("4");
	JButton symfive=new JButton("5");
	JButton symsix=new JButton("6");
	JButton symplus=new JButton("+");
	
	JButton symone=new JButton("1");
	JButton symtwo=new JButton("2");
	JButton symthree=new JButton("3");
	JButton symequal=new JButton("=");
	
	JButton symzero=new JButton("0");
	JButton symdot=new JButton(".");
	
	calculator(){
	CreateInterface();
	interfacecomponents();
	AddInterfaceEventListener();
	}
	private void AddInterfaceEventListener() {
		// TODO Auto-generated method stub

		symclr.addActionListener(this);
		symdel.addActionListener(this);
		symmul.addActionListener(this);
		symdiv.addActionListener(this);
	
		symseven.addActionListener(this);
		symeight.addActionListener(this);
		symnine.addActionListener(this);
		symminus.addActionListener(this);
		
		symfour.addActionListener(this);
		symfive.addActionListener(this);
		symsix.addActionListener(this);
		symplus.addActionListener(this);
		
		symone.addActionListener(this);
		symtwo.addActionListener(this);
		symthree.addActionListener(this);
		symequal.addActionListener(this);
		
		symzero.addActionListener(this);
		symdot.addActionListener(this);
		
	}
	public void CreateInterface() {
		frame=new JFrame();
		frame.setTitle("java calc");
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setSize(300,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void interfacecomponents() {
		label.setBounds(250,0,40,40);
		frame.add(label);
		textview.setBounds(10,40,270,60);
	    textview.setEditable(false);
		//textView.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.add(textview);
		symclr.setBounds(10,110,60,40);
		frame.add(symclr);
		symdel.setBounds(80,110,60,40);
		frame.add(symdel);
		symmul.setBounds(150,110,60,40);
		frame.add(symmul);
		symdiv.setBounds(220,110,60,40);
		frame.add(symdiv);
		symseven.setBounds(10,160,60,40);
		frame.add(symseven);
		symeight.setBounds(80,160,60,40);
		frame.add(symeight);
		symnine.setBounds(150,160,60,40);
		frame.add(symnine);
		symminus.setBounds(220,160,60,40);
		frame.add(symminus);
		symfour.setBounds(10,210,60,40);
		frame.add(symfour);
		symfive.setBounds(80,210,60,40);
		frame.add(symfive);
		symsix.setBounds(150,210,60,40);
		frame.add(symsix);
		symplus.setBounds(220,210,60,40);
		frame.add(symplus);
		symone.setBounds(10,260,60,40);
		frame.add(symone);
		symtwo.setBounds(80,260,60,40);
		frame.add(symtwo);
		symthree.setBounds(150,260,60,40);
		frame.add(symthree);
		symequal.setBounds(220,260,60,90);
		frame.add(symequal);
		symzero.setBounds(10,310,130,40);
		frame.add(symzero);
		symdot.setBounds(150,310,60,40);
		frame.add(symdot);			
	} 

 public static void main(String[] args){
     	
    new calculator();
	
		
	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

	Object event=e.getSource();
	if(event==symone) {
		textview.setText(textview.getText()+"1");
	}
	else if(event==symtwo) {
		textview.setText(textview.getText()+"2");
	}
	else if(event==symthree) {
		textview.setText(textview.getText()+"3");
	}
	else if(event==symfour) {
		textview.setText(textview.getText()+"4");
	}
	else if(event==symfive) {
		textview.setText(textview.getText()+"5");
	}
	else if(event==symsix) {
		textview.setText(textview.getText()+"6");
	}
	else if(event==symseven) {
		textview.setText(textview.getText()+"7"); 
	}
	else if(event==symeight) {
		textview.setText(textview.getText()+"8");
	}
	else if(event==symnine) {
		textview.setText(textview.getText()+"9");
	}
	else if(event==symdot) {
		textview.setText(textview.getText()+".");
	}
	else if(event==symzero) {
		if (textview.getText().equals("0")){
			return;
		}
		else {	
		textview.setText(textview.getText()+"0");
		}
	}
	else if(event==symclr) {
		label.setText("");
		textview.setText("");
	}
	else if(event==symdel) {
		int length=textview.getText().length();
		int number=length-1;
		if(length>0) {
			StringBuilder numstring=new StringBuilder(textview.getText());
			numstring.deleteCharAt(number);
			textview.setText(numstring.toString());
		}
		if (textview.getText().endsWith("")) {
		label.setText("");
	      }
	}
	else if(event == symmul) {
		String presentNumber=textview.getText();	
		input=Double.parseDouble(textview.getText());
		textview.setText("");
		label.setText(presentNumber+"*");
		cal="*";
    }
	else if(event==symdiv) {
		String presentNumber=textview.getText();	
		input=Double.parseDouble(textview.getText());
		textview.setText("");
		label.setText(presentNumber+"/");
		cal="/";
    }
	else if(event==symminus) {
		String presentNumber=textview.getText();	
		input=Double.parseDouble(textview.getText());
		textview.setText("");
		label.setText(presentNumber+"-");
		cal="-";
    }
	else if(event==symplus) {
		String presentNumber=textview.getText();	
		input=Double.parseDouble(textview.getText());
		textview.setText("");
		label.setText(presentNumber+"+");
		cal="+";
    }
	else if(event==symequal) {
		switch(cal) {
		case "*":
			result=input*(Double.parseDouble(textview.getText()));
			if(Double.toString(result).endsWith(".0")) {
				textview.setText(Double.toString(result).replace(".0",""));
			}else {
				textview.setText(Double.toString(result));
			}
			label.setText("");
			break;
	case "/":
		result=input/(Double.parseDouble(textview.getText()));
		if(Double.toString(result).endsWith(".0")) {
			textview.setText(Double.toString(result).replace(".0",""));
		}else {
			textview.setText(Double.toString(result));
		}
		label.setText("");
		break;
	case "-":
		result=input-(Double.parseDouble(textview.getText()));
		if(Double.toString(result).endsWith(".0")) {
			textview.setText(Double.toString(result).replace(".0",""));
		}else {
			textview.setText(Double.toString(result));
		}
		label.setText("");
		break;
	case "+":
		result=input+(Double.parseDouble(textview.getText()));
		if(Double.toString(result).endsWith(".0")) {
			textview.setText(Double.toString(result).replace(".0",""));
		}else {
			textview.setText(Double.toString(result));
		}
		label.setText("");
		break;
	}
}

	
}

}
