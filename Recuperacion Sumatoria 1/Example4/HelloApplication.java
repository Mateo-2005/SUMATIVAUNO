package com.example.exercise_4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;
public class HelloApplication {
    private enum Direction {
        POSITIVE_Y, NEGATIVE_X, NEGATIVE_Y, POSITIVE_X;

        public Direction turn() {
            switch (this) {
                case POSITIVE_Y: return NEGATIVE_X;
                case NEGATIVE_X: return NEGATIVE_Y;
                case NEGATIVE_Y: return POSITIVE_X;
                case POSITIVE_X: return POSITIVE_Y;
                default: throw new IllegalArgumentException("Invalid direction");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sequence of steps separated by spaces:");
        String input = scanner.nextLine();
        String[] stepsString = input.split(" ");
        int[] steps = new int[stepsString.length];
        for (int i = 0; i < stepsString.length; i++) {
            steps[i] = Integer.parseInt(stepsString[i]);
        }

        System.out.println(whereIsTheRobot(steps));
    }

    private static String whereIsTheRobot(int[] steps) {
        int x = 0;
        int y = 0;
        Direction direction = Direction.POSITIVE_Y;

        for (int step : steps) {
            switch (direction) {
                case POSITIVE_Y: y += step; break;
                case NEGATIVE_X: x -= step; break;
                case NEGATIVE_Y: y -= step; break;
                case POSITIVE_X: x += step; break;
            }
            direction = direction.turn();
        }

        return "x: " + x + ", y: " + y + ", direction: " + direction;
}
}