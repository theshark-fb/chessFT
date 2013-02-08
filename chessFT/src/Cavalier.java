
public class Cavalier extends Piece {
	
	public Cavalier(){
		super();
	}
	
	public Cavalier(String p_couleur){
		super(p_couleur);
		m_libelle = "Cavalier";
	}

	public Cavalier(String p_couleur, int p_positionX, int p_positionY) {
		this.m_couleur = p_couleur;
		this.m_libelle = "Cavalier";
		this.m_positionX = p_positionX;
		this.m_positionY = p_positionY;
	}

}
