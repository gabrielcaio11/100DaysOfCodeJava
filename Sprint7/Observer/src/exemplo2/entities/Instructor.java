package exemplo2.entities;

import exemplo2.interfaces.Observable;
import exemplo2.interfaces.Observer;

public class Instructor implements Observer {
	  @Override
	  public void update(Observable observable, Object arg) {
	    if (observable instanceof Course) {
	      System.out.println("Instructor notified about course update.");
	    }
	  }
	}
