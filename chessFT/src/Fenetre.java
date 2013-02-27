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
		
		ArrayList<Case> cases = Plateau.getCase(4, 4).getPiece().destinations();
		Plateau.getCase(4, 4).setSurlignee("selection");
		System.out.println(cases.size());
		for(int i=0;i<cases.size();i++){
			int pos_x = cases.get(i).getPositionX();
			int pos_y = cases.get(i).getPositionY();
			System.out.print("Pos_x : ");
			System.out.print(pos_x);
			System.out.print(" & Pos_y : ");
			System.out.println(pos_y);
			Plateau.getCase(pos_x, pos_y).setSurlignee("destination");
			System.out.println(i);
		}
		
		plat.repaint();

	}

}
