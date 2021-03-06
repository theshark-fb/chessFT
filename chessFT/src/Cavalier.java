import java.util.ArrayList;


public class Cavalier extends Piece {

	public Cavalier(String p_couleur, int p_positionX, int p_positionY) {
		super(p_couleur, p_positionX, p_positionY);
		this.m_libelle = "Cavalier";
	}
	
	public ArrayList<Case> destinations(){
		ArrayList<Case> cases = new ArrayList<Case>();
		int pos_x = this.m_positionX;
		int pos_y = this.m_positionY;
		if(pos_x-2>=1){
			if(pos_y-1>=1){
				if(Plateau.getCase(pos_x-2, pos_y-1).getPiece() == null || Plateau.getCase(pos_x-2, pos_y-1).getPiece().getCouleur() != this.getCouleur())
					cases.add(Plateau.getCase(pos_x-2, pos_y-1));
			}
			if(pos_y+1<=8){
				if(Plateau.getCase(pos_x-2, pos_y+1).getPiece() == null || Plateau.getCase(pos_x-2, pos_y+1).getPiece().getCouleur() != this.getCouleur())
					cases.add(Plateau.getCase(pos_x-2, pos_y+1));
			}
		}
		if(pos_y-2>=1){
			if(pos_x-1>=1){
				if(Plateau.getCase(pos_x-1, pos_y-2).getPiece() == null || Plateau.getCase(pos_x-1, pos_y-2).getPiece().getCouleur() != this.getCouleur())
					cases.add(Plateau.getCase(pos_x-1, pos_y-2));
			}
			if(pos_x+1<=8){
				if(Plateau.getCase(pos_x+1, pos_y-2).getPiece() == null || Plateau.getCase(pos_x+1, pos_y-2).getPiece().getCouleur() != this.getCouleur())
					cases.add(Plateau.getCase(pos_x+1, pos_y-2));
			}
		}
		if(pos_x+2<=8){
			if(pos_y-1>=1){
				if(Plateau.getCase(pos_x+2, pos_y-1).getPiece() == null || Plateau.getCase(pos_x+2, pos_y-1).getPiece().getCouleur() != this.getCouleur())
					cases.add(Plateau.getCase(pos_x+2, pos_y-1));
			}
			if(pos_y+1<=8){
				if(Plateau.getCase(pos_x+2, pos_y+1).getPiece() == null || Plateau.getCase(pos_x+2, pos_y+1).getPiece().getCouleur() != this.getCouleur())
					cases.add(Plateau.getCase(pos_x+2, pos_y+1));
			}
		}
		if(pos_y+2<=8){
			if(pos_x-1>=1){
				if(Plateau.getCase(pos_x-1, pos_y+2).getPiece() == null || Plateau.getCase(pos_x-1, pos_y+2).getPiece().getCouleur() != this.getCouleur())
					cases.add(Plateau.getCase(pos_x-1, pos_y+2));
			}
			if(pos_x+1<=8){
				if(Plateau.getCase(pos_x+1, pos_y+2).getPiece() == null || Plateau.getCase(pos_x+1, pos_y+2).getPiece().getCouleur() != this.getCouleur())
					cases.add(Plateau.getCase(pos_x+1, pos_y+2));
			}
		}	
		return cases;
	}
	
	public String getType()
	{
		return "C";
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
