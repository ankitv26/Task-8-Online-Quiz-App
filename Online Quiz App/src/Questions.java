public class Questions {
    String questions;
    String[] options;
    int correctOption;

    public Questions(String questions, String[] options, int correctOption) {
        this.questions = questions;
        this.options = options;
        this.correctOption = correctOption;
    }

    public void displayQuestion(){
        System.out.println();
        System.out.println(questions);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i+1)+"."+options[i]);
            
        }
    }

    public boolean isCorrect(int userAnswer){
        if(userAnswer == correctOption){
            
            System.out.println("Correct Answer : "+correctOption);
            return true;
        }
        else{
            System.out.println("Wrong Answer.\n Correct Answer is : "+correctOption);
            return false;
        }
    }


 }
