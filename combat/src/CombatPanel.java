import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class CombatPanel extends JPanel {
	
	private Tank t,t2;
	private Level l;
	
	public void fire(int tank){
		Tank temp;
		if(tank==1)temp=t;
		else temp=t2;
		temp.fire();
		
	}
	
	public void update(){
		t.moveBullet();
		t2.moveBullet();
		Bullet t_bull=t.getBullet();
		Bullet t2_bull=t2.getBullet();
		if(bounding_box_collision
				(t.getTopX(),t.getTopY(),t.getWidth(),
				t.getHeight(),t2_bull.getTopX(), t2_bull.getTopY(),
				t2_bull.getWidth(), t2_bull.getHeight())
				) {
			     t.setX(100);t2.setX(1000);
			     t.setY(100);t2.setY(1000);
			
					}
		
		
		if(bounding_box_collision
				(t2.getTopX(),t2.getTopY(),t2.getWidth(),
				t2.getHeight(),t_bull.getTopX(), t_bull.getTopY(),
				t_bull.getWidth(), t_bull.getHeight())
				) {
			     t.setX(1130);t2.setX(50);
			     t.setY(350);t2.setY(350);
			
					}
		
		
		}
	
	public void moveDir(char c, int tank){
		Tank temp;
		if(tank==1)temp=t;
		else temp=t2;
		temp.move(c);
		
		//top
		
		if(bounding_box_collision
			(t.getTopX(),t.getTopY(),t.getWidth(),
			t.getHeight(),t2.getTopX(), t2.getTopY(),
			t2.getWidth(), t2.getHeight())
			) {
			if(c=='u')temp.setY(temp.getY()+5);
			if(c=='d')temp.setY(temp.getY()-5);
			if(c=='l')temp.setX(temp.getX()+5);
			if(c=='r')temp.setX(temp.getX()-5);
		}

		//bottom 
		
		 if(bounding_box_collision
			(t.getTopX(),t.getTopY(),t.getWidth(),
			t.getHeight(),0, 715, 1200, 20)
			) {
			if(c=='u')temp.setY(temp.getY()+5);
			if(c=='d')temp.setY(temp.getY()-5);
			if(c=='l')temp.setX(temp.getX()+5);
			if(c=='r')temp.setX(temp.getX()-5);
		}
		
		 //bunker1
		 
		 if(bounding_box_collision
			(t.getTopX(),t.getTopY(),t.getWidth(),
			t.getHeight(),130, 290, 15, 120)
			) {
			if(c=='u')temp.setY(temp.getY()+5);
			if(c=='d')temp.setY(temp.getY()-5);
			if(c=='l')temp.setX(temp.getX()+5);
			if(c=='r')temp.setX(temp.getX()-5);
		 }
		 
		 if(bounding_box_collision
			(t.getTopX(),t.getTopY(),t.getWidth(),
			t.getHeight(),130, 290, 15, 120)
			) {
			if(c=='u')temp.setY(temp.getY()+5);
			if(c=='d')temp.setY(temp.getY()-5);
			if(c=='l')temp.setX(temp.getX()+5);
			if(c=='r')temp.setX(temp.getX()-5);
		 }
		 
		 if(bounding_box_collision
			(t.getTopX(),t.getTopY(),t.getWidth(),
			t.getHeight(),90, 390, 40, 20)
			) {
			if(c=='u')temp.setY(temp.getY()+5);
			if(c=='d')temp.setY(temp.getY()-5);
			if(c=='l')temp.setX(temp.getX()+5);
			if(c=='r')temp.setX(temp.getX()-5);
		 }
		 
		 //end bunker1
		 
		 //bunker 2
		 
		 if(bounding_box_collision
			(t.getTopX(),t.getTopY(),t.getWidth(),
			t.getHeight(),1050, 290, 15, 120)
			) {
			if(c=='u')temp.setY(temp.getY()+5);
			if(c=='d')temp.setY(temp.getY()-5);
			if(c=='l')temp.setX(temp.getX()+5);
			if(c=='r')temp.setX(temp.getX()-5);
		 }
		 
		 if(bounding_box_collision
			(t.getTopX(),t.getTopY(),t.getWidth(),
			t.getHeight(),1060, 290, 40, 20)
			) {
			if(c=='u')temp.setY(temp.getY()+5);
			if(c=='d')temp.setY(temp.getY()-5);
			if(c=='l')temp.setX(temp.getX()+5);
			if(c=='r')temp.setX(temp.getX()-5);
		 }
		 
		 if(bounding_box_collision
			(t.getTopX(),t.getTopY(),t.getWidth(),
			t.getHeight(),1060, 390, 40, 20)
			) {
			if(c=='u')temp.setY(temp.getY()+5);
			if(c=='d')temp.setY(temp.getY()-5);
			if(c=='l')temp.setX(temp.getX()+5);
			if(c=='r')temp.setX(temp.getX()-5);
		 }
		 
		 //end bunker 2
		 
		 //center blocks
		 if(bounding_box_collision
			(t.getTopX(),t.getTopY(),t.getWidth(),
			t.getHeight(),600, 425, 20, 100)
			) {
			if(c=='u')temp.setY(temp.getY()+5);
			if(c=='d')temp.setY(temp.getY()-5);
			if(c=='l')temp.setX(temp.getX()+5);
			if(c=='r')temp.setX(temp.getX()-5);
			
		 }
		 
		if(bounding_box_collision
			(t.getTopX(),t.getTopY(),t.getWidth(),
			t.getHeight(),600, 225, 20, 100)
			) {
			if(c=='u')temp.setY(temp.getY()+5);
			if(c=='d')temp.setY(temp.getY()-5);
			if(c=='l')temp.setX(temp.getX()+5);
			if(c=='r')temp.setX(temp.getX()-5);
			
		}
		if(bounding_box_collision
			(t.getTopX(),t.getTopY(),t.getWidth(),
			t.getHeight(),430, 365, 100, 20)
			) {
			if(c=='u')temp.setY(temp.getY()+5);
			if(c=='d')temp.setY(temp.getY()-5);
			if(c=='l')temp.setX(temp.getX()+5);
			if(c=='r')temp.setX(temp.getX()-5);
		}		
			
		if(bounding_box_collision
			(t.getTopX(),t.getTopY(),t.getWidth(),
			t.getHeight(),680, 365, 100, 20)
			) {
			if(c=='u')temp.setY(temp.getY()+5);
			if(c=='d')temp.setY(temp.getY()-5);
			if(c=='l')temp.setX(temp.getX()+5);
			if(c=='r')temp.setX(temp.getX()-5);
			
		}
		 //end center blocks
		
		//top block
		if(bounding_box_collision
				(t.getTopX(),t.getTopY(),t.getWidth(),
				t.getHeight(),575, 40, 80, 100)
				) {
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l')temp.setX(temp.getX()+5);
				if(c=='r')temp.setX(temp.getX()-5);
				
			}
		
		//bottom block
		if(bounding_box_collision
				(t.getTopX(),t.getTopY(),t.getWidth(),
				t.getHeight(),575, 615, 80, 100)
				) {
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l')temp.setX(temp.getX()+5);
				if(c=='r')temp.setX(temp.getX()-5);
				
			}
		
		//top line left
		if(bounding_box_collision
				(t.getTopX(),t.getTopY(),t.getWidth(),
				t.getHeight(),150, 130, 330, 40)
				) {
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l')temp.setX(temp.getX()+5);
				if(c=='r')temp.setX(temp.getX()-5);
				
			}
		
		//top line right
		if(bounding_box_collision
				(t.getTopX(),t.getTopY(),t.getWidth(),
				t.getHeight(),750, 130, 330, 40)
				) {
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l')temp.setX(temp.getX()+5);
				if(c=='r')temp.setX(temp.getX()-5);
				
			}
		
		//bottom line left
		if(bounding_box_collision
				(t.getTopX(),t.getTopY(),t.getWidth(),
				t.getHeight(),150, 560, 330, 40))
				 {
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l')temp.setX(temp.getX()+5);
				if(c=='r')temp.setX(temp.getX()-5);
				
			}
		
		//bottom line right
		if(bounding_box_collision
				(t.getTopX(),t.getTopY(),t.getWidth(),
				t.getHeight(),750, 560, 330, 40))
				 {
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l')temp.setX(temp.getX()+5);
				if(c=='r')temp.setX(temp.getX()-5);
				
			}
		
		//center right
		if(bounding_box_collision
				(t.getTopX(),t.getTopY(),t.getWidth(),
				t.getHeight(),300, 230, 50, 260)
				) {
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l')temp.setX(temp.getX()+5);
				if(c=='r')temp.setX(temp.getX()-5);
				
			}
		
		//center left
		if(bounding_box_collision
				(t.getTopX(),t.getTopY(),t.getWidth(),
				t.getHeight(),855, 230, 50, 260)
				) {
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l')temp.setX(temp.getX()+5);
				if(c=='r')temp.setX(temp.getX()-5);
				
			}
		
	}
		
		boolean bounding_box_collision(int b1_x, int b1_y, int b1_w, int b1_h, int b2_x, int b2_y, int b2_w, int b2_h)
		{
		    if ((b1_x > b2_x + b2_w - 1) || // is b1 on the right side of b2?
		        (b1_y > b2_y + b2_h - 1) || // is b1 under b2?
		        (b2_x > b1_x + b1_w - 1) || // is b2 on the right side of b1?
		        (b2_y > b1_y + b1_h - 1))   // is b2 under b1?
		    {
		        // no collision
		        return false;
		    }
		 
		    // collision
		    return true;
		}	

			
	public CombatPanel(){
		
		t=new Tank(1130,350);
		t2=new Tank(50,350);
		l=new Level(1);
	}

	public void paintComponent(Graphics g){
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 1200, 800);
		g.setColor(Color.BLACK);
		g.setColor(Color.BLACK);
		l.draw(g);
		t.draw(g);
		t2.draw(g);
	}
}
 