package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {
	
	private JFrame frame;
	private JTextField ResultField;

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
	
	double num,ans;
	int calculation;
	
	public void MatheOperation()
	{
		switch(calculation)
		{
		
		case 0:
			ResultField.setText(ResultField.getText());
		case 1: //Addition
			ans = num + Double.parseDouble(ResultField.getText());
			ResultField.setText(Double.toString(ans));
			break;
			
		case 2:  //Subtraction
			ans = num - Double.parseDouble(ResultField.getText());
			ResultField.setText(Double.toString(ans));
			break;
			
		case 3:  //Multiplication
			ans = num * Double.parseDouble(ResultField.getText());
			ResultField.setText(Double.toString(ans));
			break;
			
		case 4:  //Division
			ans = num / Double.parseDouble(ResultField.getText());
			ResultField.setText(Double.toString(ans));
			break;
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 469, 306);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ResultField = new JTextField();
		ResultField.setBounds(10, 0, 424, 20);
		frame.getContentPane().add(ResultField);
		ResultField.setColumns(10);
		
		JButton ZeroButton = new JButton("0");
		ZeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultField.setText(ResultField.getText() + "0");
			}
		});
		
		ZeroButton.setBounds(10, 31, 98, 29);
		frame.getContentPane().add(ZeroButton);
		
		JButton OneButton = new JButton("1");
		OneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultField.setText(ResultField.getText() + "1");
			}
		});
		OneButton.setBounds(120, 31, 98, 29);
		frame.getContentPane().add(OneButton);
		
		JButton AdditionButton = new JButton("+");
		AdditionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(ResultField.getText());
				calculation = 1;
				ResultField.setText("");
			}
		});
		AdditionButton.setBounds(228, 31, 98, 29);
		frame.getContentPane().add(AdditionButton);
		
		JButton DeleteNumberButton = new JButton("<--");
		DeleteNumberButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length= ResultField.getText().length();
				int number= ResultField.getText().length()-1;
				String store;
				
				if(length > 0)
				{
					StringBuilder back = new StringBuilder(ResultField.getText());
					back.deleteCharAt(number);
					store = back.toString();
					ResultField.setText(store);
					
				}
			}
			
		});
		DeleteNumberButton.setBounds(336, 31, 98, 29);
		frame.getContentPane().add(DeleteNumberButton);
		
		JButton TwoButton = new JButton("2");
		TwoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultField.setText(ResultField.getText() + "2");
			}
		});
		TwoButton.setBounds(10, 69, 98, 29);
		frame.getContentPane().add(TwoButton);
		
		JButton ThreeButton = new JButton("3");
		ThreeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultField.setText(ResultField.getText() + "3");
			}
		});
		ThreeButton.setBounds(120, 71, 98, 29);
		frame.getContentPane().add(ThreeButton);
		
		JButton SubtractionButton = new JButton("-");
		SubtractionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(ResultField.getText());
				calculation = 2;
				ResultField.setText("");			}
		});
		SubtractionButton.setBounds(228, 72, 98, 29);
		frame.getContentPane().add(SubtractionButton);
		
		JButton DeleteFieldButton = new JButton("C");
		DeleteFieldButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultField.setText("");
				num = 0;
				ans = 0;
				calculation = 0;
			}
		});
		DeleteFieldButton.setBounds(336, 71, 98, 29);
		frame.getContentPane().add(DeleteFieldButton);
		
		JButton FourButton = new JButton("4");
		FourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultField.setText(ResultField.getText() + "4");
			}
		});
		FourButton.setBounds(10, 109, 98, 29);
		frame.getContentPane().add(FourButton);
		
		JButton FiveButton = new JButton("5");
		FiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultField.setText(ResultField.getText() + "5");
			}
		});
		FiveButton.setBounds(120, 111, 98, 29);
		frame.getContentPane().add(FiveButton);
		
		JButton MultiplicationButton = new JButton("*");
		MultiplicationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(ResultField.getText());
				calculation = 3;
				ResultField.setText("");
			}
		});
		MultiplicationButton.setBounds(228, 112, 98, 29);
		frame.getContentPane().add(MultiplicationButton);
		
		JButton CommaButton = new JButton(",");
		CommaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultField.setText(ResultField.getText() + ",");
			}
		});
		CommaButton.setBounds(336, 111, 98, 29);
		frame.getContentPane().add(CommaButton);
		
		JButton SixButton = new JButton("6");
		SixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultField.setText(ResultField.getText() + "6");
			}
		});
		SixButton.setBounds(10, 149, 98, 29);
		frame.getContentPane().add(SixButton);
		
		JButton SevenButton = new JButton("7");
		SevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultField.setText(ResultField.getText() + "7");
			}
			
		});
		SevenButton.setBounds(120, 151, 98, 29);
		frame.getContentPane().add(SevenButton);
		
		JButton DivisionButton = new JButton("/");
		DivisionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(ResultField.getText());
				calculation = 4;
				ResultField.setText("");
			}
		});
		DivisionButton.setBounds(228, 152, 98, 29);
		frame.getContentPane().add(DivisionButton);
		
		JButton btnSoon_3 = new JButton("Soon");
		btnSoon_3.setBounds(336, 152, 98, 29);
		frame.getContentPane().add(btnSoon_3);
		
		JButton EightButton = new JButton("8");
		EightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultField.setText(ResultField.getText() + "8");
			}
		});
		EightButton.setBounds(10, 188, 98, 29);
		frame.getContentPane().add(EightButton);
		
		JButton NineButton = new JButton("9");
		NineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultField.setText(ResultField.getText() + "9");
			}
		});
		NineButton.setBounds(120, 188, 98, 29);
		frame.getContentPane().add(NineButton);
		
		JButton SquareButton = new JButton("Soon");
		SquareButton.setBounds(228, 188, 98, 29);
		frame.getContentPane().add(SquareButton);
		
		JButton RootButton = new JButton("Soon");
		RootButton.setBounds(228, 227, 98, 29);
		frame.getContentPane().add(RootButton);
		
		JButton ResultButton = new JButton("=");
		ResultButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MatheOperation();
				String StringAns = Double.toString(ans);
				ResultField.setText(StringAns);
				calculation = 0;
				
				
			}
		});
		ResultButton.setBounds(336, 188, 98, 68);
		frame.getContentPane().add(ResultButton);
		
		JButton Soon = new JButton("Soon");
		Soon.setBounds(10, 228, 208, 29);
		frame.getContentPane().add(Soon);
	}
}
