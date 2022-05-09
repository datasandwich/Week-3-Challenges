import java.util.Scanner;
/*
This class creates an interactive quiz

CURRENT OBJECTIVE: Trying to shuffle the answers each time.
 */
public class Quiz {
    public static void main(String[] args) {
        // Creating the questions and answers.
        String q1 = "What is the highest mountain in the world?";
        String q2 = "What is the longest river in the world?";
        String q3 = "What is the fastest the land-animal?";

        String a1_c = "Everest";
        String a1_w_1 = "Kilimanjaro";
        String a1_w_2 = "Makalu";
        String a1_w_3 = "Kangchenjunga";

        String a2_c = "Nile";
        String a2_w_1 = "Danube";
        String a2_w_2 = "Thames";
        String a2_w_3 = "Amazon";

        String a3_c = "Cheetah";
        String a3_w_1 = "Lion";
        String a3_w_2 = "Leopard";
        String a3_w_3 = "Ostrich";

        // Storing the questions and answers in a 2-dimensional array.
        String[][] questionsAndAnswers =
                        {{q1,a1_c,a1_w_1,a1_w_2,a1_w_3},
                        {q2,a2_w_1,a2_c,a2_w_2,a2_w_3},
                        {q3,a3_w_1,a3_w_2,a3_c,a3_w_3}};

        int score = 0;
        int ans_index = 1;
        // Looping around the questions.
        for (String[] questionsAndAnswer : questionsAndAnswers) {
            boolean ans = false;
            // Repeating the question until a correct answer is given.
            while (!ans) {
                for (String s : questionsAndAnswer) {
                    System.out.println(s);
                }
                Scanner scan = new Scanner(System.in);
                String answer = scan.nextLine();
                if (answer.equals(questionsAndAnswer[ans_index].toLowerCase())){
                    System.out.println("Correct!");
                    score++;
                    ans = true;
                } else if (answer.equals("")){
                    System.out.println("You need to enter something!");
                } else{
                    System.out.println("Wrong");
                    ans = true;
                }
            }
            ans_index++;
        }
        System.out.println("You scored "+score+" points!");
    }
}
