import javax.swing.JButton;


public class Case extends JButton {
	
	private int m_positionX;
	private int m_positionY;
	//private String
	private Piece m_piece = null;
	private String m_surlignee;
	
	public Case(int p_positionX, int p_positionY){
		this.m_positionX = p_positionX;
		this.m_positionY = p_positionY;
		this.m_surlignee = "";
		this.m_piece = null;
	}
	
	public int getPositionX(){
		return this.m_positionX;
	}
	
	public int getPositionY(){
		return this.m_positionY;
	}
	
	public String getSurlignee(){
		return this.m_surlignee;
	}
	
	public void setSurlignee(String p_surlignee){
		this.m_surlignee = p_surlignee;
	}
	
	public Piece getPiece(){
		return this.m_piece;
	}
	
	public void setPiece(Piece p_piece){
		this.m_piece = p_piece;
	}
	
	public void supprimerPiece(){
		this.m_piece = null;
	}
	
	public boolean occupee()
	{
		return (this.m_piece == null);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}