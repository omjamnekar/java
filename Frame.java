import javax.swing.*;

class demoSwing{

 public demoSwing(){

	JFrame f= new JFrame();
	JButton b= new JButton();
	f.add(b);
	 b.setBounds(50,50,100,100);
	f.setSize(500,500);
	f.setVisible(true);
		
	}
}

class Frame{

	public static void main(String args[]){
	
	demoSwing d=new demoSwing();
	
}
}