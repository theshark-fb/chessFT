
public class Fou extends Piece {

	public Fou(String p_couleur, int p_positionX, int p_positionY) {
		this.m_couleur = p_couleur;
		this.m_libelle = "Fou";
		this.m_positionX = p_positionX;
		this.m_positionY = p_positionY;
	}
	
	public Case[] destinations(){
		int i = 0;
		int pos_x = this.m_positionX;
		int pos_y = this.m_positionY;
		Case[] cases = new Case[13];
		int x = -pos_x;
		int y = -pos_y;
		
		while(x >= 0 && x < 8 && y >= 0 && y < 8){
			if(Plateau.getCase(pos_x+x, pos_y+y).getPiece() == null || Plateau.getCase(pos_x-x, pos_y-y).getPiece().getCouleur() != this.m_couleur){
				cases[i] = Plateau.getCase(pos_x-x, pos_y-y);
				x++;
				y++;
				i++;
			}
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
