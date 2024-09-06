package exemplo2.interfaces;

public interface Observable {
	
	void addObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers();
}
