package adapter;

import java.util.Comparator;

import domain.Symptom;

public class SeverityIndexComparator implements Comparator<Object> {

	public int compare(Object o1, Object o2) {
		int s1 = ((Symptom) o1).getSeverityIndex();
		int s2 = ((Symptom) o2).getSeverityIndex();
		return s1-s2;
	}
	
}
