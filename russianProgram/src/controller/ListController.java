package controller;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTable;

import model.Vocab;

public class ListController implements ActionListener{

	
	private CardLayout card1 = new CardLayout();
	private JPanel center = new JPanel(card1);
	
	public ListController(List<Vocab> vocab, CardLayout card, JPanel center) {
		this.card1 = card;
		this.center = center;
		 
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		center.setBackground(Color.red);
		card1.next(center);
		
	}
	
}
