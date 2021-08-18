package tictactoe;

import java.awt.EventQueue;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.FlowLayout;

public class TicTacToe implements MouseListener, ActionListener{

	private JFrame frame;
	Random random = new Random();
	JLabel textfield ;
	JButton[] buttons = new JButton[9];
	boolean player1_turn;
	int find=0;
	JLabel lblNewLabel;
	JLabel lblNewLabel_1;
	JLabel winLabel;
	int tieCount=0;
	JButton reset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(21,215,152));
		frame.setSize( 550, 700);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel title_panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) title_panel.getLayout();
		flowLayout.setVgap(10);
		frame.getContentPane().add(title_panel);
		
		textfield = new JLabel();
		textfield.setText("Wecome to Tic-Tac-Toe");
		title_panel.add(textfield);		
		textfield.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		textfield.setHorizontalAlignment(SwingConstants.CENTER);
		textfield.setForeground(new Color(245, 245, 245));		
			
		title_panel.setBackground(new Color(21,215,152));		
		title_panel.setBounds(0, 0, 535, 70);
		title_panel.setVisible(true);
		
		
		JPanel button_panel = new JPanel();
		button_panel.setBackground(Color.white);
		frame.getContentPane().add(button_panel);
		button_panel.setLayout(new GridLayout(3, 3, 3, 3));
		button_panel.setBounds(0, 128, 534, 534);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 70, 245, 59);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblNewLabel_1.setBounds(279, 70, 245, 59);
		frame.getContentPane().add(lblNewLabel_1);
		
		winLabel = new JLabel("");
		winLabel.setFont(new Font("MV Boli", Font.BOLD, 30));
		winLabel.setForeground(new Color(153, 102, 255));
		winLabel.setHorizontalAlignment(SwingConstants.CENTER);
		winLabel.setBounds(130, 66, 264, 63);
		winLabel.setFocusable(false);
		frame.getContentPane().add(winLabel);
		
		reset = new JButton("Exit");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
									
						if(e.getSource()==reset) {
							System.exit(0);
							
						}
						
			}
		});
		reset.setForeground(new Color(153, 0, 153));
		reset.setFont(new Font("MV Boli", Font.BOLD, 30));
		reset.setBackground(new Color(21,215,152));
		reset.setFocusable(false);
		reset.setBounds(210, 81, 120, 32);
		reset.setBorderPainted(false);
		reset.setVisible(false);
		frame.getContentPane().add(reset);
		
		
		for(int i=0;i<9;i++) {
			buttons[i]=new JButton();
			button_panel.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
			buttons[i].setFocusable(false);
			buttons[i].setBorderPainted(false);
			buttons[i].setBackground(new Color(21,215,152));
			buttons[i].setVisible(true);
			buttons[i].addActionListener(this);
			buttons[i].addMouseListener(this);		

	
		}
		firstTurn();
	}
	public void firstTurn() {
		  
		  if(random.nextInt(2)==0) {
		   player1_turn=true;
		   lblNewLabel.setText("Player 1 turn");
		  }
		  else {
		   player1_turn=false;
		   lblNewLabel_1.setText("Player 2 turn");
		  }
		 }
		 @Override
		 public void actionPerformed(ActionEvent e) {
			 for(int i=0;i<9;i++) {
				 if(e.getSource()==buttons[i]) {
					 
					if(player1_turn) {
						 if(buttons[i].getText()=="") {
					         buttons[i].setForeground(new Color(255,97,95));
						      buttons[i].setText("X");
						      player1_turn=false;
						      lblNewLabel.setText(null);
						      lblNewLabel_1.setText("Player 2 turn");
						      tieCount++;
						      check();
						 }
						 
					 }
					    else {
					        if(buttons[i].getText()=="") {
					         buttons[i].setForeground(new Color(0,0,255));
					         buttons[i].setText("O");
					         player1_turn=true;
						     lblNewLabel_1.setText(null);
					         lblNewLabel.setText("Player 1 turn");					
					         tieCount++;
					         check();
					        }					       
					 
				 }
			 }
				 
			 }
			
	}
		 private void check() {
			 
			 if(
					    (buttons[0].getText()=="X") &&
					    (buttons[1].getText()=="X") &&
					    (buttons[2].getText()=="X")
					    ) {
					   player1Wins(0,1,2);
					  }
					  if(
					    (buttons[3].getText()=="X") &&
					    (buttons[4].getText()=="X") &&
					    (buttons[5].getText()=="X")
					    ) {
					   player1Wins(3,4,5);
					  }
					  if(
					    (buttons[6].getText()=="X") &&
					    (buttons[7].getText()=="X") &&
					    (buttons[8].getText()=="X")
					    ) {
					   player1Wins(6,7,8);
					  }
					  if(
					    (buttons[0].getText()=="X") &&
					    (buttons[3].getText()=="X") &&
					    (buttons[6].getText()=="X")
					    ) {
					   player1Wins(0,3,6);
					  }
					  if(
					    (buttons[1].getText()=="X") &&
					    (buttons[4].getText()=="X") &&
					    (buttons[7].getText()=="X")
					    ) {
					   player1Wins(1,4,7);
					  }
					  if(
					    (buttons[2].getText()=="X") &&
					    (buttons[5].getText()=="X") &&
					    (buttons[8].getText()=="X")
					    ) {
					   player1Wins(2,5,8);
					  }
					  if(
					    (buttons[0].getText()=="X") &&
					    (buttons[4].getText()=="X") &&
					    (buttons[8].getText()=="X")
					    ) {
					   player1Wins(0,4,8);
					  }
					  if(
					    (buttons[2].getText()=="X") &&
					    (buttons[4].getText()=="X") &&
					    (buttons[6].getText()=="X")
					    ) {
					   player1Wins(2,4,6);
					  }
					  
					  
					  if(
					    (buttons[0].getText()=="O") &&
					    (buttons[1].getText()=="O") &&
					    (buttons[2].getText()=="O")
					    ) {
					   player2Wins(0,1,2);
					  }
					  if(
					    (buttons[3].getText()=="O") &&
					    (buttons[4].getText()=="O") &&
					    (buttons[5].getText()=="O")
					    ) {
					   player2Wins(3,4,5);
					  }
					  if(
					    (buttons[6].getText()=="O") &&
					    (buttons[7].getText()=="O") &&
					    (buttons[8].getText()=="O")
					    ) {
					   player2Wins(6,7,8);
					  }
					  if(
					    (buttons[0].getText()=="O") &&
					    (buttons[3].getText()=="O") &&
					    (buttons[6].getText()=="O")
					    ) {
					   player2Wins(0,3,6);
					  }
					  if(
					    (buttons[1].getText()=="O") &&
					    (buttons[4].getText()=="O") &&
					    (buttons[7].getText()=="O")
					    ) {
					   player2Wins(1,4,7);
					  }
					  if(
					    (buttons[2].getText()=="O") &&
					    (buttons[5].getText()=="O") &&
					    (buttons[8].getText()=="O")
					    ) {
					   player2Wins(2,5,8);
					  }
					  if(
					    (buttons[0].getText()=="O") &&
					    (buttons[4].getText()=="O") &&
					    (buttons[8].getText()=="O")
					    ) {
					   player2Wins(0,4,8);
					  }
					  if(
					    (buttons[2].getText()=="O") &&
					    (buttons[4].getText()=="O") &&
					    (buttons[6].getText()=="O")
					    ) {
					   player2Wins(2,4,6);
					  }
					  
					  for(int i=0;i<9;i++) {
						  if(tieCount==9) {
								 tie();
							 }
					  }				  
			 
		}

		private void tie() {
			for(int l=0;l<9;l++) {
				if(buttons[l].getText()!=null) {
					winLabel.setText("Tie :(");
					winLabel.setFont(new Font("MV Boli", Font.BOLD, 40));
					winLabel.setForeground(Color.red);
					reSet();
				}
			}	
			
			
		}

		private void player1Wins(int i, int j, int k) {
			tieCount=0;
			winLabel.setText("Player 1 Wins :)");
			lblNewLabel.setText(null);
			lblNewLabel_1.setText(null);
			buttons[i].setBackground(new Color(0, 250, 154));
			buttons[j].setBackground(new Color(0, 250, 154));
			buttons[k].setBackground(new Color(0, 250, 154));
			reSet();
			
		}

		


		private void player2Wins(int i, int j, int k) {
			tieCount=0;
			winLabel.setText("Player 2 Wins :)");
			lblNewLabel.setText(null);
			lblNewLabel_1.setText(null);
			buttons[i].setBackground(new Color(0, 250, 154));
			buttons[j].setBackground(new Color(0, 250, 154));
			buttons[k].setBackground(new Color(0, 250, 154));
			reSet();	
		}

		private void reSet() {			
					
				Timer timer =new Timer();
				timer.schedule(new TimerTask() {
					
					public void run() {										
							winLabel.setText(null);							
							reset.setVisible(true);													
					}
					
				}, 3000);
				
			
		}		

		public void mouseEntered(MouseEvent e) {
			 for(int i=0;i<9;i++) {
				 try {
					Thread.sleep(10);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
					if(e.getSource()==buttons[i])
					{
				 buttons[i].setBackground(new Color(0, 250, 154));
				}
				}
				
			}

		@Override
		public void mouseClicked(MouseEvent e) {			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			for(int i=0;i<9;i++) {
				if(e.getSource()==buttons[i])
				{
			 buttons[i].setBackground(new Color(21,215,152));
			}
			}			
			
		}
		@Override
		public void mousePressed(MouseEvent e) {			
		}

		@Override
		public void mouseReleased(MouseEvent e) {			
		}
}
