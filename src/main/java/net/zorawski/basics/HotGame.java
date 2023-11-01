package net.zorawski.basics;

import java.util.Scanner;

public class HotGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Hot or Not!");
        System.out.println("Your goal is to find me!");
        printHelp();
        int goalX = randomizeLocation();
        int goalY = randomizeLocation();

        int playerX = 0;
        int playerY = 0;

        Scanner scanner = new Scanner(System.in);
        String command = scanner.next();
        if("exit".equals(command)) {
            System.out.println("You looser!");
            return;
        }
    }

    /**
     * Randomize location value
     * @return integer from -5 to 5
     */
    private static int randomizeLocation() {
        return (int) (Math.random() * 10 - 5);
    }

    private static void printHelp() {
        System.out.println("Available commands:");
        System.out.println("- north\n- south\n- west\n- east");
        System.out.println("and 'exit' to be a sore looser and quit the game.");
    }
}
