
public class Vehiole {
int x,y,vx,vy;
public Vehiole(int x,int y,int vx,int vy) {
	this.x=x;
	this.y=y;
	this.vx=vx;
	this.vy=vy;
}
		
			
		
	public void move() {
	x+=vx;
	y+=vy;
}
}
