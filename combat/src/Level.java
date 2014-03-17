import java.awt.Graphics;

public class Level {

	private int Level;
	
	public Level(int _x) {
		Level=_x;
		
		// TODO auto-generated constructor stub
	}
	
	public void draw(Graphics g){
		
		//top
		g.fillRect(0, 40, 1200, 20);
		
		//bottom
		g.fillRect(0, 715, 1200, 20);
		
		//bunker1
		g.fillRect(130, 290, 15, 120);
		g.fillRect(90, 290, 40, 20);
		g.fillRect(90, 390, 40, 20);
		
		//bunker2
		g.fillRect(1050, 290, 15, 120);
		g.fillRect(1060, 290, 40, 20);
		g.fillRect(1060, 390, 40, 20);
		
		//center blocks
		g.fillRect(600, 425, 20, 100);
		g.fillRect(600, 225, 20, 100);
		g.fillRect(430, 365, 100, 20);
		g.fillRect(680, 365, 100, 20);
		
		//top block
		g.fillRect(575, 40, 80, 100);
		
		//bottom block
		g.fillRect(575, 615, 80, 100);
		
		//top line left
		g.fillRect(150, 130, 330, 40);
		
		//top line right
		g.fillRect(750, 130, 330, 40);
		
		//bottom line left
		g.fillRect(150, 560, 330, 40);
		
		//bottom line right
		g.fillRect(750, 560, 330, 40);
		
		//center right
		g.fillRect(300, 230, 50, 260);
		
		//center left
		g.fillRect(855, 230, 50, 260);
}

}