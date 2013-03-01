import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Fenetre extends JFrame implements MouseListener  {

	private Plateau m_plateau;
	private Case m_caseSelectionnee;
	
	public Fenetre(){
		this.setTitle("ChessFT");
		this.setSize(400, 432);
		this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setResizable(false);
		
	    this.m_plateau = new Plateau();
		this.setContentPane(this.m_plateau);
		this.setVisible(true);
		this.addMouseListener(this);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fenetre fenetre = new Fenetre();
		
		fenetre.getPlateau().repaint();

	}
	
	public Plateau getPlateau()
	{
		return this.m_plateau;
	}
	
	public void setPlateau(Plateau p_plateau)
	{
		this.m_plateau = p_plateau;
	}
	
	public Case getCaseSelectionnee()
	{
		return this.m_caseSelectionnee;
	}
	
	public void setCaseSelectionnee(Case p_case)
	{
		this.m_caseSelectionnee = p_case;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		int x = (int) arg0.getPoint().getX(), y = (int) arg0.getPoint().getY();
		int coordX = (x)/m_plateau.getTailleCase()+1, coordY = (y-26)/m_plateau.getTailleCase()+1;
    	System.out.println("x: "+Integer.toString(x)+" y: "+Integer.toString(y));
    	System.out.println("Taille case : "+Integer.toString(m_plateau.getTailleCase())+" Case : "+Integer.toString(coordX)+" "+Integer.toString(coordY));
    	Case caseCliquee = Plateau.getCase(coordX, coordY);
    	Piece pieceCliquee = caseCliquee.getPiece();
    	
    	if(pieceCliquee != null && ((m_plateau.getTourDeJeu()%2 == 0 && pieceCliquee.getCouleur() == "blanc") || (m_plateau.getTourDeJeu()%2 == 1 && pieceCliquee.getCouleur() == "noir")))
    	{
    		return;
    	}
    	
    	if(pieceCliquee != null && this.m_caseSelectionnee == null)
    	{
    		caseCliquee.setSurlignee("selection");
    		ArrayList<Case> destinations = pieceCliquee.destinations();
    		for(int i = 0; i < destinations.size(); i++)
    		{
    			destinations.get(i).setSurlignee("destination");
    		}
    		this.m_caseSelectionnee = caseCliquee;
    	}
    	else
    	{
    		if(m_caseSelectionnee.getPiece().destinations().contains(caseCliquee)) {
    			this.m_plateau.deplacer(this.m_caseSelectionnee.getPiece(), caseCliquee.getPositionX(), caseCliquee.getPositionY());
    			
    		}
    		else
    		{
    			ArrayList<Case> destinations = m_caseSelectionnee.getPiece().destinations();
    			for(int i = 0; i < destinations.size(); i++)
        		{
        			destinations.get(i).setSurlignee("");
        		}
    		}
    		caseCliquee.setSurlignee("");
    		m_caseSelectionnee.setSurlignee("");
    		this.m_caseSelectionnee = null;
    	}
    	
    	this.m_plateau.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent mouseEvent) {
		
	}
	
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
