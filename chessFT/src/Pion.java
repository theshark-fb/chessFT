
public class Pion extends Piece {

	public Pion(){
		super();
	}
	
	public Pion(String p_couleur){
		super(p_couleur);
		m_libelle = "Pion";
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	public Pion(String p_couleur, int p_positionX, int p_positionY) {
		this.m_couleur = p_couleur;
		this.m_libelle = "Pion";
		this.m_positionX = p_positionX;
		this.m_positionY = p_positionY;

	}

}
