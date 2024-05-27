
public class DisplayRectsSlow extends MyFrame{
	public void run() {
		setColor(0,128,0);
		int x=30;
	    while(x<=170) {
	    	//(1)
	    	clear();
	    	//(2)
	    	setColor(0,128,0);
	    	fillOval(x,40,40,40);
					x+=5;
					sleep(0.1);
				}
	}

}
