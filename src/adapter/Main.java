package adapter;

import java.util.Iterator;

import domain.*;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient p=new Covid19Pacient("Garazi", 21);
		p.addSymptom(new Symptom("fiebre", 10, 1), 1);
		p.addSymptom(new Symptom("astenia", 10, 4), 1);
		p.addSymptom(new Symptom("tos seca", 10, 5), 1);
		p.addSymptom(new Symptom("cefalea", 10, 2), 1);
		p.addSymptom(new Symptom("mialgia", 10, 3), 1);
		
		SymptomNameComparator comp = new SymptomNameComparator();
		Covid19PacientInvertedIterator it = new Covid19PacientInvertedIterator(p);
		Iterator i = Sorting.sortedIterator(it, comp);
		System.out.println("Sintomak izenaren arabera ordenatuta:");
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println();
		
		SeverityIndexComparator comp2 = new SeverityIndexComparator();
		Iterator i2 = Sorting.sortedIterator(it, comp2);
		System.out.println("Sintomak larritasun-indizearen arabera ordenatuta:");
		while(i2.hasNext())
			System.out.println(i2.next());
	}

}
