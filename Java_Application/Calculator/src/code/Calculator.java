package code;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField text;
	double  first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(21, 215, 152));
		frame.setResizable(false);
		frame.setBounds(100, 100, 224, 391);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		text = new JTextField();
		text.setHorizontalAlignment(SwingConstants.TRAILING);
		text.setForeground(new Color(0, 0, 0));
		text.setFont(new Font("Times New Roman", Font.BOLD, 23));
		text.setBackground(Color.WHITE);
		text.setBounds(10, 11, 190, 77);
		frame.getContentPane().add(text);
		text.setColumns(10);
		
		JLabel p1 = new JLabel();
		p1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String number= text.getText()+p1.getText();
				text.setText(null);
			}
		});
		p1.setIcon(new ImageIcon("buttons\\button_c.png"));
		p1.setBounds(10, 99, 40, 40);
		frame.getContentPane().add(p1);
		
		JLabel p2 = new JLabel();
		p2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String back =null;
				if(text.getText().length()>0) {
					StringBuilder str =new StringBuilder(text.getText());
					str.deleteCharAt(text.getText().length()-1);
					back =str.toString();
					text.setText(back);
				}
			}
		});
		p2.setIcon(new ImageIcon("buttons\\button_b.png"));
		p2.setBounds(60, 99, 40, 40);
		frame.getContentPane().add(p2);
		
		JLabel p3 = new JLabel();
		p3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				first = Double.parseDouble(text.getText());
				text.setText("");
				operation="%";
			}
		});
		p3.setIcon(new ImageIcon("buttons\\button (15).png"));
		p3.setBounds(110, 99, 40, 40);
		frame.getContentPane().add(p3);
		
		JLabel p4 = new JLabel();
		p4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				first = Double.parseDouble(text.getText());
				text.setText("");
				operation="/";
			}
		});
		p4.setIcon(new ImageIcon("buttons\\button (12).png"));
		p4.setBounds(160, 99, 40, 40);
		frame.getContentPane().add(p4);
		
		JLabel p5 = new JLabel("7");
		p5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String number= text.getText()+p5.getText();
				text.setText(number);
			}
		});
		p5.setIcon(new ImageIcon("buttons\\button (5).png"));
		p5.setBounds(10, 150, 43, 40);
		frame.getContentPane().add(p5);
		
		JLabel p6 = new JLabel("8");
		p6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String number= text.getText()+p6.getText();
				text.setText(number);
			}
		});
		p6.setIcon(new ImageIcon("buttons\\button (6).png"));
		p6.setBackground(new Color(153, 153, 153));
		p6.setBounds(60, 150, 43, 40);
		frame.getContentPane().add(p6);
		
		JLabel p7 = new JLabel("9");
		p7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String number= text.getText()+p7.getText();
				text.setText(number);
			}
		});
		p7.setIcon(new ImageIcon("buttons\\button (7).png"));
		p7.setBounds(110, 150, 43, 40);
		frame.getContentPane().add(p7);
		
		JLabel p8 = new JLabel();
		p8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				first = Double.parseDouble(text.getText());
				text.setText("");
				operation="*";
			}
		});
		p8.setIcon(new ImageIcon("buttons\\button (11).png"));
		p8.setBounds(160, 150, 40, 40);
		frame.getContentPane().add(p8);
		
		JLabel p9 = new JLabel("4");
		p9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String number= text.getText()+p9.getText();
				text.setText(number);
			}
		});
		p9.setIcon(new ImageIcon("buttons\\button (2).png"));
		p9.setBounds(10, 201, 43, 40);
		frame.getContentPane().add(p9);
		
		JLabel p10 = new JLabel("5");
		p10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String number= text.getText()+p10.getText();
				text.setText(number);
			}
		});
		p10.setIcon(new ImageIcon("buttons\\button (3).png"));
		p10.setBounds(60, 201, 43, 40);
		frame.getContentPane().add(p10);
		
		JLabel p11 = new JLabel("6");
		p11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String number= text.getText()+p11.getText();
				text.setText(number);
			}
		});
		p11.setIcon(new ImageIcon("buttons\\button (4).png"));
		p11.setBounds(110, 201, 43, 40);
		frame.getContentPane().add(p11);
		
		JLabel p12 = new JLabel();
		p12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				first = Double.parseDouble(text.getText());
				text.setText("");
				operation="-";
			}
		});
		p12.setIcon(new ImageIcon("buttons\\button (10).png"));
		p12.setBounds(160, 201, 40, 40);
		frame.getContentPane().add(p12);
		
		JLabel p13 = new JLabel("1");
		p13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String number= text.getText()+p13.getText();
				text.setText(number);

			}
		});
		p13.setIcon(new ImageIcon("buttons\\button.png"));
		p13.setBounds(10, 252, 40, 40);
		frame.getContentPane().add(p13);
		
		JLabel p14 = new JLabel("2");
		p14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String number= text.getText()+p14.getText();
				text.setText(number);
			}
		});
		p14.setIcon(new ImageIcon("buttons\\button (16).png"));
		p14.setBounds(60, 252, 43, 40);
		frame.getContentPane().add(p14);
		
		JLabel p15 = new JLabel("3");
		p15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String number= text.getText()+p15.getText();
				text.setText(number);
			}
		});
		p15.setIcon(new ImageIcon("buttons\\button (1).png"));
		p15.setBounds(110, 252, 43, 40);
		frame.getContentPane().add(p15);
		
		JLabel p16 = new JLabel();
		p16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				first = Double.parseDouble(text.getText());
				text.setText("");
				operation="+";
			}
		});
		p16.setIcon(new ImageIcon("buttons\\button (9).png"));
		p16.setBounds(160, 252, 40, 40);
		frame.getContentPane().add(p16);
		
		JLabel p17 = new JLabel("0");
		p17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String number= text.getText()+p17.getText();
				text.setText(number);
			}
		});
		p17.setIcon(new ImageIcon("buttons\\button (8).png"));
		p17.setBounds(10, 303, 43, 40);
		frame.getContentPane().add(p17);
		
		JLabel p18 = new JLabel("00");
		p18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String number= text.getText()+p18.getText();
				text.setText(number);
			}
		});
		p18.setIcon(new ImageIcon("buttons\\button (17).png"));
		p18.setBounds(60, 303, 40, 40);
		frame.getContentPane().add(p18);
		
		JLabel p19 = new JLabel(".");
		p19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String number= text.getText()+p19.getText();
				text.setText(number);
			}
		});
		p19.setIcon(new ImageIcon("buttons\\button (14).png"));
		p19.setBounds(110, 303, 40, 40);
		frame.getContentPane().add(p19);
		
		JLabel p20 = new JLabel();
		p20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String answer;
				second =Double.parseDouble(text.getText());
				if(operation=="+") {
					result=first+second;
					answer =String.format("%.2f",result);
					text.setText(answer);
				}else if(operation=="-") {
					result=first-second;
					answer =String.format("%.2f",result);
					text.setText(answer);
				}else if(operation=="*") {
					result=first*second;
					answer =String.format("%.2f",result);
					text.setText(answer);
				}else if(operation=="/") {
					try {
						result=first/second;
						answer =String.format("%.2f",result);
						text.setText(answer);
					}catch(ArithmeticException e1){
						text.setText("Invalid");
					}
				}else if(operation=="%") {
					result=first%second;
					answer =String.format("%.2f",result);
					text.setText(answer);
				}
				
			}
		});
		p20.setIcon(new ImageIcon("buttons\\button (13).png"));
		p20.setBounds(160, 303, 40, 40);
		frame.getContentPane().add(p20);
		
		
	}
}
