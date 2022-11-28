package com.cc.java;
public class App {
    public static void main(String[] args) {
    
        Player player = new Player();

        for (int i = 0; i < 12; i++) {
            output(player.play());  
        }

    }

    private static void output(String outStr) {
        System.out.println(outStr);
    }
}
