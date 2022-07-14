package com.moodanalyser;

public class MoodAnalyser {
    public static String message;
    public MoodAnalyser(String message){
        this.message = message;
    }
    public String analyzeMood() {
        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else if (!message.toLowerCase().contains("sad")){
            return "HAPPY";
        } else
            return null;
    }
}
