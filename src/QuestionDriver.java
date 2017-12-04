import java.util.Scanner;
import java.util.*;
public class QuestionDriver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String response;
		
		Question question = new Question("This question is true", "true");
		ArrayList<String> possibleAnswers = new ArrayList<>();
		possibleAnswers.add("2017");
		possibleAnswers.add("2071");
		possibleAnswers.add("2107");
		possibleAnswers.add("2710");
		ArrayList<String> fakeAns = new ArrayList();
		fakeAns.add("yes");
		fakeAns.add("yeah");
		ArrayList in = new ArrayList();
		in.add("yeah");
		in.add("yes");
		MultipleAnswer mcq = new MultipleAnswer("What year is it?", fakeAns, in);
		System.out.println(mcq.correct());
		
		Quiz quiz = new Quiz(2, "Test");
		quiz.addQuestion(question);
		quiz.addQuestion(mcq);
		System.out.print(quiz.toString());
	}
}
