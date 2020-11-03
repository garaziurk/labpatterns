package observer;

import java.awt.Color;
import java.awt.Frame;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import domain.Covid19Pacient;


public class SemaphorGUI extends JFrame implements Observer{
	/** stores the associated ConcreteSubject */
	public SemaphorGUI (Observable obs) {
		setSize(100, 100);
		setLocation(350,10);
		Color c=Color.green;
		getContentPane().setBackground(c);
		repaint();
		setVisible(true);
		obs.addObserver(this);
	}
	
	public void update(Observable	o,	Object	arg)	{
		Covid19Pacient	p=(Covid19Pacient)o;
		int impact = (int)p.covidImpact();	
		if(impact<5) {
			getContentPane().setBackground(Color.green);
		}
		else if(impact>=5 && impact<10) {
			getContentPane().setBackground(Color.yellow);
		}
		else {
			getContentPane().setBackground(Color.red);
		}
	}
}     

