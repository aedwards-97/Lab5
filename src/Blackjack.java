import java.util.Scanner;

public class Blackjack
{
    public static void main (String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        int playerHand = 0; // player hand
        int gameCount = 1; // game number
        int menuChoice = 1; // player selection
        double playerWins = 0;
        double dealerWins = 0;
        double tieGames = 0;
        int totalGames;


        System.out.println("START GAME #" + gameCount);
        System.out.println("");
        P1Random rng = new P1Random();


        while(menuChoice != 4)
        {
            if (menuChoice == 1)
            {
                int playerNumber = rng.nextInt(13) + 1; // A random number in range [1,13]

                switch (playerNumber)
                {
                    case 1:
                        System.out.println("Your card is a ACE!");
                        playerHand = playerHand + playerNumber;
                        System.out.println("Your hand is: " + playerHand);
                        break;

                    case 2:
                        System.out.println("Your card is a 2!");
                        playerHand = playerHand + playerNumber;
                        System.out.println("Your hand is: " + playerHand);
                        break;

                    case 3:
                        System.out.println("Your card is a 3!");
                        playerHand = playerHand + playerNumber;
                        System.out.println("Your hand is: " + playerHand);
                        break;

                    case 4:
                        System.out.println("Your card is a 4!");
                        playerHand = playerHand + playerNumber;
                        System.out.println("Your hand is: " + playerHand);
                        break;

                    case 5:
                        System.out.println("Your card is a 5!");
                        playerHand = playerHand + playerNumber;
                        System.out.println("Your hand is: " + playerHand);
                        break;

                    case 6:
                        System.out.println("Your card is a 6!");
                        playerHand = playerHand + playerNumber;
                        System.out.println("Your hand is: " + playerHand);
                        break;

                    case 7:
                        System.out.println("Your card is a 7!");
                        playerHand = playerHand + playerNumber;
                        System.out.println("Your hand is: " + playerHand);
                        break;

                    case 8:
                        System.out.println("Your card is a 8!");
                        playerHand = playerHand + playerNumber;
                        System.out.println("Your hand is: " + playerHand);
                        break;

                    case 9:
                        System.out.println("Your card is a 9!");
                        playerHand = playerHand + playerNumber;
                        System.out.println("Your hand is: " + playerHand);
                        break;

                    case 10:
                        System.out.println("Your card is a 10!");
                        playerHand = playerHand + playerNumber;
                        System.out.println("Your hand is: " + playerHand);
                        break;

                    case 11:
                        System.out.println("Your card is a JACK!");
                        playerHand = playerHand + 10;
                        System.out.println("Your hand is: " + playerHand);
                        break;

                    case 12:
                        System.out.println("Your card is a QUEEN!");
                        playerHand = playerHand + 10;
                        System.out.println("Your hand is: " + playerHand);
                        break;

                    case 13:
                        System.out.println("Your card is a KING!");
                        playerHand = playerHand + 10;
                        System.out.println("Your hand is: " + playerHand);
                        break;

                }

                if (playerHand == 21)
                {
                    System.out.println("");
                    System.out.println("BLACKJACK! You win!");
                    System.out.println("");
                    gameCount++;
                    System.out.println("START GAME #" + gameCount);
                    System.out.println("");
                    playerHand = 0;
                    menuChoice = 1;
                    playerWins++;
                    continue;
                }

                if (playerHand > 21)
                {
                    System.out.println("");
                    System.out.println("You exceeded 21! You lose.");
                    System.out.println("");
                    gameCount++;
                    System.out.println("START GAME #" + gameCount);
                    System.out.println("");
                    playerHand = 0;
                    menuChoice = 1;
                    dealerWins++;
                    continue;

                }
            }

            System.out.println(""); // MENU
            System.out.println("1. Get another card");
            System.out.println("2. Hold hand");
            System.out.println("3. Print statistics");
            System.out.println("4. Exit");
            System.out.println("");
            System.out.print("Choose an option: ");
            menuChoice = scnr.nextInt();
            System.out.println("");



            if (menuChoice == 2)
            {
                if (playerHand < 21)
                {
                    int dealerHand = rng.nextInt(11) + 16; // A random number in range [16,26]
                    System.out.println("Dealer's hand: " + dealerHand);
                    System.out.println("Your hand is: " + playerHand);
                    System.out.println("");

                    if (dealerHand > 21)
                    {
                        System.out.println("You win!");
                        gameCount++;
                        System.out.println("");
                        System.out.println("START GAME #" + gameCount);
                        System.out.println("");
                        playerHand = 0;
                        playerWins++;
                        menuChoice = 1;
                    }

                    if (dealerHand > playerHand && dealerHand < 21)
                    {
                        System.out.println("Dealer wins!");
                        System.out.println("");
                        gameCount++;
                        dealerWins++;
                        playerHand = 0;
                        System.out.println("START GAME #" + gameCount);
                        System.out.println("");
                        menuChoice = 1;
                    }



                    if (dealerHand == playerHand)
                    {
                        System.out.println("It's a tie! No one wins!");
                        System.out.println("");
                        gameCount++;
                        System.out.println("START GAME #" + gameCount);
                        System.out.println("");
                        playerHand = 0;
                        menuChoice = 1;
                        tieGames++;

                    }

                    if (dealerHand == 21)
                    {
                        System.out.println("Dealer wins!");
                        System.out.println("");
                        gameCount++;
                        System.out.println("START GAME #" + gameCount);
                        System.out.println("");
                        playerHand = 0;
                        menuChoice = 1;
                        dealerWins++;
                    }
                }
            }

            if (menuChoice < 1 || menuChoice > 4)
            {
                //System.out.println("");
                System.out.println("Invalid input!");
                System.out.println("Please enter an integer value between 1 and 4.");
            }

            if (menuChoice == 3)
            {
                System.out.println("Number of Player wins: " + (int)playerWins);
                System.out.println("Number of Dealer wins: " + (int)dealerWins);
                System.out.println("Number of tie games: " + (int)tieGames);
                totalGames = (int)(playerWins + dealerWins + tieGames);
                System.out.println("Total # of games played is: " + totalGames);
                System.out.println("Percentage of Player wins: " + ((playerWins / totalGames) * 100.0) + "%");
            }
        }
    }
}