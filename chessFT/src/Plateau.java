import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Plateau  extends JPanel{
	
	public Plateau(){
		
	}
	
	public void paintComponent(Graphics g){
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 400, 432);
		int k=0;
		for(int i=0;i<400;i+=50){
			for(int j=0;j<400;j+=50){
				int res = i/50 + j/50;
				if(res%2 == 1)
					g.setColor(Color.DARK_GRAY);
				else {
					g.setColor(Color.LIGHT_GRAY);
				}
				g.fillRect(i, j, 50, 50);
				k++;
			}
		}
	  }               
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
