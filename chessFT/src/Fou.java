
public class Fou extends Piece {
	
	public Fou(){
		super();
	}
	
	public Fou(String p_couleur){
		super(p_couleur);
		m_libelle = "Fou";
	}

	public Fou(String p_couleur, int p_positionX, int p_positionY) {
		this.m_couleur = p_couleur;
		this.m_libelle = "Fou";
		this.m_positionX = p_positionX;
		this.m_positionY = p_positionY;
	}

}
