import java.util.Arrays;

public class Board {
    static char[] game = new char[9];
    static String[] wins = new String[] {"]"};

    static void printBoard(char[] game){
        for (int i = 0; i<=8; i++){
            if (game[i] == 0){
                game[i] = ' ';
            }
        }
        System.out.printf("|0 %c|1 %c|2 %c|\n|3 %c|4 %c|5 %c|\n|6 %c|7 %c|8 %c|",
                game[0], game[1], game[2], game[3], game[4], game[5], game[6], game[7], game[8]);
    }

    static boolean checkBoard(int position, char[] game){
        if(game[position] == 'x' || game[position] == 'o'){
            System.out.println("Posição Inválida.");
            return true;
        }
        return false;
    }

    static boolean checkWins(char[] game){
        String sequence = Arrays.toString(game);
        if(game[0] != ' ' && game[0] == game[1] && game[1] == game[2]){
            System.out.println("Jogo ganho");
        } else if (game[3] != ' ' && game[3] == game[4] && game[4] == game[5]) {
            System.out.println("Jogo ganho");
        } else if (game[6] != ' ' && game[6] == game[7] && game[7] == game[8]) {
            System.out.println("Jogo ganho");
        } else if (game[0] != ' ' && game[0] == game[3] && game[3] == game[6]) {
            System.out.println("Jogo ganho");
        } else if (game[1] != ' ' && game[1] == game[4] && game[4] == game[7]) {
            System.out.println("Jogo ganho");
        } else if (game[2] != ' ' && game[2] == game[5] && game[5] == game[8]) {
            System.out.println("Jogo ganho");
        } else if (game[0] != ' ' && game[0] == game[4] && game[4] == game[8]) {
            System.out.println("Jogo ganho");
        } else if (game[2] != ' ' && game[2] == game[4] && game[4] == game[6]) {
            System.out.println("Jogo ganho");
        } else {
            return false;
        }
        return true;
    }
}
