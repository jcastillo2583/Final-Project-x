import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class QuizLoader extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private Question question;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizLoader frame = new QuizLoader();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuizLoader() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 878, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLoad.setBounds(428, 408, 97, 25);
		contentPane.add(btnLoad);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(751, 408, 97, 25);
		contentPane.add(btnExit);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLoad.setEnabled(false);
				btnCheck.setEnabled(false);
			}
		});
		btnCheck.setBounds(533, 408, 97, 25);
		contentPane.add(btnCheck);
		
		JLabel lblQuiz = new JLabel("Quiz");
		lblQuiz.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblQuiz.setBounds(367, 13, 172, 42);
		contentPane.add(lblQuiz);
		
		JLabel lblQuestion = new JLabel("Question:");
		lblQuestion.setBounds(52, 162, 56, 16);
		contentPane.add(lblQuestion);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.GRAY);
		label.setBounds(126, 104, 56, 16);
		contentPane.add(label);
		
		JLabel lblJkdsnf = new JLabel("Question Goes Here");
		lblJkdsnf.setBackground(Color.BLACK);
		lblJkdsnf.setForeground(Color.BLUE);
		lblJkdsnf.setBounds(161, 162, 578, 16);
		contentPane.add(lblJkdsnf);
		
		JLabel lblScore = new JLabel("Score: ");
		lblScore.setBounds(358, 104, 42, 16);
		contentPane.add(lblScore);
		
		textField = new JTextField();
		textField.setBounds(674, 46, 142, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(632, 49, 56, 16);
		contentPane.add(lblName);
		
		JLabel label_1 = new JLabel("0");
		label_1.setBounds(402, 104, 66, 16);
		contentPane.add(label_1);
		
		JLabel lblForMultipleChoice = new JLabel("For Multiple Choice:");
		lblForMultipleChoice.setBounds(72, 231, 116, 16);
		contentPane.add(lblForMultipleChoice);
		
		JLabel lblForMultipleAnswer = new JLabel("For Multiple Answer:");
		lblForMultipleAnswer.setBounds(72, 273, 142, 16);
		contentPane.add(lblForMultipleAnswer);
		
		JLabel lblShortResponse = new JLabel("Short Response:");
		lblShortResponse.setBounds(72, 312, 110, 16);
		contentPane.add(lblShortResponse);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setEnabled(false);
		radioButton.setBounds(213, 273, 25, 25);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setEnabled(false);
		radioButton_1.setBounds(355, 273, 25, 25);
		contentPane.add(radioButton_1);
		
		JLabel lblFirst = new JLabel("-");
		lblFirst.setBounds(246, 273, 56, 16);
		contentPane.add(lblFirst);
		
		JLabel lblSecond = new JLabel("-");
		lblSecond.setBounds(388, 273, 56, 16);
		contentPane.add(lblSecond);
		
		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setEnabled(false);
		radioButton_2.setBounds(543, 273, 25, 25);
		contentPane.add(radioButton_2);
		
		JLabel lblNewLabel = new JLabel("-");
		lblNewLabel.setBounds(574, 273, 56, 16);
		contentPane.add(lblNewLabel);
		
		JRadioButton radioButton_3 = new JRadioButton("");
		radioButton_3.setEnabled(false);
		radioButton_3.setBounds(689, 269, 25, 25);
		contentPane.add(radioButton_3);
		
		JLabel lblForth = new JLabel("-");
		lblForth.setBounds(722, 273, 56, 16);
		contentPane.add(lblForth);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setBounds(213, 309, 217, 34);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton radioButton_4 = new JRadioButton("");
		radioButton_4.setEnabled(false);
		radioButton_4.setBounds(213, 227, 25, 25);
		contentPane.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("");
		radioButton_5.setEnabled(false);
		radioButton_5.setBounds(355, 227, 25, 25);
		contentPane.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("");
		radioButton_6.setEnabled(false);
		radioButton_6.setBounds(543, 227, 25, 25);
		contentPane.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("");
		radioButton_7.setEnabled(false);
		radioButton_7.setBounds(689, 231, 25, 25);
		contentPane.add(radioButton_7);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(radioButton_4);
		group2.add(radioButton_5);
		group2.add(radioButton_6);
		group2.add(radioButton_7);
		
		
		JLabel label_2 = new JLabel("-");
		label_2.setBounds(246, 231, 56, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("-");
		label_3.setBounds(388, 231, 56, 16);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("-");
		label_4.setBounds(574, 231, 56, 16);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("-");
		label_5.setBounds(722, 231, 56, 16);
		contentPane.add(label_5);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLoad.setEnabled(true);
				btnCheck.setEnabled(true);
				if (question instanceof MultipleAnswer) {
					radioButton.setEnabled(true);
					radioButton_1.setEnabled(true);
					radioButton_2.setEnabled(true);
					radioButton_3.setEnabled(true);
				}
				else 
					textField_1.setEnabled(true);
			}
		});
		btnNext.setBounds(642, 408, 97, 25);
		contentPane.add(btnNext);
		
		JLabel lblCorrectincorrect = new JLabel("Correct/Incorrect:");
		lblCorrectincorrect.setBounds(543, 121, 114, 16);
		contentPane.add(lblCorrectincorrect);
		
		JLabel label_6 = new JLabel("-");
		label_6.setBounds(674, 121, 56, 16);
		contentPane.add(label_6);
	}

}
