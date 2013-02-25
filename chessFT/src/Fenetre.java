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
		Plateau plat = new Plateau();
		
		Case[] cases = Plateau.getCase(2, 5).getPiece().destinations();
		Plateau.getCase(2, 5).setSurlignee("selection");
		System.out.println(cases.length);
		/*for(int i=0;i<cases.length;i++){
			int pos_x = cases[i].getPositionX();
			int pos_y = cases[i].getPositionY();
			Plateau.getCase(pos_x, pos_y).setSurlignee("destination");
			System.out.println(i);
		}*/
		Plateau.getCase(2, 6).setSurlignee("destination");
		
		plat.repaint();

	}

}
