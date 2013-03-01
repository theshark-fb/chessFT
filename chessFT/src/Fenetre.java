import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Fenetre extends JFrame implements ActionListener {

	public Fenetre(){
		this.setTitle("ChessFT");
		this.setSize(400, 432);
		this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setResizable(false);
		
		this.setContentPane(new Plateau());
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fenetre fenetre = new Fenetre();
		Plateau plat = new Plateau();
		
		plat.repaint();

	}

}
