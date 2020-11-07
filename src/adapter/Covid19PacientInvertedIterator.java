package adapter;

import java.util.ArrayList;
import java.util.List;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientInvertedIterator implements InvertedIterator {
	private ArrayList<Symptom> symptoms;
	private int position;
	
	public Covid19PacientInvertedIterator(Covid19Pacient p) {
		this.symptoms=new ArrayList<Symptom>(p.getSymptoms());
		this.position = symptoms.size()-1;
	}

	@Override
	public Object previous() {
		Symptom symptom=symptoms.get(position);
		position--;
		return symptom;
	}

	@Override
	public boolean hasPrevious() {
		return position>=0;
	}

	@Override
	public void goLast() {
		this.position = symptoms.size()-1;
	}

}
