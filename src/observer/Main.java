package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable pacient=new Covid19Pacient("aitor", 35);
		PacientObserverGUI pacientGUI= new PacientObserverGUI (pacient);
		PacientSymptomGUI frame = new PacientSymptomGUI (pacient);
		PacientThermometerGUI therm = new PacientThermometerGUI(pacient);
		SemaphorGUI s = new SemaphorGUI(pacient);

//		Observable pacient2=new Covid19Pacient("Garazi", 21);
//		PacientObserverGUI pacientGUI2= new PacientObserverGUI (pacient2);
//		PacientSymptomGUI frame2 = new PacientSymptomGUI (pacient2);
//		PacientThermometerGUI therm2 = new PacientThermometerGUI(pacient2);
//		SemaphorGUI s2 = new SemaphorGUI(pacient2);
//
//		
//		Observable pacient3=new Covid19Pacient("Eider", 40);
//		PacientObserverGUI pacientGUI3= new PacientObserverGUI (pacient3);
//		PacientSymptomGUI frame3 = new PacientSymptomGUI (pacient3);
//		PacientThermometerGUI therm3 = new PacientThermometerGUI(pacient3);
//		SemaphorGUI s3 = new SemaphorGUI(pacient3);
	}

}
