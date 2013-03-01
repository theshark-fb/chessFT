import java.util.ArrayList;


public class Pion extends Piece {
	
	boolean m_premierDeplacement = true;

	public Pion(String p_couleur, int p_positionX, int p_positionY) {
		super(p_couleur, p_positionX, p_positionY);
		this.m_libelle = "Pion";
	}
	
	public boolean getPremierDeplacement(){
		return this.m_premierDeplacement;
	}
	
	public void setPremierDeplacement()
	{
		this.m_premierDeplacement = false;
	}
	
	public void promotion(){ // Demande en quoi le pion doit �tre promu
		
	}
	
	public ArrayList<Case> destinations(){
		ArrayList<Case> cases = new ArrayList<Case>();
		int pos_x = this.m_positionX;
		int pos_y = this.m_positionY;
		int pas;
		if(this.m_couleur == "blanc")
			pas = 1;
		else
			pas = -1;
		if(pos_x>1 && pos_x<8){
			if(Plateau.getCase(pos_x+pas, pos_y).getPiece() == null){
				cases.add(Plateau.getCase(pos_x+pas, pos_y));
			}
			if(pos_y>1){
				if(Plateau.getCase(pos_x+pas, pos_y-1).getPiece() != null && Plateau.getCase(pos_x+pas, pos_y-1).getPiece().getCouleur() != this.getCouleur()){
					cases.add(Plateau.getCase(pos_x+pas, pos_y-1));
				}
			}
			if(pos_y<8){
				if(Plateau.getCase(pos_x+pas, pos_y+1).getPiece() != null && Plateau.getCase(pos_x+pas, pos_y+1).getPiece().getCouleur() != this.getCouleur()){
					cases.add(Plateau.getCase(pos_x+pas, pos_y+1));
				}
			}
			if(m_premierDeplacement == true && Plateau.getCase(pos_x+pas, pos_y).getPiece() == null && Plateau.getCase(pos_x+pas+pas, pos_y).getPiece() == null){
				cases.add(Plateau.getCase(pos_x+pas+pas, pos_y));
			}
		}
		return cases;
	}
	
	public String getType()
	{
		return "";
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
