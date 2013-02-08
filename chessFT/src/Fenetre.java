import javax.swing.JFrame;

public class Fenetre extends JFrame {

	public Fenetre(){
		this.setTitle("ChessFT");
		this.setSize(400, 432);
		this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setResizable(false);
		
		this.setContentPane(new Plateau());
		this.setVisible(true);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fenetre fenetre = new Fenetre();
		Plateau plateau = new Plateau();

	}

}
