import java.util.ArrayList;

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
		
		//System.out.println(Plateau.getCase(5, 2).getPositionX());
		//System.out.println(Plateau.getCase(5, 2).getPositionY());
		
		ArrayList<Case> cases = Plateau.getCase(2, 5).getPiece().destinations();
		Plateau.getCase(2, 5).setSurlignee("selection");
		System.out.println(cases.size());
		for(int i=0;i<cases.size();i++){
			int pos_x = cases.get(i).getPositionX();
			int pos_y = cases.get(i).getPositionY();
			Plateau.getCase(pos_x, pos_y).setSurlignee("destination");
			System.out.println(i);
		}
		//Plateau.getCase(2, 6).setSurlignee("selection");
		
		plat.repaint();

	}

}
