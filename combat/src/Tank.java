import java.awt.*;
import java.awt.Graphics;

public class Tank {
		
		private Bullet b1;
		private int x;
		private int y;
		private char dir;
		private boolean box;
        
		public Bullet getBullet(){return b1;}
		public void moveBullet (){
			b1.move();
		}
		
		public void fire() {
			if(b1.getIsFired())return;
			b1.fire(dir, x, y);
			b1.setX(x);b1.setY(y);
			b1.setIsFired(true); 
		}
		
		public int getX() {return x;}
		public void setX(int i){x=i;}
		public int getY() {return y;}
		public void setY(int i){y=i;}

		
		public void moveLeft(){
			x-=5;
		}
		public void moveRight(){
			x+=5;
		}		
		public void moveUp(){
			y-=5;
		}
		public void moveDown(){
			y+=5;
		}		
		public void move(char dir){
			
			System.out.println(x+","+y);
			
			this.dir=dir;
			 if(dir=='u'){
				 y-=5;
			 }else if(dir=='d'){
				 y+=5;			 
			 }else if(dir=='r'){
				 x+=5;
			 }else if(dir=='l'){
			 x-=5;
			 }
		}
		public Tank(int _x, int _y) {
			x=_x;
			y=_y;
			dir='u';
			b1=new Bullet();
			//TODO Auto-generated constructor stub
		}
		public void draw(Graphics g) {
			
			//box
			g.setColor(new Color(0,0,205));
				g.fillRect(x-10, y-10, 20, 20);
			
			//tread
			g.setColor(Color.GREEN);
			if(dir=='u' || dir=='d'){
				g.fillRect(x-10, y-15, 5, 30);
				g.fillRect(x+10, y-15, 5, 30);
			}else if(dir=='l' || dir=='r'){
				g.fillRect(x-15, y-10, 30, 5);
				g.fillRect(x-15, y+10, 30, 5);
		
			}
				
		 	g.setColor(new Color(122,134,121));
		 	if (dir=='u' || dir=='d')
		 	g.drawRect(x-10, y-15,25,30);
		 	else
		 	g.drawRect(x-15,y-15,30,25);
	
			//turret  
			g.setColor(new Color(178,34,34));
			if(dir=='u')
				g.fillRect(x, y-15, 6, 15);
			if(dir=='d')
				g.fillRect(x, y, 6, 15);
			if(dir=='r')
				g.fillRect(x, y, 15, 6);
			if(dir=='l')
				g.fillRect(x-15, y, 15, 6);
			
			b1.draw(g);
			
		}
		
			private int top_x, top_y, width, height;
		
		public int getTopX(){if(dir=='u' || dir=='d')return x-10; return x-15;}
		public int getTopY(){if(dir=='u' || dir=='d')return y-15; return y-10;}
		public int getWidth(){if(dir=='u'||dir=='d')return 25; return 30;}
		public int getHeight(){if(dir=='u'||dir=='d')return 30; return 25;}	
		
	}