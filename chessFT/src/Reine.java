
public class Reine extends Piece {
	
	public Reine(){
		super();
	}
	
	public Reine(String p_couleur){
		super(p_couleur);
		m_libelle = "Reine";
	}

	public Reine(String p_couleur, int p_positionX, int p_positionY) {
		this.m_couleur = p_couleur;
		this.m_libelle = "Reine";
		this.m_positionX = p_positionX;
		this.m_positionY = p_positionY;
	}

}
