package exemplo2.application;

import exemplo2.entities.Course;
import exemplo2.entities.Instructor;
import exemplo2.entities.Organizer;
import exemplo2.entities.Student;

public class Main {
	  public static void main(String[] args) {
		  
	    Course course = new Course();
	    Student student = new Student();
	    Instructor instructor = new Instructor();
	    Organizer organizer = new Organizer();

	    course.addObserver(student);
	    course.addObserver(instructor);
	    course.addObserver(organizer);

	    course.notifyObservers();
	  }
	}
