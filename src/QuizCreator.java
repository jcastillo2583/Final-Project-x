import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;

public class QuizCreator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField shortAnswerField;
	private String mcqa;
	private Quiz quiz = new Quiz(0, "");
	private MultipleAnswer mcaQuiz;
	private Question shortResponse = new Question("", "");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					QuizCreator frame = new QuizCreator();
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
	public QuizCreator() {
		ArrayList<JTextField> list = new ArrayList();
		list.add(textField);
		list.add(textField_1);
		list.add(textField_3);
		list.add(textField_4);
		list.add(textField_5);
		list.add(textField_6);
		list.add(textField_7);
		list.add(textField_8);
		list.add(textField_9);
		
		
		System.out.println("HELLO2");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 910, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuizCreator = new JLabel("Quiz Creator");
		lblQuizCreator.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblQuizCreator.setBounds(381, 46, 212, 53);
		contentPane.add(lblQuizCreator);
		
		textField = new JTextField();
		textField.setBounds(105, 144, 257, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		

		System.out.println(contentPane.getAccessibleContext().toString());
		
		JLabel lblQuestion = new JLabel("Question:");
		lblQuestion.setBounds(34, 147, 76, 16);
		contentPane.add(lblQuestion);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if();
				//else
				System.exit(0);
			}
		});
		btnSave.setBounds(783, 545, 97, 25);
		contentPane.add(btnSave);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(e.toString());
			}
		});
		textField_1.setBounds(221, 214, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_3.setBounds(368, 214, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_4.setBounds(520, 214, 116, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblMultipleChoiceAnswers = new JLabel("Multiple Choice Answers:");
		lblMultipleChoiceAnswers.setBounds(36, 217, 150, 16);
		contentPane.add(lblMultipleChoiceAnswers);
		
		textField_5 = new JTextField();
		textField_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_5.setBounds(671, 214, 116, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcqa = textField_1.getText();
			}
		});
		radioButton_1.setBounds(194, 213, 25, 25);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcqa = textField_3.getText();
			}
		});
		radioButton_2.setBounds(345, 213, 25, 25);
		contentPane.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("New radio button");
		radioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcqa = textField_4.getText();
			}
		});
		radioButton_3.setBounds(492, 213, 24, 25);
		contentPane.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("");
		radioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mcqa = textField_5.getText();
			}
		});
		radioButton_4.setBounds(648, 211, 25, 25);
		contentPane.add(radioButton_4);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioButton_1);
		group.add(radioButton_2);
		group.add(radioButton_3);
		group.add(radioButton_4);
		
		JLabel lblMultipleAnswer = new JLabel("Multiple Answers:");
		lblMultipleAnswer.setBounds(34, 276, 123, 16);
		contentPane.add(lblMultipleAnswer);
		
		textField_6 = new JTextField();
		textField_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_6.setBounds(221, 273, 116, 22);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_7.setBounds(368, 273, 116, 22);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_8.setBounds(520, 273, 116, 22);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_9.setBounds(671, 273, 116, 22);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JRadioButton mcqAnswer_1 = new JRadioButton("");
		mcqAnswer_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mcqAnswer_1.setBounds(194, 272, 25, 25);
		contentPane.add(mcqAnswer_1);
		
		JRadioButton mcqAnswer_2 = new JRadioButton("");
		mcqAnswer_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mcqAnswer_2.setBounds(345, 272, 25, 25);
		contentPane.add(mcqAnswer_2);
		
		JRadioButton mcqAnswer_3 = new JRadioButton("");
		mcqAnswer_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mcqAnswer_3.setBounds(492, 272, 25, 25);
		contentPane.add(mcqAnswer_3);
		
		JRadioButton mcqAnswer_4 = new JRadioButton("");
		mcqAnswer_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mcqAnswer_4.setBounds(648, 272, 25, 25);
		contentPane.add(mcqAnswer_4);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(815, 336, 0, -139);
		contentPane.add(separator);
		
		JLabel lblShortAnswer = new JLabel("Short Answer:");
		lblShortAnswer.setBounds(36, 336, 90, 16);
		contentPane.add(lblShortAnswer);
		
		shortAnswerField = new JTextField();
		shortAnswerField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		shortAnswerField.setBounds(210, 336, 332, 53);
		contentPane.add(shortAnswerField);
		shortAnswerField.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for(JTextField txt : list) {
					if(txt != null)
						txt.setText("");
					System.out.println(txt);
				}
				return;
			}
		});
		btnClear.setBounds(539, 545, 97, 25);
		contentPane.add(btnClear);
		
		JRadioButton radioButton20 = new JRadioButton("");
		radioButton20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		radioButton20.setBounds(822, 213, 127, 25);
		contentPane.add(radioButton20);
		
		JRadioButton radioButton21 = new JRadioButton("");
		radioButton21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		radioButton21.setBounds(822, 272, 127, 25);
		contentPane.add(radioButton21);
		
		JRadioButton radioButton22 = new JRadioButton("");
		radioButton22.setBounds(822, 332, 127, 25);
		contentPane.add(radioButton22);	
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(radioButton20);
		group2.add(radioButton21);
		group2.add(radioButton22);
		
		JLabel lblChoseOne = new JLabel("Chose one");
		lblChoseOne.setBounds(804, 170, 76, 16);
		contentPane.add(lblChoseOne);
		
		
		JButton btnAddQuestion = new JButton("Add Question");
		btnAddQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(group2.getSelection() == radioButton20)
					//mpqa = new MultipleChoiceQuestion();
				//else if(group2.getSelection() == radioButton21)
				
				//else if(group2.getSelection() == radioButton22)
					
				for(JTextField txt : list) {
					if(txt != null)
						txt.setText("");
					System.out.println(txt);
				}
			}
		});
		btnAddQuestion.setBounds(653, 545, 118, 25);
		contentPane.add(btnAddQuestion);
	}
}