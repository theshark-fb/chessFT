import java.util.ArrayList;


public class Historique {
	
	private ArrayList<String> m_mouvements;
	
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
		histo = p_piece.getType()+caractereDepart+Integer.toString(origineY)+"-"+caractereArrivee+Integer.toString(p_destinationY);
		
		if(occupee) {
			histo += "x";
		}
		return histo;
	}
	
	public void addMouvement(String histo)
	{
		if(Plateau.echec()) histo += "+";
		if(Plateau.mat()) histo += "+";
		this.m_mouvements.add(histo);
	}
	
	public void annulerMouvement()
	{
		
	}
	
	public String getTour(int tour)
	{
		return m_mouvements.get(tour/2)+" "+m_mouvements.get(tour/2+1);
	}
}
