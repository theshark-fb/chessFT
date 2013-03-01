import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

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
		Plateau.getCase(1, 2).setPiece(new Cavalier("blanc", 1, 2));
		Plateau.getCase(1, 3).setPiece(new Fou("blanc", 1, 3));
		Plateau.getCase(1, 4).setPiece(new Reine("blanc", 1, 4));
		Plateau.getCase(1, 5).setPiece(new Roi("blanc", 1, 5));
		Plateau.getCase(1, 6).setPiece(new Fou("blanc", 1, 6));
		Plateau.getCase(1, 7).setPiece(new Cavalier("blanc", 1, 7));
		Plateau.getCase(1, 8).setPiece(new Tour("blanc", 1, 8));
		for(y = 1; y <= 8; y++)
		{
			Plateau.getCase(2, y).setPiece(new Pion("blanc", 2, y));
		}
		
		/* Noirs */
		Plateau.getCase(8, 1).setPiece(new Tour("noir", 8, 1));
		Plateau.getCase(8, 2).setPiece(new Cavalier("noir", 8, 2));
		Plateau.getCase(8, 3).setPiece(new Fou("noir", 8, 3));
		Plateau.getCase(8, 4).setPiece(new Reine("noir", 8, 4));
		Plateau.getCase(8, 5).setPiece(new Roi("noir", 8, 5));
		Plateau.getCase(8, 6).setPiece(new Fou("noir", 8, 6));
		Plateau.getCase(8, 7).setPiece(new Cavalier("noir", 8, 7));
		Plateau.getCase(8, 8).setPiece(new Tour("noir", 8, 8));
		for(y = 1; y <= 8; y++)
		{
			Plateau.getCase(7, y).setPiece(new Pion("noir", 7, y));
		}
	}
	
	public int getTourDeJeu()
	{
		return this.m_tourDeJeu;
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
				int marge = (m_tailleCase-30)/2;
				g.fillRect(i*m_tailleCase, j*m_tailleCase, m_tailleCase, m_tailleCase);
				if(Plateau.getCase(i+1, j+1).getPiece() != null){
					try{
						String nom_image = "res/" + Plateau.getCase(i+1, j+1).getPiece().getLibelle() + "_" + Plateau.getCase(i+1, j+1).getPiece().getCouleur() + ".png";
						Image img = ImageIO.read(new File(nom_image));
				      	g.drawImage(img, i*m_tailleCase+marge, j*m_tailleCase+marge, this);
				    }
					catch (IOException e){
				      	e.printStackTrace();
					}
				}
			}
		}
	}
	
	public static Case getCase(int p_positionX, int p_positionY){
		return Plateau.m_plateau[p_positionX - 1][p_positionY - 1];
	}
	
	public void deplacer(Piece p_piece, int p_destinationX, int p_destinationY)
	{
		Case caseDestination = Plateau.getCase(p_destinationX, p_destinationY);
		boolean roque = (p_piece.getClass().getName() == "Roi" && caseDestination.getPiece() != null && caseDestination.getPiece().getClass().getName() == "Tour" && p_piece.getCouleur() == caseDestination.getPiece().getCouleur());
		int origineX = p_piece.getPositionX(), origineY = p_piece.getPositionY();
		// Début initialisation historique
		String histo = m_mouvements.prepareMouvement(p_piece, p_destinationX, p_destinationY);
		// Fin initialisation historique
		
		if(roque) {
			Tour tour = (Tour) caseDestination.getPiece();
			p_piece.setRoque();
			tour.setRoque();
		}
		
		p_piece.setPositionX(p_destinationX);
		p_piece.setPositionY(p_destinationY);
		if(p_piece.getClass().getName() == "Pion") {
			Pion pion = (Pion) p_piece;
			pion.setPremierDeplacement();
		}
		
		caseDestination.setPiece(p_piece);
		
		Plateau.getCase(origineX, origineY).supprimerPiece();
		
		if(roque)
		{
			tour.setPositionX(origineX);
			tour.setPositionY(origineY);
			Plateau.getCase(origineX, origineY).setPiece(tour);
		}
		
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
