package com.bridgelabz;

import java.util.Scanner;

//UC-1 Given a Message, ability
//to analyse and respond
//Happy or Sad Mood
public class MoodAnalyzerProblem {
    public String moodAnalyzer(String text){
        String temp = text.toLowerCase();
        if(temp.contains("sad")){
            System.out.println("SAD");
            return "SAD";
        }else {
            System.out.println("HAPPY");
            return "HAPPY";
        }
    }
    public static void main(String[] args) {
        MoodAnalyzerProblem mood = new MoodAnalyzerProblem();
        System.out.println("Welcome to the Mood Analyzer Problem");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the MOOD :: ");
        String text = sc.nextLine();
        mood.moodAnalyzer(text);
    }
}
