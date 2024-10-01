package com.pluralsight;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a score in the following format \"Home:Visitor|21:9\": ");
        String teamScore =keyboard.nextLine();
        String[] parts = teamScore.split(Pattern.quote("|"));

        String[] teams = parts[0].split(":");
        String[] score = parts[1].split(":");

        int scoreHome = Integer.parseInt(score[0]);
        int scoreVisitor = Integer.parseInt(score[1]);
        if (scoreHome > scoreVisitor) {
            System.out.println("Winner: " + teams[0]);
        } else {
            System.out.println("Winner: " + teams[1]);
        }





    }
}
