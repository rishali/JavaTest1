package org.example;

import java.util.Random;

import static org.example.Fish.fish;

public class MultithreadingDemo implements Runnable {
    public void run() {
        Random r = new Random();

        while (!(fish.isEmpty())) {
           int len = fish.size();
            String x = fish.remove(r.nextInt((len - 1)));
            String y = fish.remove(r.nextInt((len - 1)));

            if (x.equals(y) && (x.equals("M")))  //2 male fish meet, they kill each other
            {
                System.out.println("condition 1 " + fish);
            } else if (x.equals(y) && (x.equals("F"))) //2 female fish meet,1 fish dies
            {
                fish.add(y);
                System.out.println("condition 2 " + fish);

            } else if (!(x.equals(y))) // male and female fish meet they spawn two new fishes of random gender
            {
                fish.add(x);
                fish.add(y);
                fish.add(fish.get(r.nextInt(len - 1)));
                fish.add(fish.get(r.nextInt(len - 1)));
                System.out.println("condition 3 " + fish);
            } else {
                System.out.println("condition 4 " + fish);
                break;
            }
        }
    }
}