
public class Pion extends Piece {
	
	boolean m_premierDeplacement = true;

	public Pion(String p_couleur, int p_positionX, int p_positionY) {
		this.m_couleur = p_couleur;
		this.m_libelle = "Pion";
		this.m_positionX = p_positionX;
		this.m_positionY = p_positionY;

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
	
	public Case[] destinations(){
		int i = 0;
		Case[] cases = new Case[3];
		int pos_x = this.m_positionX;
		int pos_y = this.m_positionY;
		if(this.m_couleur == "blanche")
			pos_x += 1;
		else
			pos_x -= 1;
		if(pos_x>0 && pos_x<7){
			//ok
			if(Plateau.getCase(pos_x, pos_y).getPiece() == null){
				cases[i] = Plateau.getCase(pos_x, pos_y);
				i++;
			}
			if(pos_y>0){
				//ok
				if(Plateau.getCase(pos_x, pos_y-1).getPiece() != null && Plateau.getCase(pos_x, pos_y-1).getPiece().getCouleur() != this.getCouleur()){
					cases[i] = Plateau.getCase(pos_x, pos_y-1);
					i++;
				}
			}
			if(pos_y<7){
				//ok
				if(Plateau.getCase(pos_x, pos_y+1).getPiece() != null && Plateau.getCase(pos_x, pos_y+1).getPiece().getCouleur() != this.getCouleur()){
					cases[i] = Plateau.getCase(pos_x, pos_y+1);
					i++;
				}
			}
			if(m_premierDeplacement && Plateau.getCase(pos_x, pos_y) == null && Plateau.getCase(pos_x+pos_x, pos_y) == null){
				cases[i] = Plateau.getCase(pos_x, pos_y+pos_y);
				i++;
			}
		}
		return cases;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
