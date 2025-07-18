package Project;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[2]; // Only declaration and initializations are allowed,
    // No executable statements outside method and constructor.

    public QuestionService(){
        questions[0] = new Question(1, "Capital of India?", "Bhopal", "Mumbai", "Delhi", "Bangalore", "Delhi");
        questions[1] = new Question(2, "Capital of Madhya Pradesh?", "Bhopal", "Mumbai", "Delhi", "Bangalore", "Bhopal");

    }

    public void playQuiz(){
        Scanner sc = new Scanner(System.in); //This helps in taking input.
        int points = 0;
        for(Question q: questions){
            System.out.println(q.getId() + ". " + q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());
            System.out.print("Enter your answer: ");
            String answer = sc.next();
            if(answer.equals(q.getAnswer())){
                points++;
            } else {
                points--;
            }
        }
        System.out.println("Your score is: " + points);
    }

}
