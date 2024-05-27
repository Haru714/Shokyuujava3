
public class DisplayRectsSlow extends MyFrame{
	public void run() {
	int  y=100;
	int x=30;
	while(true) {
	
	while(y>=30) {
		clear();
	setColor(0,128,0);
	fillRect(x,y,10,100);
	y-=5;
	sleep(0.1);
	}
	
	while (x<=170){
    	//(1)
    	clear();
    	//(2)
    	setColor(0,128,0);
    	fillRect(x,y,10,100);
    	x+=5;		
				sleep(0.1);
    }
  }
 }
	}