package com.game;
import java.util.Scanner;
import java.util.Random;
class Guess_the_Random_Number_game{
    public int number;
    public int inputNumber;
    public int Number_of_Guesses;

    public int getNumber_of_Guesses() {
        return Number_of_Guesses;
    }
    public void setNumber_of_Guesses(int number_of_Guesses) {
        Number_of_Guesses = number_of_Guesses;
    }
     Guess_the_Random_Number_game(){
        Random rand =new Random();
        this.number=rand.nextInt(100);
         //System.out.println(number); //only for testing the program
    }
void takeUserInput(){
    System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
boolean isCorrectNumber(){
        Number_of_Guesses++;
        if (inputNumber==number){
            System.out.println("You guessed it mf gg's ");
            System.out.println("It was " +number);
            System.out.println("Score : " +getNumber_of_Guesses());
            return true;
        }
        else if (inputNumber<number) {
            System.out.println("You need to go higher");
        }
        else if (inputNumber>number) {
            System.out.println("You need to go lower");
        }
    return false;
    }
}

public class Guess_the_Number {
    public static void main(String[] args) {
        /*
        we will make the following methods:-
        1. constructor to generate a random number
        2. takeUserInput() to take the input of the user
        3. isCorrectNumber() to detect whether the number entered by user is true
        4. Getter and Setter for number of guesses
        Use properties like number_of_Guesses(int),etc to get the task done
         */
        System.out.println("Welcome");
        System.out.println("In the number guessing game, the program selects a random number between two numbers, and the user guesses the correct number. ");
        System.out.println("Lesser the score,the better");
        System.out.println();
        Guess_the_Random_Number_game g = new Guess_the_Random_Number_game();
        boolean a = false;
        while (!a) {
            g.takeUserInput();
            a = g.isCorrectNumber();
           // System.out.println(a); //no significance,only wanted to stop displaying true or false
        }
    }
}
