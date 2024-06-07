package com.example.exercise1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0  && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }else if  (i % 3 == 0 ) {
                System.out.println("Fizz");
            }else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }

        }
    }
}