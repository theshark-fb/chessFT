
public class Roi extends Piece {
	
	public Roi(){
		super();
	}
	
	public Roi(String p_couleur){
		super(p_couleur);
		m_libelle = "Roi";
	}

	public boolean roque = false;

	public Roi(String p_couleur, int p_positionX, int p_positionY) {
		this.m_couleur = p_couleur;
		this.m_libelle = "Roi";
		this.m_positionX = p_positionX;
		this.m_positionY = p_positionY;
	}

}
