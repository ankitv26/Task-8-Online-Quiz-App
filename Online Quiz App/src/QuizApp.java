import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Questions> questionsList = new ArrayList<>();
        List<Integer> userAnswer = new ArrayList<>();

        questionsList.add(new Questions("a. Who was the first Prime Minister of independent India?",
                new String[] { "Mahatma Gandhi", "Jawaharlal Nehru", "Sardar Vallabhbhai Patel", "Dr. B.R. Ambedkar" },
                2));

        questionsList.add(new Questions("b. Which river is considered the holiest in India?",
                new String[] { "Yamuna", "Brahmaputra", "Ganga", "Godavari" }, 3));

        questionsList.add(new Questions("c. In which year did India become a republic?",
                new String[] { "1947", "1948", "1950", "1952" }, 3));

        System.out.println("******* Welcome to QuizApp *******");

  
        for (Questions questions : questionsList) {
            questions.displayQuestion();
            System.out.println();
            int answer = scanner.nextInt();
            scanner.nextLine();
            userAnswer.add(answer);
        }

       int score = 0;
       for (int i = 0; i < questionsList.size(); i++) {
        if (questionsList.get(i).isCorrect(userAnswer.get(i))) {
            score ++;
        }
       }
       System.out.println("Your Final Score is : "+score+" | "+questionsList.size());

    }
}