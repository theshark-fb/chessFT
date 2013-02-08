
public class Piece {
	
	int m_positionX;
	int m_positionY;
	String m_couleur;
	
	public Piece(){
		
	}
	
	public Piece(String p_couleur){
		this.m_couleur = p_couleur;
	}
	
	public int getPositionX(){
		return this.m_positionX;
	}
	
	public int getPositionY(){
		return this.m_positionY;
	}
	
	public String getCouleur(){
		return this.m_couleur;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
