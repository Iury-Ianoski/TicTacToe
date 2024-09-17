import java.util.Scanner;

public class Game {
    static Scanner scan = new Scanner(System.in);
    static char simbolo;

    static void gameMoves(Player player1, Player player2) {
        char[] game = new char[9];
        for (int i = 0; i<=8; i++){
            simbolo = checkTime(player1, player2, i);
            Board.printBoard(game);
            System.out.println("\nSelecione a casa no tabuleiro em que você deseja jogar:");
            int position = scan.nextInt();
            if(Board.checkBoard(position, game)){
                i--;
            }
            game[position] = simbolo;
            System.out.println(game[i]);
            boolean resultado = scoreChanger(player1, player2, game);
            if (resultado){
                Board.printBoard(game);
                break;
            }
        }
    }

    static boolean scoreChanger(Player player1, Player player2, char[] game){
        char winCondition = Board.checkWins(game);
        if (winCondition != ' ') {
            if (winCondition == player1.getTime()) {
                player1.setWins(player1.getWins() + 1);
            } else {
                player2.setWins(player2.getWins() + 1);
            }
            return true;
        }
        return false;
    }

    static char checkTime(Player player1, Player player2, int i) {
        if(i%2==0 && player1.isPlaysFirst() || i%2!=0 && !player1.isPlaysFirst()){
            simbolo = player1.getTime();
        } else if(i%2==0 & player2.isPlaysFirst() || i%2!=0 && !player2.isPlaysFirst()) {
            simbolo = player2.getTime();
        }
        return simbolo;
    }

    static void rematch(Player player1, Player player2){
        player1.setPlaysFirst(false);
        player2.setPlaysFirst(true);
        gameMoves(player1, player2);
    }
}
