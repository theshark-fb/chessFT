
public class Reine extends Piece {

	public Reine(String p_couleur, int p_positionX, int p_positionY) {
		this.m_couleur = p_couleur;
		this.m_libelle = "Reine";
		this.m_positionX = p_positionX;
		this.m_positionY = p_positionY;
	}
	
	public Case[] destinations(){
		int i = 0;
		Case[] cases = new Case[24];
		
		return cases;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
