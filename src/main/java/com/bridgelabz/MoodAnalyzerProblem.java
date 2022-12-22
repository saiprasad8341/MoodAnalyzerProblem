package com.bridgelabz;

import java.util.Scanner;

//UC-1 Given a Message, ability
//to analyse and respond
//Happy or Sad Mood
public class MoodAnalyzerProblem {
    public static Boolean moodAnalyzer(String text){
        String temp = text.toLowerCase();
        if(temp.contains("sad")){
            System.out.println("SAD");
            return true;
        }else {
            System.out.println("HAPPY");
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Mood Analyzer Problem");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the MOOD :: ");
        String text = sc.nextLine();
        moodAnalyzer(text);
    }
}
