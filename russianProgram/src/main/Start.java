package main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import model.Model;
import model.Vocab;
import view.RusGUI;

public class Start {
	

	public static void main(String args[] ) {
		
		
		final List<Vocab> v = new ArrayList<Vocab>();
		
		Vocab v1 = new Vocab("1", "Eng1", "ыфва");
		Vocab v2 = new Vocab("2", "Eng2", "пку");
		Vocab v3 = new Vocab("3", "Eng3", "ено");
		Vocab v4 = new Vocab("4", "Eng4", "зщуф");
		Vocab v5 = new Vocab("5", "Eng5", "пукпфп");

		v.add(v1);
		v.add(v2);
		v.add(v3);
		v.add(v4);
		v.add(v5);
		
		
		
		//System.out.println("-----------------");
		//System.out.println(v);
		//System.out.println("-----------------");
		
		RusGUI g = new RusGUI(v);
		
		//System.out.println("-----------------");
		//System.out.println(v);
		//System.out.println("-----------------");
		
		g.run();
		
		Model m = new Model();
		m.start();
		m.saveVocabList(v);
		m.loadVocabList(v);
		
		//System.out.println("-----------------");
		//System.out.println(v);
		//System.out.println("-----------------");
		
		//System.out.println("-----------------");
		//System.out.println(v.get(0).getRus());
		//System.out.println("-----------------");
		
		g.change(v);
		
		//m.printLists(v);
		
		
	}
}