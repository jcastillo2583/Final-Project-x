import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
public class Quiz {
	private ArrayList<Question> questions;
	String fileName;
	
	public Quiz(int total, String fileName) {
		questions = new ArrayList<>();
		this.fileName = fileName + ".txt";
	}
	
	public void addQuestion(Question question) {
			questions.add(question);
	}
	
	@Override
	public String toString() {
		String output = "";
		for(int q = 0; q < questions.size(); q++) {
			output += (q+1) + ". " + questions.get(q).toString() + "\n";
		}
		return output;
	}
	
	public void save() {
		FileInputStream file = null;
		try {
			file  = new FileInputStream(fileName);
		    Scanner s = new Scanner(file);
		    System.out.println(s.nextLine());
		   }catch(IOException ioe){
		     ioe.printStackTrace();
		   }finally {
		     try {
		       file.close();
		    }catch(IOException e){
		 }
	 }
 }
}