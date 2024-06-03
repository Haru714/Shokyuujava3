import java.util.Vector;

public class rennnana extends MyFrame {
	public void run() {
	Vector<Face>faces=new Vector<Face>();
	
	faces.add(new Face(10,10,10,0));
	faces.add(new Face(10,70,11,0));
	faces.add(new Face(10,140,12,0));
	faces.add(new Face(10,210,13,0));
	faces.add(new Face(10,280,14,0));
	
for (int i=0; i<30; i++) {
		
	clear();
	for (int j=0; j<faces.size(); j++){
		faces.get(j).draw(this);
		faces.get(j).move();
	}
	sleep(0.1);
}
	
{
}
}
}