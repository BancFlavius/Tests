package Arrays;

import java.io.File;
import java.util.Scanner;

public class Hangman {
    private String movieName;
    private String guessedMovieName;
    private String wrongLetters;
    private int wrongGuesses;
    private boolean playerWin;
    boolean gameOver = false;
    private int lineNumber;


    Hangman() {
        movieName = "";
        wrongLetters = "";
        lineNumber = 0;
        wrongGuesses = 10;

        movieName = readFilmTitle().trim().toLowerCase();
        guessedMovieName = movieName.replaceAll("[a-z0-9]", "_");
        displayMessages();
    }

    public static void main(String[] args) {

        Hangman game = new Hangman();
        while (!game.endGame()) {
            game.checkLetter();
            game.displayMessages();
        }
    }

    private int movieNumber(int maxNumber) {
        double randomNumber = Math.random() * maxNumber + 1;
        return (int) randomNumber;
    }

    private String readFilmTitle() {
        String movieTitle = "";
        String[] allMoviesTitles = {" "};
        int lineCount = 0;

        try {
            File file = new File("words.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                allMoviesTitles = addElement(allMoviesTitles, scanner.nextLine());
                lineCount++;
            }
            scanner.close();
            lineNumber = movieNumber(lineCount);
            movieTitle = allMoviesTitles[lineNumber];
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return movieTitle;
    }

    private String[] addElement(String[] stringArray, String newValue) {
        String[] tempArray = new String[stringArray.length + 1];
        System.arraycopy(stringArray, 0, tempArray, 0, stringArray.length);
        tempArray[stringArray.length] = newValue;
        return tempArray;
    }

    void displayMessages(){
        if(wrongGuesses == 0){
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("You lost!");
            System.out.println("The word was: "+movieName);
        } else if(playerWin){
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("You won.");
            System.out.println("The word was: "+movieName);
        } else {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Word: " + guessedMovieName);
            System.out.println("Misses: "+wrongLetters+ " Guesses left: "+wrongGuesses);
            System.out.print("Guess: ");
        }
    }

    boolean endGame(){
        gameOver = wrongGuesses == 0;
        if(playerWin) gameOver = true;
        return gameOver;
    }

    void checkLetter(){
        char newLetter;
        String temp;
        boolean findIt = false;
        Scanner scanner = new Scanner(System.in);

        temp = scanner.next().toLowerCase();
        newLetter = temp.charAt(0);

        for(int i = 0; i<movieName.length();i++){
            if(movieName.charAt(i) == newLetter){
                if(guessedMovieName.charAt(i) == newLetter && !findIt){
                    System.out.println(newLetter+" it's already a correct letter.");
                }
                guessedMovieName = replpaceCharAt(guessedMovieName, i,newLetter);
                findIt = true;
            }
        }
        if(findIt){
           playerWin = true;
           for(int i = 0; i < movieName.length(); i++){
               if(guessedMovieName.charAt(i) == '_')
                   playerWin = false;
           }
        } else {
            findIt = false;
            for(int i = 0; i<wrongLetters.length();i++){
                if(wrongLetters.charAt(i) == newLetter){
                    System.out.println(newLetter+" it's already an incorrect letter.");
                    findIt = true;
                    break;
                }
            }
        }
        if(!findIt){
            wrongLetters += newLetter;
            wrongGuesses--;
        }
    }

    private String replpaceCharAt(String str, int index, char replaceChar){
        if(str == null){
            return str;
        } else if ( index<0 || index >= str.length()){
            return str;
        }
        char[] c = str.toCharArray();
        c[index] = replaceChar;
        return String.valueOf(c);
    }
}

