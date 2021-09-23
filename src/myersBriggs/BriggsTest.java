package myersBriggs;

import java.util.Arrays;
import java.util.Scanner;

public class BriggsTest {


    public static String[] question;
    private static char [] userResponse;

    public static void main(String[] args) {
        collectUserResponse();
        displayResult();
        displayTestResult();

    }
    public static String[] personalityQuestionsInArray(){
        String[] question ={
                """
                 Question 1
                 A: Expend energy, enjoy groups
                 B: Conserve energy, enjoy one-on-one
                 """,
                """
                Question 2
                A: Interpret literally
                B: look for meaning and possibility
                """,
                """
                QUESTION 3
                A: logical, thinking, questioning
                B: empathetic, feeling, accommodating
                """,
                """
                QUESTION 4
                A: organized, orderly
                B: flexible, adaptable
                        """ ,
                """
                        QUESTION 5
                        A: more outgoing, think out loud
                        B: more reserved, think to yourself
                        """ ,
                """
                                QUESTION 6
                                A: practical, realistic, experiential
                                B: imaginative, innovative, theoretical
                                """,
                """
                                QUESTION 7
                                A: candid, straight forward, frank
                                B: tactful, kind, encouraging
                                """,
                """
                                QUESTION 8
                                A: plan, schedule
                                B: unplanned, spontaneous
                                """,
                """
                                QUESTION 9
                                A: seek many task, public activities, interaction with others" 
                                B: seek private, solitary activities with quiet to concentrate
                                """,
                """
                                QUESTION 10
                                A: standard, usual, conventional
                                B: different, novel, unique
                                """,
                """
                                QUESTION 11
                                A: firm, tend to criticize, hold the line
                                B: gentle, tend to appreciate, conciliate
                                """,
                """
                                QUESTION 12
                                A: regulated, structured
                                B: easy going, live and let live
                                """,
                """
                                QUESTION 13
                                A: external, communicative, express yourself
                                B: internal, reticent, keep to yourself
                                """,
                """
                                QUESTION 14
                                A: focus on here-and-now
                                B: look to the future, global prospective, big picture
                                """ ,
                """
                                QUESTION 15
                                A: tough-minded, just
                                B: tender-hearted, merciful
                                """,
                """
                                QUESTION 16
                                A: preparation, plan ahead
                                B: go with the flow, adapt as you go
                                """,
                """
                                QUESTION 17
                                A: active, initiate
                                B: reflective, deliberate
                                """,
                """
                                QUESTION 18
                                A: facts, things, "what is"\040
                                B: ideas, dream, what could be, philosophical
                                """,
                """
                                QUESTION 19
                                A: matter of fact, issue-oriented
                                B: sensitive, people oriented, compassionate
                                """,
                """
                                QUESTION 20
                                A: control, govern
                                B: latitude, freedom
                                """
        };
        return  question;

    }

    public static void collectUserResponse(){
        question = personalityQuestionsInArray();
        Scanner input = new Scanner(System.in);
        userResponse = new char[question.length];
        System.out.println("Welcome to Myers Briggs Aptitude test");
        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i]);
            System.out.println("Kindly choose the option that best describes you honestly");

            userResponse[i] = input.next().charAt(0);

            }

        }
    public static void displayResult() {
        String header = String.format("%5s%5s%5s", " ", "A", "B");
        System.out.print(header.repeat(4));
        System.out.println();
        System.out.println("=".repeat(62));
        for (int i = 1; i < question.length; i+=4) {
            System.out.printf("%5d", i);
            if (userResponse[i - 1] == 'A' || userResponse[i-1] == 'a') {
                System.out.printf("%5s%5s", "A", " ");
            } else {
                System.out.printf("%5s%5s", " ", "B");
            }

            System.out.printf("%5d",i+1);
            if (userResponse[i] == 'A' ||  userResponse[i] == 'a')  {
                System.out.printf("%5s%5s", "A", " ");
            } else {
                System.out.printf("%5s%5s", " ", "B");
            }
            System.out.printf("%5d", i+2);
            if (userResponse[i+1] == 'A' || userResponse[i+1] == 'a') {
                System.out.printf("%5s%5s", "A", " ");
            } else {
                System.out.printf("%5s%5s", " ", "B");
            }
            System.out.printf("%5d", i+3);
            if (userResponse[i+2] == 'A' || userResponse[i+2] == 'a') {
                System.out.printf("%5s%5s", "A", " ");
            } else {
                System.out.printf("%5s%5s", " ", "B");
            }
            System.out.println();

            System.out.print("=".repeat(62));
            System.out.println();
        }
    }
    private static void displayTestResult(){
        String [] trait = new String [4];
        System.out.print("Total");

        int countA = 0;
        int countB = 0;
        for (int i = 0; i < 4; i++) {
             countA = 0;
             countB = 0;
            if (userResponse[i] == 'A' || userResponse[i] == 'a') {
                countA++;
            } else {
                countB++;
            }
            if (userResponse[i+4] == 'A' || userResponse[i+4] == 'a') {
                countA++;
            } else {
                countB++;
            }
            if (userResponse[i+8] == 'A' || userResponse[i+8] == 'a'){
                countA++;
            }
                else{
                    countB++;
            }
                if (userResponse[i+12] == 'A' || userResponse[i+12] == 'a') {
                    countA++;
                }
                    else{
                        countB++;
                    }
            if (userResponse[i + 16] == 'A' || userResponse[i+16] == 'a') {
                countA++;
            }
            else{
                countB++;
            }
            System.out.printf("%5d%5d%5s",countA, countB, " ");

            switch (i){
                case(0):
                    if(countA > countB){
                      trait [i]= "Extrovert";
                    }
                    else{
                        trait [i]= "Introvert";
                    }
                    break;
                case(1):
                    if(countA > countB){
                        trait [i]= "Sensing";
                    }
                    else{
                        trait [i]= "Intuition";
                    }
                    break;
                case(2):
                    if(countA > countB){
                        trait [i]= "Thinking";
                    }
                    else{
                        trait [i]= "Feeling";
                    }
                    break;
                case(3):
                    if(countA > countB){
                        trait [i]= "Judging";
                    }
                    else{
                        trait [i] = "Perspective";
                    }
                    break;
            }
        }
        System.out.println();
        System.out.println("");
        System.out.print(Arrays.toString(trait));
        System.out.println();
        System.out.print("=".repeat(62));
    }
}
