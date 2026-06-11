import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int Number = 1+(int)(100*Math.random());

        System.out.println(" > Rule of the Game give 7 chance to predicate a Number \n" +
                " > Number is between 1 to 100  ");

        int count = 0;

        while(7>count){

            System.out.print("Enter a Guess Number : ");

            int guess_Number = sc.nextInt();

            if(Number == guess_Number){
                System.out.println("Congratulation you win the Game");
                break;
            }else{
                if(guess_Number>Number){
                    System.out.println("Number is less than "+ guess_Number);
                }else{
                    System.out.println("Number is More than "+guess_Number);
                }
            }
            count++;
        }

        System.out.println(
                "You've exhausted all attempts. The correct number was: "
                        + Number);

        sc.close();

    }
}