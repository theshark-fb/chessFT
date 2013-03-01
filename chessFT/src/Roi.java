import java.util.ArrayList;


public class Roi extends Piece {

	private boolean m_roque = true;

	public Roi(String p_couleur, int p_positionX, int p_positionY) {
		this.m_couleur = p_couleur;
		this.m_libelle = "Roi";
		this.m_positionX = p_positionX;
		this.m_positionY = p_positionY;
	}
	
	public boolean getRoque(){
		return this.m_roque;
	}
	
	public ArrayList<Case> destinations(){
		ArrayList<Case> cases = new ArrayList<Case>();
		int pos_x = this.m_positionX;
		int pos_y = this.m_positionY;
		if(pos_x>1 && (Plateau.getCase(pos_x-1, pos_y).getPiece() == null || Plateau.getCase(pos_x-1, pos_y).getPiece().getCouleur() != this.getCouleur()))
			cases.add(Plateau.getCase(pos_x-1, pos_y));
		if(pos_x<8 && (Plateau.getCase(pos_x+1, pos_y).getPiece() == null || Plateau.getCase(pos_x+1, pos_y).getPiece().getCouleur() != this.getCouleur()))
			cases.add(Plateau.getCase(pos_x+1, pos_y));
		if(pos_y>1 && (Plateau.getCase(pos_x, pos_y-1).getPiece() == null || Plateau.getCase(pos_x, pos_y-1).getPiece().getCouleur() != this.getCouleur()))
			cases.add(Plateau.getCase(pos_x, pos_y-1));
		if(pos_y<8 && (Plateau.getCase(pos_x, pos_y+1).getPiece() == null || Plateau.getCase(pos_x, pos_y+1).getPiece().getCouleur() != this.getCouleur()))
			cases.add(Plateau.getCase(pos_x, pos_y+1));
		return cases;
	}
	
	public String getType()
	{
		return "R";
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
