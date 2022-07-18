package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad(){
        MoodAnalyser obj = new MoodAnalyser("I am in sAd Mood");
        String result = obj.analyzeMood();
        Assertions.assertEquals("SAD",result);
    }
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy(){
        MoodAnalyser obj = new MoodAnalyser("My Mood is blank");
        String result = obj.analyzeMood();
        Assertions.assertEquals("HAPPY",result);
    }
    @Test
    public void givenMessage_WhenNull_ShouldReturnHappy(){
        MoodAnalyser obj = new MoodAnalyser(null);
        String result = obj.analyzeMood();
        Assertions.assertEquals("HAPPY",result);
    }

}
