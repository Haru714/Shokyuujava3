
public class RectLoop extends MyFrame {
	public void rum() {
		setColor(0,128,0);
       int x=30;
		for(int i= 30; i <15; i++) {
			System.out.println(x);
			fillRect(x,80,10,100);
			x+=20;
		}
	}

}
