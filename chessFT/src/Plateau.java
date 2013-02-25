import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Plateau extends JPanel{
	
	private Historique m_mouvements;
	private int m_tourDeJeu = 1;
	public static Case[][] m_plateau;
	private int m_tailleCase = 50;
	
	public Plateau(){
		int x, y;
		Plateau.m_plateau = new Case[8][8];
		
		for(x = 0; x < 8; x++)
		{
			for(y = 0; y < 8; y++)
			{
				Plateau.m_plateau[x][y] = new Case(x+1, y+1);
			}
		}
		
		/* Blancs */
		Plateau.getCase(1, 1).setPiece(new Tour("blanc", 1, 1));
		Plateau.getCase(2, 1).setPiece(new Cavalier("blanc", 1, 2));
		Plateau.getCase(2, 1).setPiece(new Fou("blanc", 1, 3));
		Plateau.getCase(4, 1).setPiece(new Reine("blanc", 1, 4));
		Plateau.getCase(5, 1).setPiece(new Roi("blanc", 1, 5));
		Plateau.getCase(6, 1).setPiece(new Fou("blanc", 1, 6));
		Plateau.getCase(7, 1).setPiece(new Cavalier("blanc", 1, 7));
		Plateau.getCase(8, 1).setPiece(new Tour("blanc", 1, 8));
		for(y = 1; y <= 8; y++)
		{
			Plateau.getCase(2, y).setPiece(new Pion("blanc", 2, y));
		}
		
		/* Noirs */
		Plateau.getCase(1, 8).setPiece(new Tour("noir", 1, 8));
		Plateau.getCase(2, 8).setPiece(new Cavalier("noir", 2, 8));
		Plateau.getCase(3, 8).setPiece(new Fou("noir", 3, 8));
		Plateau.getCase(4, 8).setPiece(new Reine("noir", 4, 8));
		Plateau.getCase(5, 8).setPiece(new Roi("noir", 5, 8));
		Plateau.getCase(6, 8).setPiece(new Fou("noir", 6, 8));
		Plateau.getCase(7, 8).setPiece(new Cavalier("noir", 7, 8));
		Plateau.getCase(8, 8).setPiece(new Tour("noir", 8, 8));
		for(y = 1; y <= 8; y++)
		{
			Plateau.getCase(7, y).setPiece(new Pion("noir", 7, y));
		}
	}
	
	public void paintComponent(Graphics g){
		String surlignee;
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				surlignee = Plateau.m_plateau[i][j].getSurlignee();
				if(surlignee == "destination")
					g.setColor(Color.YELLOW);
				else if(surlignee == "selection")
					g.setColor(Color.ORANGE);
				else{
					if((i+j)%2 == 0)
						g.setColor(Color.DARK_GRAY);
					else
						g.setColor(Color.LIGHT_GRAY);
				}
				g.fillRect(i*m_tailleCase, j*m_tailleCase, m_tailleCase, m_tailleCase);
			}
		}
	}
	
	public static Case getCase(int p_positionX, int p_positionY){
		return Plateau.m_plateau[p_positionX - 1][p_positionY - 1];
	}
	
	public void deplacer(Piece p_piece, int p_destinationX, int p_destinationY)
	{
		int origineX = p_piece.getPositionX(), origineY = p_piece.getPositionY();
		// D�but initialisation historique
		String histo = m_mouvements.prepareMouvement(p_piece, p_destinationX, p_destinationY); 
		// Fin initialisation historique
		
		p_piece.setPositionX(p_destinationX);
		p_piece.setPositionY(p_destinationY);
		if(p_piece.getLibelle() == "Pion") p_piece.setPremierDeplacement();
		
		Plateau.getCase(p_destinationX, p_destinationY).setPiece(p_piece);
		
		Plateau.getCase(origineX, origineY).supprimerPiece();
		
		m_mouvements.addMouvement(histo);
		
		if(!Plateau.mat()) this.m_tourDeJeu++;
	}
	
	public static boolean echec(){
		return false;
	}
	
	public static boolean mat(){
		return false;
	}
	
	/*public boolean pat(){
		
	}*/
	
	public int getTailleCase(){
		return m_tailleCase;
	}
	
	public void setTailleCase(int p_tailleCase){
		m_tailleCase = p_tailleCase;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
