package com.moodanalyser;

public class MoodAnalyser {
    public static String message;
    public MoodAnalyser(String message){
        this.message = message;
    }
    public String analyzeMood() {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "SAD";
            } else if (!message.toLowerCase().contains("sad")) {
                return "HAPPY";
            } else
                return null;
        } catch (NullPointerException e) {
            System.out.println("We Assume you are Happy. for us to help you better please enter a valid Mood");
        }
        return "HAPPY";
    }
}
