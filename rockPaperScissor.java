
import java.util.Scanner;
import java.util.Random;
    public class rockPaperScissor {


        public static void main(String[] args) {
            int userChoice,computerChoice,rock,paper,scissors;
            Scanner input=new Scanner(System.in);
            Random rnd=new Random();
            rock=0;
            paper=1;
            scissors=2;

            System.out.println("ROCK-PAPER-SCISSORS GAME");
            System.out.println("enter your choice(0=rock,1=paper,2=scissors)");

            userChoice=input.nextInt();
            while(userChoice>2){
                System.out.println("give number between 0 and 2");
                userChoice=input.nextInt();

            }
            if(userChoice==rock){
                System.out.println("user chose Rock");
            }
            else{
                if(userChoice==paper){
                    System.out.println("user chose PAPER");
                }
                else{
                    System.out.println("user chose SCISSORS");
                }
                computerChoice=rnd.nextInt(3);
                if(computerChoice==rock){
                    System.out.println("computer chose ROCK");
                }
                else
                {
                    if(computerChoice==paper){
                    System.out.println("computer chose PAPER");
                }
            else{
                    System.out.println("computer chose SCISSORS");
                }
            }
            while(userChoice==computerChoice){
                System.out.println("draw try again");

                userChoice=input.nextInt();
                while(userChoice>2){
                    System.out.println("give no between 0 and 2");
                    userChoice=input.nextInt();
                }
                computerChoice=rnd.nextInt(3);
                //draw user section
                if(userChoice==rock){
                    System.out.println("user chose ROCK ");
                }
                else{
                    if(userChoice==paper){
                        System.out.println("user chose PAPER");
                    }
                    else{
                        System.out.println("user chose SCISSOR");
                    }

                }
                if(computerChoice==rock){
                    System.out.println("computer chose ROCK");
                }
                else{
                    if(computerChoice==paper){
                        System.out.println("computer chose PAPER");
                    }
                    else{
                        System.out.println("computer chose SCISSORS");
                    }
                }
            }
            //results
                if(computerChoice==rock)
                {
                    if(userChoice==paper)
                    {
                        System.out.println("user wins!");
                    }
                    else
                    {
                        System.out.println("computer wins!");
                    }
                }
                else if(computerChoice==paper)
                {
                    if(userChoice==rock){
                        System.out.println("computer wins!");
                    }
                   else
                   {
                        System.out.println("user wins!");
                    }}
                   else if(userChoice==rock)
                   {
                    System.out.println("user wins!");
                  }
                   else{
                    System.out.println("computer wins!");
                }


        }
    }

}
