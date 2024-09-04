package exemplo2.entities;

import exemplo2.interfaces.Observable;
import exemplo2.interfaces.Observer;

public class Organizer implements Observer {
	  @Override
	  public void update(Observable observable, Object arg) {
	    if (observable instanceof Course) {
	      System.out.println("Organizer notified about course update.");
	    }
	  }
	}

