
public class DisplayRectsSlow extends MyFrame{
	public void run() {
	int  y=100;
	int x=100;
	
		while (x<=300){
	    	//(1)
	    	clear();
	    	//(2)
	    setColor(0,128,0);
	   	fillRect(x,y,10,100);
	   	x+=5;	
	   	y+=5;
	sleep(0.1);
		}
		while (x>=100){
	    	//(1)
	    	clear();
	    	//(2)
	    	setColor(0,128,0);
	    	fillRect(x,y,10,100);
	    	x-=5;		
					sleep(0.1);
	    }
	while(x<=300) {
		clear();
	setColor(0,128,0);
	fillRect(x,y,10,100);
	x+=5;
	y-=5;
	sleep(0.1);
	}
	
	
    
  }
 }
	
