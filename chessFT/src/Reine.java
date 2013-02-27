import java.util.ArrayList;


public class Reine extends Piece {

	public Reine(String p_couleur, int p_positionX, int p_positionY) {
		this.m_couleur = p_couleur;
		this.m_libelle = "Reine";
		this.m_positionX = p_positionX;
		this.m_positionY = p_positionY;
	}
	
	public ArrayList<Case> destinations(){
		ArrayList<Case> cases = new ArrayList<Case>();
		int pos_x = this.m_positionX;
		int pos_y = this.m_positionY;
		int pas = 0;
		boolean fin = false;
		/*while(pos_x-pas>=1 && !fin){
			if(Plateau.getCase(pos_x-pas, pos_y).getPiece() == null){
				cases.add(Plateau.getCase(pos_x-pas, pos_y));
			}
			else if(Plateau.getCase(pos_x-pas, pos_y).getPiece().getCouleur() != this.m_couleur){
				cases.add(Plateau.getCase(pos_x-pas, pos_y));
				fin = true;
			}
			pas++;
		}
		fin = false;
		pas = 0;*/
		while(pos_x+pas<=8 && !fin){
			if(Plateau.getCase(pos_x+pas, pos_y).getPiece() == null){
				cases.add(Plateau.getCase(pos_x+pas, pos_y));
			}
			else if(Plateau.getCase(pos_x+pas, pos_y).getPiece().getCouleur() != this.m_couleur){
				cases.add(Plateau.getCase(pos_x+pas, pos_y));
				fin = true;
			}
			pas++;
		}
		fin = false;
		pas = 0;
		/*while(pos_y-pas>=1 && !fin){
			if(Plateau.getCase(pos_x, pos_y-pas).getPiece() == null){
				cases.add(Plateau.getCase(pos_x, pos_y-pas));
			}
			else if(Plateau.getCase(pos_x, pos_y-pas).getPiece().getCouleur() != this.m_couleur){
				cases.add(Plateau.getCase(pos_x, pos_y-pas));
				fin = true;
			}
			pas++;
		}
		fin = false;
		pas = 0;
		while(pos_y+pas<=8 && !fin){
			if(Plateau.getCase(pos_x, pos_y+pas).getPiece() == null){
				cases.add(Plateau.getCase(pos_x, pos_y+pas));
			}
			else if(Plateau.getCase(pos_x, pos_y+pas).getPiece().getCouleur() != this.m_couleur){
				cases.add(Plateau.getCase(pos_x, pos_y+pas));
				fin = true;
			}
			pas++;
		}
		fin = false;
		pas = 0;
		while(pos_x-pas>=1 && pos_y-pas>=1 && !fin){
			if(Plateau.getCase(pos_x-pas, pos_y-pas).getPiece() == null)
				cases.add(Plateau.getCase(pos_x-pas, pos_y-pas));
			else if(Plateau.getCase(pos_x-pas, pos_y-pas).getPiece().getCouleur() != this.getCouleur()){
				cases.add(Plateau.getCase(pos_x-pas, pos_y-pas));
				fin = true;
			}
			pas++;
		}
		fin = false;
		pas = 0;
		while(pos_x+pas<=8 && pos_y-pas>=1 && !fin){
			if(Plateau.getCase(pos_x+pas, pos_y-pas).getPiece() == null)
				cases.add(Plateau.getCase(pos_x+pas, pos_y-pas));
			else if(Plateau.getCase(pos_x+pas, pos_y-pas).getPiece().getCouleur() != this.getCouleur()){
				cases.add(Plateau.getCase(pos_x+pas, pos_y-pas));
				fin = true;
			}
			pas++;
		}
		fin = false;
		pas = 0;
		while(pos_x+pas<=8 && pos_y+pas<=8 && !fin){
			if(Plateau.getCase(pos_x+pas, pos_y+pas).getPiece() == null)
				cases.add(Plateau.getCase(pos_x+pas, pos_y+pas));
			else if(Plateau.getCase(pos_x+pas, pos_y+pas).getPiece().getCouleur() != this.getCouleur()){
				cases.add(Plateau.getCase(pos_x+pas, pos_y+pas));
				fin = true;
			}
			pas++;
		}
		fin = false;
		pas = 0;
		while(pos_x-pas>=1 && pos_y+pas<=8 && !fin){
			if(Plateau.getCase(pos_x-pas, pos_y+pas).getPiece() == null)
				cases.add(Plateau.getCase(pos_x-pas, pos_y+pas));
			else if(Plateau.getCase(pos_x-pas, pos_y+pas).getPiece().getCouleur() != this.getCouleur()){
				cases.add(Plateau.getCase(pos_x-pas, pos_y+pas));
				fin = true;
			}
			pas++;
		}*/
		return cases;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
