import java.util.Scanner;
import java.util.Random;

public class ChauChau {
    public static void main (String args[]) {
        String name, food, mood, result = null , YN, answer2, CallofDuty;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter your name: ");
        name = scan.next();

        switch(name) {
            case "Chau":
                System.out.println("Hi Chauuuuuuuuuu :)");
                System.out.println("you kinda cute :O");
                System.out.println("waaaaaaaa");
                break;

            case "chau":
                System.out.println("Hi Chauuuuuuuuuu :)");
                System.out.println("you kinda cute :O");
                System.out.println("waaaaaaaa");
                break;

            case "sashimi":
                System.out.println("That's your nickname :p. HAIIIIII MY LITTLE SASHIMI. ABUDUABUUUWEEEEEEE");
                break;

            case "Sashimi":
                System.out.println("That's your nickname :p. HAIIIIII MY LITTLE SASHIMI. ABUDUABUUUWEEEEEEE");
                break;

            default:
                System.out.println("You're not Chau! who are you? :O ");
        }







        System.out.println("How are you today?\n. good\n. bad\n. amazing\n. I wanna die");

        mood = scan.next();

        if(name.equalsIgnoreCase("Chau")) {

            switch (mood) {
                case "good":
                    System.out.println("that is great you are doing good Chau! :)");
                    break;

                case "bad":
                    System.out.println("why so sad? Cheer up!!!!!");
                    break;

                case "amazing":
                    System.out.println("yayyyyyyyyyyyyyy :p");
                    System.out.println("stay positive Chauuuuuu ");
                    break;

                default:
                    System.out.println("I feel ya its okay, we all feel that way sometimes, but we have each other" +
                            " so that makes life better right?");

            }

        }

        else if(name.equalsIgnoreCase("sashmi")) {
            switch (mood) {
                case "good":
                    System.out.println("that is great you are doing good sashimi! :)");
                    break;

                case "bad":
                    System.out.println("why so sad? Cheer up!!!!!");
                    break;

                case "amazing":
                    System.out.println("yayyyyyyyyyyyyyy :p");
                    System.out.println("stay positive sashimiiiiii ");
                    break;

                default:
                    System.out.println("I feel ya its okay, we all feel that way sometimes, but we have each other" +
                            " so that makes life better right?");

            }
        }

           else {
                switch (mood) {
                    case "good":
                        System.out.println("that is great you are doing good " + name + "!");
                        break;

                    case "bad":
                        System.out.println("why so sad? Cheer up!!!!!");
                        break;

                    case "amazing":
                        System.out.println("nice! ");
                        System.out.println("stay positive " + name + "!");
                        break;

                    default:
                        System.out.println("I feel ya its okay, we all feel that way sometimes, but we have each other" +
                                " so that makes life better right?");

                }
            }






        System.out.println("\nif you could be any animal in the world, what would you be? ");

        Scanner scan2 = new Scanner(System.in);


       String answer = scan2.next();


        if(answer.equalsIgnoreCase("panda")) {

            System.out.println("hehe pandas are really cute. lets go to the zoo soon! What makes you like pandas?");

            answer2 =scan2.next();


        }
        else if(answer.equalsIgnoreCase("pandas")) {

            System.out.println("hehe pandas are really cute. lets go to the zoo soon! What makes you like pandas?");

            answer2 =scan2.next();
        }


        else {
            System.out.println("I though you were going to say panda, :O Why do you choose that?");
            String answer3 = scan2.next();


        }

        System.out.println("That's great! ");

        System.out.println("Do you want to play rock paper scissors? ");
        YN= scan.nextLine();

do {
    System.out.println("Welcome to Rock Paper Scissors! ");
    System.out.println("How many rounds do you want to play?: ");
    int round = scan.nextInt();

    String[] Player = new String[round];

    int[] NPC = new int[round];


    for (int i = 0; i < Player.length; i++) {
        System.out.println("Round " + (i + 1) + ": What do you want to throw?: ");
        Player[i] = scan.next();
        NPC[i] = rand.nextInt(3) + 1;

        if (NPC[i] == 1) {
            System.out.println("Computer threw ROCK!");
        } else if (NPC[i] == 2) {
            System.out.println("Computer threw PAPER");
        } else if (NPC[i] == 3) {
            System.out.println("Computer threw SCISSORS");

        }

    }

    System.out.println("Game over...");
    System.out.println();
    System.out.println("Here's the recap:");

    for (int i = 0; i < round; i++) {

        if (Player[i].equalsIgnoreCase("Rock") && NPC[i] == 1 || Player[i].equalsIgnoreCase("Paper") && NPC[i] == 2 ||
                Player[i].equalsIgnoreCase("Scissors") && NPC[i] == 3) {

            result = "Tie on ";
        } else if (Player[i].equalsIgnoreCase("Rock") && NPC[i] == 2 || Player[i].equalsIgnoreCase("Paper") && NPC[i] == 3 ||
                Player[i].equalsIgnoreCase("Scissors") && NPC[i] == 1) {

            result = "Computer ";
        } else if (Player[i].equalsIgnoreCase("Rock") && NPC[i] == 3 || Player[i].equalsIgnoreCase("Paper") &&
                NPC[i] == 1 || Player[i].equalsIgnoreCase("Scissors") && NPC[i] == 2) {
            result = "Player won ";

        } else {
            result = "Invalid input on ";
        }
        System.out.println(result + "Round " + (i + 1));

    }
}
while(YN.equalsIgnoreCase("play game"));

        do {

            System.out.println("\nokay lets just talk then. what is your favorite food?");
            food = scan.next();


            if (food.equalsIgnoreCase("sashimi")) {
                System.out.println("I love sashimi because you got me addicted to it. lets get sashimi soon!");


            }
            else if(food.equalsIgnoreCase("chicken")) {
                System.out.println("so you're gonna eat me for dinner? I mean I don't mine but ma'am lol");
            }
            else {
                System.out.println("Why not sashimi, its really good! ");
            }
        }
        while(YN.equalsIgnoreCase("talk more"));

        System.out.println("\nMy baby chau-chau sleepy today?");
        Scanner scan3 = new Scanner(System.in);
        String YN2 = scan3.nextLine();

        if(YN2.equalsIgnoreCase("yes")) {

            System.out.println("awwwwieee honey! we can go cuddle later okay? <3");
        }
        else {
            System.out.println("yayyyyy!!! wanna play call of duty?");

        }
        CallofDuty = scan3.next();

       if(CallofDuty.equalsIgnoreCase("yes")) {
           System.out.println("lets play call of duty gamer gurl :)");
       }
       else {
           System.out.println("okay, we can play later or next time! ");
       }



        System.out.println("Lets play Minesweeper! In this game you will create a map. In the map you will have to hit a set amount of targets to win. " +
                "The mines in the map are random, so choose wisely. Have fun! ");

        // TODO Auto-generated method stub
        int x, y, mine, count = 0;
        char character;

                System.out.println("[Minesweeper - DOS Edition]");
                System.out.print("What is the grid size? ");

                Scanner sc =  new Scanner(System.in);

                int size = sc.nextInt();

                char[][] map = new char[size][size];

                int[] minemap = new int[size];

                for (int i = 0; i < size; i++) {
                    mine = rand.nextInt(size) + 1;
                    minemap[i] = mine;
                }

                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++ ) {

                        map[i][j] = '?';

                        System.out.print (map[i][j]);

                    }

                    System.out.println();

                }

                while (count != size ) {

                    System.out.print("Enter your X coordinate: ");
                    x = sc.nextInt();
                    System.out.print("Enter your Y coordinate: ");
                    y = sc.nextInt();
                    System.out.println();

                    int num = minemap[x];

                    if (y == num) {

                        map[y][x] = 'X';

                        for (int i = 0; i < size; i++) {

                            for (int j = 0; j < size; j++) {

                                System.out.print(map[i][j]);

                            }

                            System.out.println();
                        }

                        System.out.println("Sorry, you hit a mine!");
                        return;
                    }

                    else {

                        map[y][x] = '_';

                        for (int i = 0; i < size; i++) {

                            for (int j = 0; j < size; j++) {

                                System.out.print(map[i][j]);
                            }

                            System.out.println();

                        }
                    }


                    for (int i = 0; i < map.length; i++) {

                        for (int j = 0; j < map.length; j++) {

                            if (map[i][j] == '_') {

                                count += 1;
                            }
                        }
                    }

                    if (count != size) {
                        count = 0;
                    }

                }

                System.out.println ("You win! ");








        System.out.println("Have a amazing day!(cat emoji face)");

            System.out.println("abudabuweeeeeeeeeeeeeee");
            String test = "Chau";
        System.out.println(test.charAt(1));


    }
}
