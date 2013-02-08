
public class Pion extends Piece {
	
	boolean m_premierDeplacement = true;

	public Pion(String p_couleur, int p_positionX, int p_positionY) {
		this.m_couleur = p_couleur;
		this.m_libelle = "Pion";
		this.m_positionX = p_positionX;
		this.m_positionY = p_positionY;

	}
	
	public boolean getPremierDeplacement(){
		return this.m_premierDeplacement;
	}
	
	public void promotion(){
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
