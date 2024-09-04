package exemplo2.entities;

import exemplo2.interfaces.Observable;
import exemplo2.interfaces.Observer;

public class Student implements Observer {
	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof Course) {
			System.out.println("Student notified about course update.");
		}
	}
}
