import java.util.ArrayList;


public class Fou extends Piece {

	public Fou(String p_couleur, int p_positionX, int p_positionY) {
		this.m_couleur = p_couleur;
		this.m_libelle = "Fou";
		this.m_positionX = p_positionX;
		this.m_positionY = p_positionY;
	}
	
	public ArrayList<Case> destinations(){
		int pos_x = this.m_positionX;
		int pos_y = this.m_positionY;
		ArrayList<Case> cases = new ArrayList<Case>();
		int pas = 1;
		boolean fin = false;
		while(pos_x-pas>=1 && pos_y-pas>=1 && !fin){
			if(Plateau.getCase(pos_x-pas, pos_y-pas).getPiece() == null)
				cases.add(Plateau.getCase(pos_x-pas, pos_y-pas));
			else if(Plateau.getCase(pos_x-pas, pos_y-pas).getPiece().getCouleur() != this.getCouleur()){
				cases.add(Plateau.getCase(pos_x-pas, pos_y-pas));
				fin = true;
			}
			else if(Plateau.getCase(pos_x-pas, pos_y-pas).getPiece().getCouleur() == this.getCouleur())
				fin = true;
			pas++;
		}
		fin = false;
		pas = 1;
		while(pos_x+pas<=8 && pos_y-pas>=1 && !fin){
			if(Plateau.getCase(pos_x+pas, pos_y-pas).getPiece() == null)
				cases.add(Plateau.getCase(pos_x+pas, pos_y-pas));
			else if(Plateau.getCase(pos_x+pas, pos_y-pas).getPiece().getCouleur() != this.getCouleur()){
				cases.add(Plateau.getCase(pos_x+pas, pos_y-pas));
				fin = true;
			}
			else if(Plateau.getCase(pos_x+pas, pos_y-pas).getPiece().getCouleur() == this.getCouleur())
				fin = true;
			pas++;
		}
		fin = false;
		pas = 1;
		while(pos_x+pas<=8 && pos_y+pas<=8 && !fin){
			if(Plateau.getCase(pos_x+pas, pos_y+pas).getPiece() == null)
				cases.add(Plateau.getCase(pos_x+pas, pos_y+pas));
			else if(Plateau.getCase(pos_x+pas, pos_y+pas).getPiece().getCouleur() != this.getCouleur()){
				cases.add(Plateau.getCase(pos_x+pas, pos_y+pas));
				fin = true;
			}
			else if(Plateau.getCase(pos_x+pas, pos_y+pas).getPiece().getCouleur() == this.getCouleur())
				fin = true;
			pas++;
		}
		fin = false;
		pas = 1;
		while(pos_x-pas>=1 && pos_y+pas<=8 && !fin){
			if(Plateau.getCase(pos_x-pas, pos_y+pas).getPiece() == null)
				cases.add(Plateau.getCase(pos_x-pas, pos_y+pas));
			else if(Plateau.getCase(pos_x-pas, pos_y+pas).getPiece().getCouleur() != this.getCouleur()){
				cases.add(Plateau.getCase(pos_x-pas, pos_y+pas));
				fin = true;
			}
			else if(Plateau.getCase(pos_x-pas, pos_y+pas).getPiece().getCouleur() == this.getCouleur())
				fin = true;
			pas++;
		}
		return cases;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
