
public class Historique {
	
	private String[] m_mouvements;
	
	public Historique()
	{
		
	}
	
	public Historique(String historique)
	{
		
	}
	
	public String prepareMouvement(Piece p_piece, int p_destinationX, int p_destinationY)
	{
		int origineX = p_piece.getPositionX(), origineY = p_piece.getPositionY();
		String histo;
		boolean occupee = Plateau.getCase(p_destinationX, p_destinationY).occupee();
		
		String caractereDepart =  Integer.toString('a'-1+origineX);
		String caractereArrivee =  Integer.toString('a'-1+p_destinationX);
		histo = caractereDepart+Integer.toString(origineY)+"-"+caractereArrivee+Integer.toString(p_destinationY);
		
		if(p_piece.getLibelle() == "Roi")
		{
			histo = "R"+histo;
		}
		else if(p_piece.getLibelle() == "Reine")
		{
			histo = "D"+histo;
		}
		else if(p_piece.getLibelle() == "Tour")
		{
			histo = "T"+histo;
		}
		else if(p_piece.getLibelle() == "Fou")
		{
			histo = "F"+histo;
		}
		else if(p_piece.getLibelle() == "Cavalier")
		{
			histo = "C"+histo;
		}
		
		if(occupee) histo += "x";
		return histo;
	}
	
	public void addMouvement(String histo)
	{
		if(Plateau.echec()) histo += "+";
		if(Plateau.mat()) histo += "+";
		this.m_mouvements[this.m_mouvements.length] = histo;
	}
	
	public void annulerMouvement()
	{
		
	}
	
	public String getTour(int tour)
	{
		
		return new String("");
	}
}