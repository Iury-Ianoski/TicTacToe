public class Board {

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

    static char checkWins(char[] game) {
        int[][] winConditions = new int[][]{
                new int[]{0, 1, 2},
                new int[]{3, 4, 5},
                new int[]{6, 7, 8},
                new int[]{0, 3, 6},
                new int[]{1, 4, 7},
                new int[]{2, 5, 8},
                new int[]{0, 4, 8},
                new int[]{2, 4, 6}
        };
        for (int[] condition : winConditions) {
            if (game[condition[0]] == game[condition[1]] && game[condition[1]] == game[condition[2]] && game[condition[0]] != ' ') {
                return game[condition[0]];
            }
        }
        return ' ';
    }


}