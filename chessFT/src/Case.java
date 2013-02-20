
public class Case {
	
	int m_positionX;
	int m_positionY;
	Piece m_piece = null;
	String m_surlignee;
	
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
