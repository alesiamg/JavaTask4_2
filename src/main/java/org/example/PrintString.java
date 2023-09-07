package org.example;

import java.util.Queue;
import java.util.Random;

public class PrintString {
    public static void printString(Queue<String> queue) {
        Random random = new Random();
        while (!queue.isEmpty()) {
            String line = queue.poll(); // извлекаем и удаляем 1-й элемент из очереди
            System.out.println(line);
            int delay = random.nextInt(3);

            try {
                Thread.sleep((delay + 1) * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


