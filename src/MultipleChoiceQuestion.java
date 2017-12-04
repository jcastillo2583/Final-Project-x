import java.util.ArrayList;
public class MultipleChoiceQuestion extends Question{
  private ArrayList<String> possibleAnswers;
  public MultipleChoiceQuestion(String question, String answer, ArrayList<String> possibleAnswers){
    super(question, answer);
    this.possibleAnswers = possibleAnswers;
  }
  
  @Override
  public String askQuestion(){
    String result = super.askQuestion() + "\n";
    return result;
  }
  public void setPossibleAnswers(ArrayList<String> possibleAnswers){
    this.possibleAnswers = possibleAnswers;
  }
  public ArrayList<String> getPossibleAnswers(){
    return possibleAnswers;
  }
  @Override
  public MultipleChoiceQuestion2 clone(){
    MultipleChoiceQuestion2 temp = new MultipleChoiceQuestion2(super.askQuestion(), getAnswer(), possibleAnswers);
   return temp;
  }
  
	@Override
    public String toString() {
        String output =  "Question: " + askQuestion() + "\n\nPossible answers:";
        for(String s : possibleAnswers) {
        	output += "\n" + s;
        	
        }
        return output;// + "\n(Enter letter as answer)\n";
    }
}
