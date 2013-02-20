
public class Case {

	private String m_surlignee;
	private int m_positionX;
	private int m_positionY;
	private Piece m_piece;
	
	public Case(int p_positionX, int p_positionY)
	{
		this.m_positionX = p_positionX;
		this.m_positionY = p_positionY;
		this.m_surlignee = "";
		this.m_piece = null;
	}
	
	public int getPositionX()
	{
		return this.m_positionX;
	}
	
	public int getPositionY()
	{
		return this.m_positionY;
	}
	
	public String getSurlignee()
	{
		return this.m_surlignee;
	}
	
	public void setSurlignee(String p_surlignee)
	{
		this.m_surlignee = p_surlignee;
	}
	
	public void setPiece(Piece p_piece)
	{
		this.m_piece = p_piece;
	}
	
	public Piece getPiece()
	{
		return this.m_piece;
	}
	
	public void supprimerPiece()
	{
		this.m_piece = null;
	}
	
	public boolean occupee()
	{
		return (this.m_piece != null);
	}
}
