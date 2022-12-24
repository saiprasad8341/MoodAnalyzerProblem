package com.bridgelabz;

import java.util.Scanner;

//UC-3 Inform user if entered
//Invalid Mood

public class MoodAnalyzerProblem {

    public String moodAnalyzer(String text) throws MoodAnalysisException{
        try{
            if(text.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.exceptionType.EMPTY, "Please enter the valid inputs...");
            String temp = text.toLowerCase();
            if(temp.contains("sad")){
                System.out.println("SAD");
                return "SAD";
            }else {
                System.out.println("HAPPY");
                return "HAPPY";
            }
        } catch (NullPointerException e){
            throw new MoodAnalysisException(MoodAnalysisException.exceptionType.NULL, "Please enter the valid inputs...");
        }
    }

    public static void main(String[] args) {
        MoodAnalyzerProblem mood = new MoodAnalyzerProblem();
        System.out.println("Welcome to the Mood Analyzer Problem");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the MOOD :: ");
        String text = sc.nextLine();
        try {
            mood.moodAnalyzer(text);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
