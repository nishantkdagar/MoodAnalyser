package com.moodanalyser;

public class MoodAnalyser {

    public String analyzeMood(String message) {
        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else if (!message.toLowerCase().contains("sad")){
            return "HAPPY";
        } else
            return null;
    }
}
