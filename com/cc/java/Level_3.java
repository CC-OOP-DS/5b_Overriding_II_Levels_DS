package com.cc.java;

public class Level_3 {
    
    private String levelName = "Level 3";
    protected int points;

    protected String play(){
        points++;
        return "Yahoo, I´m in " + levelName + ", and I have " + points + " points!";
    }

}
