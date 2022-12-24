package com.bridgelabz;

public class MoodAnalysisException extends Exception{
    exceptionType type;
    public MoodAnalysisException (exceptionType type, String msg){
        super(msg);
        this.type = type;
    }
    enum exceptionType{
        EMPTY,
        NULL
    }
}
