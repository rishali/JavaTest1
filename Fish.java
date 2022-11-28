package org.example;

import java.util.ArrayList;
import java.util.Random;


public class Fish {
    static ArrayList<String> fish = new ArrayList<String>();
    public static void main(String args[]) {
        fish.add("F");
//        fish.add("F");
//        fish.add("F");
//        fish.add("F");
        fish.add("M");
//        fish.add("M");
//        fish.add("M");
//        fish.add("M");
                int n = 5; // Number of threads
                for (int i = 0; i < n; i++) {
                    Thread object
                            = new Thread(new MultithreadingDemo());
                    object.start();
                }
    }
    }
