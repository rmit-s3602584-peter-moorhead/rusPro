package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;

import controller.ListController;
import model.Vocab;

public class WestPanel extends JPanel{

	Color g = new Color(44, 47, 51);
	Color bl = new Color(35, 39, 42);
	
	private JButton learn, list, add, quiz, exit;
	
	private CardLayout card;
	private JPanel center;
	private List<Vocab> vocab = new ArrayList<Vocab>();
	
	//private List<Vocab> vocab = new ArrayList<Vocab>();
	
	public WestPanel(List<Vocab> vocab, CardLayout card, JPanel center) {
		
		this.card = card;
		this.center = center;
		this.vocab = vocab;

		learn = new JButton("learn");
		
		GridLayout layout = new GridLayout(5, 1);
		setLayout(layout);
		add(learn);
		setBackground(bl);

		setPreferredSize(new Dimension(150, 600));
		
		learn.addActionListener(new ListController(vocab, card, center));
		
	}
	
}
