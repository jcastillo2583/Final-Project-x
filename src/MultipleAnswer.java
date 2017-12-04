import java.util.ArrayList;
public class MultipleAnswer extends Question{
	  private ArrayList<String> answers;
	  private ArrayList<String> inputedAns;
  public MultipleAnswer(String question, ArrayList<String> answers, ArrayList<String> inputedAns){
    super(question, null);
    this.answers = answers;
    this.inputedAns = inputedAns;
  }
  
  @Override
  public String askQuestion(){
    String result = super.askQuestion() + "\n";
    return result;
  }
  
	@Override
    public String toString() {
        String output =  "Question: " + askQuestion() + "\n\nPossible answers:";
        for(String s : inputedAns) {
        	output += "\n" + s;
        	
        }
        return output;// + "\n(Enter letter as answer)\n";
    }
	
	public boolean correct() {			
		if(answers.size() != inputedAns.size())
			return false;
		
		for (int i = 0; i < answers.size(); i++) {
			outerloop:
			for (int j = 0; j < inputedAns.size(); j++) {
				if(inputedAns.get(j).equals(answers.get(i)))
					break outerloop;
				if(j == inputedAns.size() - 1)
					return false;
			}
		}
		return true;
	}
}
