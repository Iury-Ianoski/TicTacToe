import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira seu nome:");
        String nome = scan.nextLine();

        System.out.println("Escolha seu time:\nX ou O");
        char time = scan.nextLine().charAt(0);

        System.out.println("Insira seu nome:");
        String outroNome = scan.nextLine();

        Player player1 = new Player(nome, time, true, 0);

        if(player1.getTime() == 'x'){
            time = 'o';
        }else{
            time = 'x';
        }

        Player player2 = new Player(outroNome, time, false, 0);

        Game.gameMoves(player1, player2);

        System.out.printf("Vitorias de %s:%d\nVitorias de %s:%d\n", player1.getName(), player1.getWins(), player2.getName(), player2.getWins());

    }
}