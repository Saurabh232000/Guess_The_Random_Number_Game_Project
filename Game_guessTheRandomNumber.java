import java.util.Random;
import java.util.Scanner;
public class Game_guessTheRandomNumber {
    private int comChoice;  // For Generating Random Number
    private int userInput; // For UserInput
    private int noOfGuess=0; // how many times did you take to guess
    public void userInput()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Guess The Number :");
        this.userInput=sc.nextInt();
    }
    public void isCorrect()
    {
        noOfGuess++;
        if(comChoice==userInput)
        {
            System.out.println(" You guess Right"+" " +noOfGuess +" "+" times.........");
        }
        else if(userInput < comChoice)
        {
            System.out.println(" too low");
        }
        else
        {
            System.out.println(" too high");
        }
    }
    public static void main(String[] args) {
       Game_guessTheRandomNumber gm=new Game_guessTheRandomNumber();
        Random r =new Random();   // Generating Random Number
        gm.comChoice=r.nextInt(100);
        boolean b= true;
        while (b) {
            gm.userInput();
            gm.isCorrect();
        }
    }
}
