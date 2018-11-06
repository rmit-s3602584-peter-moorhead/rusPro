package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import model.Vocab;

public class RusGUI extends JFrame{
	

	//Color b = new Color(204, 224, 255);
	Color g = new Color(44, 47, 51);
	Color bl = new Color(35, 39, 42);
	
	
	private JFrame frame = new JFrame("Russian Language Program");
	
	private JLabel title = new JLabel("Русский/Russian");
	private JPanel east = new JPanel();
	//private JPanel west = new JPanel();
	private JPanel center = new JPanel();
	private JTextArea page = new JTextArea();
	private JButton listPage = new JButton("List Saved Phrases"),
					quizPage = new JButton("Take a Quiz"),
					addPage = new JButton("Add a Phrase to the Program");

	JButton learn = new JButton("Learn");
	JButton list = new JButton("List");
	JButton quiz = new JButton("Quiz");
	JButton add = new JButton("Add vocab");
	JButton exit = new JButton("Quit");
	
	//test 1
	private JPanel middlePanels;
	private JPanel learnPanel = new JPanel();
	private JPanel listPanel = new JPanel();
	private JPanel quizPanel = new JPanel();
	private JPanel addPanel = new JPanel();
	
	
	//GridLayout westGrid = new GridLayout(5, 1, 20, 20);
   
	CardLayout centerCard = new CardLayout();
	
	private CenterPanel centerP;
	private WestPanel westP;
	private JTable table;
	
	public RusGUI(List<Vocab> v) {
		
		middlePanels = new JPanel(centerCard);
		middlePanels.add(learnPanel);
		middlePanels.add(listPanel);
		middlePanels.add(quizPanel);
		middlePanels.add(addPanel);

		
		//frame.add(middlePanels);
		
		/*String[][] vocabW = {{v.get(0).getId()}, {v.get(0).getEng()}, {v.get(0).getRus()}};
		String[] columnName = {"ID", "English", "Russian"};
		table = new JTable(vocabW, columnName);
		table.setBounds(30, 40, 200, 300);*/
		
		quizPanel.add(list);
		
		//centerP = new CenterPanel(v, centerCard, center);
		
		westP = new WestPanel(v, frame);
		
		//FIX
		
		//frame.add(center, BorderLayout.CENTER);
		frame.add(westP, BorderLayout.CENTER);
		
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
		

		 
		frame.setBackground(bl);
		
		
		center.setBackground(g);
		east.setBackground(bl);
		

		//frame.add(centre, BorderLayout.CENTER);
		//centre.setPreferredSize(new Dimension(150, 600));
		
		frame.add(east, BorderLayout.EAST);
		east.setPreferredSize(new Dimension(150, 600));
		
		
		
		frame.add(title, BorderLayout.NORTH);
		//frame.add(listPage);
		for(Vocab vocab: v) {
			page.setText(vocab.getId());
		}
		
	}
	
	public void change(List<Vocab> v) {
		for(Vocab vocab: v) {
			page.setText(vocab.getRus());
		}
	}
	
	public void run() {
		frame.setSize(1000, 600);
		frame.setMinimumSize(new Dimension(470,300));
		frame.setVisible(true);
	}
	
}
