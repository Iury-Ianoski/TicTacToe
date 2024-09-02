import java.util.Random;
import java.util.Scanner;

public class Game {
    static Scanner scan = new Scanner(System.in);
    static char simbolo;

    static void gameMoves(Player player1, Player player2) {
        char[] game = new char[9];
        for (int i = 0; i<=8; i++){
            if(i%2==0 & player1.isPlaysFirst()){
                simbolo = player1.getTime();
            } else if(i%2==0 & player2.isPlaysFirst()) {
                simbolo = player2.getTime();
            }
            Board.printBoard(game);
            System.out.println("\nSelecione a casa no tabuleiro em que você deseja jogar:");
            int position = scan.nextInt();
            if(Board.checkBoard(position, game)){
                i--;
            }
            game[position] = simbolo;
            System.out.println(game[i]);
            boolean winCondition = Board.checkWins(game);
            if (winCondition){
                if (simbolo == player1.getTime()){
                    player1.setWins(player1.getWins() + 1);
                } else {
                    player2.setWins(player2.getWins() + 1);
                }
                System.out.println("Deseja jogar novamente?\n1. Sim\n2. Não");
                int wantRematch = scan.nextInt();
                if (wantRematch == 1){
                    Game.rematch(true, player1, player2);
                }
                break;
            }
        }
    }

    static void rematch(boolean wantRematch, Player player1, Player player2){
        if(wantRematch){
            player1.setPlaysFirst(false);
            player2.setPlaysFirst(true);
            gameMoves(player1, player2);
        }
    }
}
