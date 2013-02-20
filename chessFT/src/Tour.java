
public class Tour extends Piece {

	private boolean m_roque = true;

	public Tour(String p_couleur, int p_positionX, int p_positionY) {
		this.m_couleur = p_couleur;
		this.m_libelle = "Tour";
		this.m_positionX = p_positionX;
		this.m_positionY = p_positionY;
	}
	
	public boolean getRoque(){
		return this.m_roque;
	}
	
	public Case[] destinations(){
		int i = 0;
		Case[] cases = new Case[14];
		
		return cases;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
