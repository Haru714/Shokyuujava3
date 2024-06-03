
public class Face {
	int x,y,vx,vy;
	public Face(int x,int y,int vx,int vy) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
public void draw(MyFrame frame){
	
	frame.fillOval(x+120,y+40,30,30);
	frame.fillOval(x+60,y+40,30,30);
	frame.fillRect(x+56,y+25,100,25);
	frame.fillRect(x+70 ,y,70,30);
}
public void move() {
	x+=vx;
	y+=vy;
}
}