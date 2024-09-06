package exemplo2.entities;

import java.util.ArrayList;
import java.util.List;

import exemplo2.interfaces.Observable;
import exemplo2.interfaces.Observer;


public class Course implements Observable {
	  private List<Observer> observers = new ArrayList<>();

	  @Override
	  public void addObserver(Observer observer) {
	    observers.add(observer);
	  }

	  @Override
	  public void removeObserver(Observer observer) {
	    observers.remove(observer);
	  }

	  @Override
	  public void notifyObservers() {
	    for (Observer observer : observers) {
	      observer.update(this, null);
	    }
	  }
	}
