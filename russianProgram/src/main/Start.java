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
		Vocab v6 = new Vocab("5", "Eng5", "пукпфп");
		Vocab v7 = new Vocab("5", "Eng5", "пукпфп");
		Vocab v8 = new Vocab("5", "Eng5", "пукпфп");
		Vocab v9 = new Vocab("5", "Eng5", "пукпфп");
		Vocab v10 = new Vocab("5", "Eng5", "пукпфп");
		Vocab v11 = new Vocab("5", "Eng5", "пукпфп");
		Vocab v12 = new Vocab("5", "Eng5", "пукпфп");
		Vocab v13 = new Vocab("5", "Eng5", "пукпфп");
		Vocab v14 = new Vocab("5", "Eng5", "пукпфп");
		Vocab v15 = new Vocab("5", "Eng5", "пукпфп");
		Vocab v16 = new Vocab("5", "Eng5", "пукпфп");
		Vocab v17 = new Vocab("5", "Eng5", "пукпфп");
		Vocab v18 = new Vocab("5", "Eng5", "пукпфп");
		Vocab v19 = new Vocab("5", "Eng5", "пукпфп");
		Vocab v20 = new Vocab("5", "Eng5", "пукпфп");
		Vocab v21 = new Vocab("5", "Eng5", "пукпфп");
		Vocab v22 = new Vocab("5", "Eng5", "пукпфп");
		Vocab v23 = new Vocab("5", "Eng5", "пукпфп");
		Vocab v24 = new Vocab("5", "Eng5", "пукпфп");
		Vocab v25 = new Vocab("5", "Eng5", "пукпфп");
		Vocab v26 = new Vocab("5", "Eng5", "пукпфп");

		v.add(v1);
		v.add(v2);
		v.add(v3);
		v.add(v4);
		v.add(v5);
		v.add(v6);
		v.add(v7);
		v.add(v8);
		v.add(v9);
		v.add(v10);
		v.add(v11);
		v.add(v12);
		v.add(v13);
		v.add(v14);
		v.add(v15);
		v.add(v16);
		v.add(v17);
		v.add(v18);
		v.add(v19);
		v.add(v20);
		v.add(v21);
		v.add(v22);
		v.add(v23);
		v.add(v24);
		v.add(v25);
		v.add(v26);
		
		
		
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