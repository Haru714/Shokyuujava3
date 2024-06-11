import java.util.Vector;

public class Vector {
	public void run() {
	vector<Vehiole>vehicles=new Vector<Vehiole>();
	vehicles.add(new Car(10,30,3,0));
	vehicles.add(new Car(10,100,5,0));
	vehicles.add(new Car(10,150,7,0));
	
	for (int i=0;i<30;i++) {
		clear();
		for(int j=0; j<Vehiole.length; j++) {
			[j].draw(this);
			Vehiole[j].move();
	}
			sleep(0.1);
}
}
}
