package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestCases {
    @Test
    public void testCaseSad(){
        MoodAnalyzerProblem mood = new MoodAnalyzerProblem();
        try {
            String result = mood.moodAnalyzer("I am sad today");
            Assert.assertEquals("SAD", result);
        }catch (Exception e){}
    }
    @Test
    public void testCaseHappy(){
        MoodAnalyzerProblem mood = new MoodAnalyzerProblem();
        try {
            String result = mood.moodAnalyzer("I am happy today");
            Assert.assertEquals("HAPPY", result);
        }catch (Exception e){}
    }
    @Test
    public void testCaseNull(){
        MoodAnalyzerProblem mood = new MoodAnalyzerProblem();
        try {
            String result = mood.moodAnalyzer(null);
            Assert.assertEquals("HAPPY", result);
        }catch (Exception e){}
    }
}
