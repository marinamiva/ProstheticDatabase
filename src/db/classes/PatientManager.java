package db.classes;
import java.sql.Date;
import db.inteface.*;
import pojos.*;

public class PatientManager implements PatientManagerInterface {
	public void register(Patient patient) {
		
	}
	public void login(Patient patient) {
		
	}
	public void viewDate(Date date) {
		System.out.println("Hello! Your next appointment is: " + date);
	}
}
