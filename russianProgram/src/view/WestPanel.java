package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	
	private JButton home, learn, list, add, quiz, exit;
	
	CardLayout card = new CardLayout();
	
	
	BorderLayout sou = new BorderLayout();
	
	JPanel N = new JPanel();
	JPanel E = new JPanel();
	JPanel W = new JPanel(new GridLayout(6, 1, 10, 10));
	JPanel C = new JPanel();
	JPanel S = new JPanel();
	
	JPanel homeP = new JPanel();
	JPanel learnP;
	JPanel listP;
	JPanel addP = new JPanel();
	JPanel quizP = new JPanel();
	
	
	private List<Vocab> vocab1 = new ArrayList<Vocab>();
	
	//private List<Vocab> vocab = new ArrayList<Vocab>();
	
	public WestPanel(List<Vocab> vocab) {
		this.vocab1 = vocab;
		
		System.out.println(vocab1.get(0).getEng());
		System.out.println(vocab1.get(0).getEng());
		
		listP = new ListPanel(vocab1);
		learnP = new JPanel();
		
		C.setLayout(card);
		
		home = new JButton("Home");
		learn = new JButton("Learn");
		list = new JButton("List");
		add = new JButton("Add");
		quiz = new JButton("Quiz");
		exit = new JButton("Exit");
		
		C.add(homeP, "home");
		C.add(learnP, "learn");
		C.add(listP, "list");
		C.add(addP, "add");
		C.add(quizP, "quiz");
		
		homeP.setBackground(Color.BLUE);
		learnP.setBackground(Color.BLACK);
		//listP.setBackground(Color.WHITE);
		addP.setBackground(Color.GREEN);
		quizP.setBackground(Color.RED);

		
		setBackground(Color.YELLOW);
		
		setLayout(sou);
		N.setBackground(Color.WHITE);
		E.setBackground(Color.WHITE);
		
		W.add(home);
		W.add(learn);
		W.add(list);
		W.add(add);
		W.add(quiz);
		W.add(exit);
		
		W.setBackground(Color.GREEN);

		C.setBackground(Color.RED);
		S.setBackground(Color.BLUE);
		
		N.setMinimumSize(new Dimension(100, 200));
		
		add(N, BorderLayout.NORTH);
		add(E, BorderLayout.EAST);
		add(W, BorderLayout.WEST);
		add(C, BorderLayout.CENTER);
		add(S, BorderLayout.SOUTH);
		
		home.setBackground(g);
		home.setForeground(Color.WHITE);
		home.setFocusPainted(false);
		home.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		learn.setBackground(g);
		learn.setForeground(Color.WHITE);
		learn.setFocusPainted(false);
		learn.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		list.setBackground(g);
		list.setForeground(Color.WHITE);
		list.setFocusPainted(false);
		list.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		quiz.setBackground(g);
		quiz.setForeground(Color.WHITE);
		quiz.setFocusPainted(false);
		quiz.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		add.setBackground(g);
		add.setForeground(Color.WHITE);
		add.setFocusPainted(false);
		add.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		exit.setBackground(g);
		exit.setForeground(Color.WHITE);
		exit.setFocusPainted(false);
		exit.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		home.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				card.show(C, "home");
			}
		});
		
		learn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				card.show(C, "learn");
			}
		});
		
		list.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				card.show(C, "list");
			}
		});
		
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				card.show(C, "add");
			}
		});
		
		quiz.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				card.show(C, "quiz");
			}
		});
		
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		//list.addActionListener(new ListController(vocab, card, C));
		
		/*
		
		
		north.setBackground(Color.blue);
		container.add(north, BorderLayout.NORTH);
		
		
		center.setBackground(Color.green);
		container.add(center, BorderLayout.CENTER);
		
		//GridLayout layout = new GridLayout(5, 1);
		//west.setLayout(layout);
		west.add(learn);
		west.add(list);
		west.add(add);
		west.add(quiz);
		west.add(exit);
		
		west.setBackground(Color.red);
		container.add(west, BorderLayout.WEST);
		
		//container.setLayout(grid);
		container.setBackground(Color.CYAN);
		add(container, BorderLayout.CENTER);
		
		
		*/
	}
	
}
