
public class DisplayCarsTrains extends MyFrame{
public void run() {
	Vehiole[]vehioles=new Vehiole[3];
	vehioles[0]=new Car(10,30,3,0);
	vehioles[1]=new Car(10,100,5,0);
	vehioles[2]=new Train(10,150,7,0);
	for (int i=0;i<30;i++) {
		clear();
		for(int j=0; j<vehioles.length; j++) {
			vehioles[j].draw(this);
			vehioles[j].move();
	}
			sleep(0.1);
}
}
}
