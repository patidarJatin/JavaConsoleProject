import java.util.Scanner;

public class RockPaperScissor {

    public static int checkWinner(int user, int computer){
        if(user == computer) return 0;
        if((user == 1 && computer == 3) ||
                (user == 2 && computer == 1) ||
                (user == 3 && computer == 2))
            return 1;

        return 2;
    }

    public static void displayChoice(int number){
        switch (number) {
            case 1:
                System.out.println("You chose Number is. 1 : Rock");
                break;
            case 2:
                System.out.println("You chose Number is. 2 : Paper");
                break;
            case 3:
                System.out.println("You chose Number is. 3 : Scissor");
                break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Rock-Paper-Scissor Game : ");
        System.out.println("Rule of Game \n  Chose One Number as give Below ");
        System.out.println("  1.Rock \n  2.Paper \n  3.Scissor " );
        System.out.println("\n you have 5 time chose a number and then result is show");

        //userInput = userScore  and computerNumber = computerScore
        int userScore = 0;
        int computerScore = 0;

        int totalChance = 5;
        int count = 0;

        while(totalChance > count) {
            //user input

            System.out.println("Your "+(count+1)+"'s chance : ");
            System.out.print("Enter your Chose Number : ");


            if(!sc.hasNextInt()){
                System.out.println("Invalid Input");
                sc.next();
                continue;
            }
            int userInput = sc.nextInt();

            if(!(userInput>=1 && userInput <= 3 )){
                System.out.println("You chose a wrong Number Please chose a Correct Number : ");
                continue;
            }
            System.out.println();

            displayChoice(userInput);

            //computer random number between {1,2,3}
            System.out.println();

            int min = 1, max = 3;
            int computerNumber = min + (int) (Math.random() * (max - min + 1));
            //Random random = new Random(3);

            System.out.println("Computer Choice Random Number is :  " + computerNumber);

           displayChoice(computerNumber);

            int result = checkWinner(userInput, computerNumber);

            if(result == 0){
                System.out.println("Round Draw");
            }
            else if(result == 1){
                System.out.println("You Win This Round");
                userScore++;
            }
            else{
                System.out.println("Computer Wins This Round");
                computerScore++;
            }

            System.out.println("Score -> You : " + userScore + " Computer : " + computerScore);
            System.out.println();

         count++;
        }


        if (userScore > computerScore) {
            System.out.println("Congratulation : You is winner");
        } else if (userScore < computerScore) {
            System.out.println("You lost Game");
        } else {
            System.out.println("off Match is Draw");
        }
    }
}
