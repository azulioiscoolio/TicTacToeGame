import java.util.*;

public class TicTacToe {
    private static Random random = new Random();
    private HashSet<Integer> spacesTaken;
    private HashSet<Integer> playerMoves;
    private HashSet<Integer> botMoves;

    private ArrayList<StringBuilder> board;


    {
        newBoard();
    }

    private void newBoard(){
        board = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            if(i % 2 == 0){
                board.add(new StringBuilder("   |   |   "));
            }else{
                board.add(new StringBuilder("-----------"));
            }
            System.out.println(board.get(i));
        }
        spacesTaken = new HashSet<>();
        playerMoves = new HashSet<>();
        botMoves = new HashSet<>();


        playerTurn();
    }

    private void printBoard(){
        for (StringBuilder s : board) {
            System.out.println(s);
        }
    }

    public boolean isGameOver(String player){
        if(player.equals("player")){
            boolean combo1 = playerMoves.contains(1) && playerMoves.contains(2) && playerMoves.contains(3);
            boolean combo2 = playerMoves.contains(4) && playerMoves.contains(5) && playerMoves.contains(6);
            boolean combo3 = playerMoves.contains(7) && playerMoves.contains(8) && playerMoves.contains(9);
            boolean combo4 = playerMoves.contains(1) && playerMoves.contains(4) && playerMoves.contains(7);
            boolean combo5 = playerMoves.contains(5) && playerMoves.contains(2) && playerMoves.contains(8);
            boolean combo6 = playerMoves.contains(3) && playerMoves.contains(6) && playerMoves.contains(9);
            boolean combo7 = playerMoves.contains(1) && playerMoves.contains(5) && playerMoves.contains(9);
            boolean combo8 = playerMoves.contains(7) && playerMoves.contains(5) && playerMoves.contains(3);

            if(combo1 || combo2 || combo3 || combo4 || combo5 || combo6 || combo7 || combo8){
                System.out.println("You Win!");
                return true;
            }

        }else if(player.equals("bot")){
            boolean combo1 = botMoves.contains(1) && botMoves.contains(2) && botMoves.contains(3);
            boolean combo2 = botMoves.contains(4) && botMoves.contains(5) && botMoves.contains(6);
            boolean combo3 = botMoves.contains(7) && botMoves.contains(8) && botMoves.contains(9);
            boolean combo4 = botMoves.contains(1) && botMoves.contains(4) && botMoves.contains(7);
            boolean combo5 = botMoves.contains(5) && botMoves.contains(2) && botMoves.contains(8);
            boolean combo6 = botMoves.contains(3) && botMoves.contains(6) && botMoves.contains(9);
            boolean combo7 = botMoves.contains(1) && botMoves.contains(5) && botMoves.contains(9);
            boolean combo8 = botMoves.contains(7) && botMoves.contains(5) && botMoves.contains(3);

            if(combo1 || combo2 || combo3 || combo4 || combo5 || combo6 || combo7 || combo8){
                System.out.println("You Lose!");
                return true;
            }
        }

        return false;
    }

    public void playerTurn(){
        if(spacesTaken.size() >= 6){
            if(isGameOver("bot")){
                System.out.println("Would you like to play again?");
                Scanner scan = new Scanner(System.in);
                String ans = scan.nextLine();
                ans = ans.toLowerCase();

                if(ans.equals("yes")){
                    newBoard();
                }else{
                    System.out.println("Goodbye!");
                    System.exit(0);
                }
            }
        }
            Scanner scan = new Scanner(System.in);
            System.out.println("Where do you want to play? 1 - 9");

            boolean loop = true;
            while(loop){

                String ans = scan.nextLine();
                switch(ans){
                    case "1":
                        if(board.get(0).substring(0,3).equals("   ")){
                            board.get(0).replace(1,2,"X");
                            loop = false;
                            spacesTaken.add(1);
                            playerMoves.add(1);
                        }else{
                            System.out.println("Spot Taken, Try Again:");
                            continue;
                        }
                        break;
                    case "2":
                        if(board.get(0).substring(4,7).equals("   ")){
                            board.get(0).replace(5,6,"X");
                            loop = false;
                            spacesTaken.add(2);
                            playerMoves.add(2);
                        }else{
                            System.out.println("Spot Taken, Try Again:");
                            continue;
                        }
                        break;
                    case "3":
                        if(board.get(0).substring(8,11).equals("   ")){
                            board.get(0).replace(9,10,"X");
                            loop = false;
                            spacesTaken.add(3);
                            playerMoves.add(3);
                        }else{
                            System.out.println("Spot Taken, Try Again:");
                            continue;
                        }
                        break;
                    case "4":
                        if(board.get(2).substring(0,3).equals("   ")){
                            board.get(2).replace(1,2,"X");
                            loop = false;
                            spacesTaken.add(4);
                            playerMoves.add(4);
                        }else{
                            System.out.println("Spot Taken, Try Again:");
                            continue;
                        }
                        break;
                    case "5":
                        if(board.get(2).substring(4,7).equals("   ")){
                            board.get(2).replace(5,6,"X");
                            loop = false;
                            spacesTaken.add(5);
                            playerMoves.add(5);
                        }else{
                            System.out.println("Spot Taken, Try Again:");
                            continue;
                        }
                        break;
                    case "6":
                        if(board.get(2).substring(8,11).equals("   ")){
                            board.get(2).replace(9,10,"X");
                            loop = false;
                            spacesTaken.add(6);
                            playerMoves.add(6);
                        }else{
                            System.out.println("Spot Taken, Try Again:");
                            continue;
                        }
                        break;
                    case "7":
                        if(board.get(4).substring(0,3).equals("   ")){
                            board.get(4).replace(1,2,"X");
                            loop = false;
                            spacesTaken.add(7);
                            playerMoves.add(7);
                        }else{
                            System.out.println("Spot Taken, Try Again:");
                            continue;
                        }
                        break;
                    case "8":
                        if(board.get(4).substring(4,7).equals("   ")){
                            board.get(4).replace(5,6,"X");
                            loop = false;
                            spacesTaken.add(8);
                            playerMoves.add(8);
                        }else{
                            System.out.println("Spot Taken, Try Again:");
                            continue;
                        }
                        break;
                    case "9":
                        if(board.get(4).substring(8,11).equals("   ")){
                            board.get(4).replace(9,10,"X");
                            loop = false;
                            spacesTaken.add(9);
                            playerMoves.add(9);
                        }else{
                            System.out.println("Spot Taken, Try Again:");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Invalid option, please try again");


                }
            }//end of while loop
            printBoard();
            botTurn();
    }


    public void botTurn() {
        if (spacesTaken.size() >= 5) {
            if (isGameOver("player")) {
                System.out.println("Would you like to play again?");
                Scanner scan = new Scanner(System.in);
                String ans = scan.nextLine();
                ans = ans.toLowerCase();

                if(ans.equals("yes")){
                    newBoard();
                }else{
                    System.out.println("Goodbye!");
                    System.exit(0);
                }
            }
        }

        if(spacesTaken.size() == 9){
            System.out.println("Game ends as a tie!");
            return;
        }

        System.out.println("Bot is making their turn...");
        boolean first = true;

        if (spacesTaken.size() == 1) {
            if (board.get(2).substring(4, 7).equals("   ")) {
                board.get(2).replace(5, 6, "O");
                spacesTaken.add(5);
                botMoves.add(5);
                System.out.println("Bot places on spot 5");

                printBoard();
                playerTurn();
                first = false;
            }
        }
        if (first) {
            boolean loop = true;
            while (loop) {
                int choice = random.nextInt(10) + 1;
                String ans = Integer.toString(choice);
                switch (ans) {
                    case "1":
                        if (board.get(0).substring(0, 3).equals("   ")) {
                            board.get(0).replace(1, 2, "O");
                            loop = false;
                            spacesTaken.add(1);
                            botMoves.add(1);
                            System.out.println("Bot places on spot 1");
                        } else {
                            continue;
                        }
                        break;
                    case "2":
                        if (board.get(0).substring(4, 7).equals("   ")) {
                            board.get(0).replace(5, 6, "O");
                            loop = false;
                            spacesTaken.add(2);
                            botMoves.add(2);
                            System.out.println("Bot places on spot 2");
                        } else {
                            continue;
                        }
                        break;
                    case "3":
                        if (board.get(0).substring(8, 11).equals("   ")) {
                            board.get(0).replace(9, 10, "O");
                            loop = false;
                            spacesTaken.add(3);
                            botMoves.add(3);
                            System.out.println("Bot places on spot 3");
                        } else {
                            continue;
                        }
                        break;
                    case "4":
                        if (board.get(2).substring(0, 3).equals("   ")) {
                            board.get(2).replace(1, 2, "O");
                            loop = false;
                            spacesTaken.add(4);
                            botMoves.add(4);
                            System.out.println("Bot places on spot 4");
                        } else {
                            continue;
                        }
                        break;
                    case "5":
                        if (board.get(2).substring(4, 7).equals("   ")) {
                            board.get(2).replace(5, 6, "O");
                            loop = false;
                            spacesTaken.add(5);
                            botMoves.add(5);
                            System.out.println("Bot places on spot 5");
                        } else {
                            continue;
                        }
                        break;
                    case "6":
                        if (board.get(2).substring(8, 11).equals("   ")) {
                            board.get(2).replace(9, 10, "O");
                            loop = false;
                            spacesTaken.add(6);
                            botMoves.add(6);
                            System.out.println("Bot places on spot 6");
                        } else {

                            continue;
                        }
                        break;
                    case "7":
                        if (board.get(4).substring(0, 3).equals("   ")) {
                            board.get(4).replace(1, 2, "O");
                            loop = false;
                            spacesTaken.add(7);
                            botMoves.add(7);
                            System.out.println("Bot places on spot 7");
                        } else {
                            continue;
                        }
                        break;
                    case "8":
                        if (board.get(4).substring(4, 7).equals("   ")) {
                            board.get(4).replace(5, 6, "O");
                            loop = false;
                            spacesTaken.add(8);
                            botMoves.add(8);
                            System.out.println("Bot places on spot 8");
                        } else {
                            continue;
                        }
                        break;
                    case "9":
                        if (board.get(4).substring(8, 11).equals("   ")) {
                            board.get(4).replace(9, 10, "O");
                            loop = false;
                            spacesTaken.add(9);
                            botMoves.add(9);
                            System.out.println("Bot places on spot 19");
                        } else {
                            continue;
                        }
                        break;
                }
            }
            printBoard();
            playerTurn();
        }
    }


    public static void main(String[] args){
        TicTacToe game = new TicTacToe();
    }


}
