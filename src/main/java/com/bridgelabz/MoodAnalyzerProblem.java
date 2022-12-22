package com.bridgelabz;

import java.util.Scanner;

//UC-2 Handle Exception if
//User Provides Invalid
//Mood
public class MoodAnalyzerProblem {
    public String moodAnalyzer(String text){
        try{
            String temp = text.toLowerCase();
            if(temp.contains("sad")){
                System.out.println("SAD");
                return "SAD";
            }else {
                System.out.println("HAPPY");
                return "HAPPY";
            }
        } catch (NullPointerException e){
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
