package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestCases {
    @Test
    public void testCaseSad(){
        MoodAnalyzerProblem mood = new MoodAnalyzerProblem();
        String result = mood.moodAnalyzer("I am sad today");
        Assert.assertEquals("SAD", result);
    }
    @Test
    public void testCaseHappy(){
        MoodAnalyzerProblem mood = new MoodAnalyzerProblem();
        String result = mood.moodAnalyzer("I am happy today");
        Assert.assertEquals("HAPPY", result);
    }
    @Test
    public void testCaseNull(){
        MoodAnalyzerProblem mood = new MoodAnalyzerProblem();
        String result = mood.moodAnalyzer(null);
        Assert.assertEquals("HAPPY", result);
    }
}
