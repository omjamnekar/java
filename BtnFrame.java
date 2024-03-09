import javax.swing.*;
class demoSwing{

	public demoSwing(){

	JFrame f =new JFrame();
	JButton b =new JButton("click");
	f.add(b);
		
	f.setSize(500,500);

b.setBounds(50,50,100,50);
f.setLayout(null);	
	f.setVisible(true);	
	

}
}

class BtnFrame{

	public static void main(String args[]){
	
 demoSwing s =new demoSwing();
}
}