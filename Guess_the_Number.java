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
         Scanner sc = new Scanner(System.in);
         int b = sc.nextInt();
        if(b==0) {
            System.out.println("The range of numbers is 0-10");
            this.number = rand.nextInt(10);
        } else if (b==1) {
            System.out.println("The range of numbers is 0-100");
            this.number = rand.nextInt(100);
        } else if (b==2) {
            System.out.println("The range of numbers is 0-250");
            this.number = rand.nextInt(250);
        } else if (b==3) {
            System.out.println("The range of numbers is 0-500");
            this.number = rand.nextInt(500);
        }
        else if (b==4){
            System.out.println("The range of numbers is 0-1000");
            this.number = rand.nextInt(1000);
        }
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
        System.out.println("CHOOSE DIFFICULTY");
        System.out.println("ENTER 0 FOR Very Easy");
        System.out.println("ENTER 1 FOR Easy");
        System.out.println("ENTER 2 FOR Mediocre");
        System.out.println("ENTER 3 FOR Hard");
        System.out.println("ENTER 4 FOR Very Hard");
        Guess_the_Random_Number_game g = new Guess_the_Random_Number_game();
        boolean a = false;
        while (!a) {
            g.takeUserInput();
            a = g.isCorrectNumber();
           // System.out.println(a); //no significance,only wanted to stop displaying true or false
        }
    }
}
