package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad(){
        MoodAnalyser obj = new MoodAnalyser();
        String result = obj.analyzeMood("I am in sad Mood");
        Assertions.assertEquals("SAD",result);
    }
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy(){
        MoodAnalyser obj = new MoodAnalyser();
        String result = obj.analyzeMood("I am in Happy Mood");
        Assertions.assertEquals("HAPPY",result);
    }

}
