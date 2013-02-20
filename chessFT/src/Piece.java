
public abstract class Piece {
	
	protected int m_positionX;
	protected int m_positionY;
	protected String m_couleur;
	protected String m_libelle;
	
	public Piece(){
		
	}
	
	public Piece(String p_couleur){
		this.m_couleur = p_couleur;
	}
	
	public int getPositionX(){
		return this.m_positionX;
	}
	
	public String getLibelle()
	{
		return this.m_libelle;
	}
	
	public void setPositionX(int p_positionX){
		this.m_positionX = p_positionX;
	}
	
	public int getPositionY(){
		return this.m_positionY;
	}
	
	public void setPositionY(int p_positionY){
		this.m_positionY = p_positionY;
	}
	
	public String getCouleur(){
		return this.m_couleur;
	}
	
	public abstract Case[] destinations();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
