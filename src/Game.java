public class Game {

    //Objects
    static Board Board = new Board();
    static Player Player1 = new Player();
    static Player Player2 = new Player();
    static String[][] board = new String[3][3];

    public static boolean CheckWin() {
        int player1;
        int player2;
        //Checks for Positions Horizontally
        for (int i = 0; i < 3; i++) {
            player1 = 0;
            player2 = 0;
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals("B"))
                    player1 += 1;
                if (board[i][j].equals("G"))
                    player2 += 1;

                if(player1 == 3 || player2 == 3)
                    return true;
            }
        }
        //Checks for Positions Vertically
        for (int i = 0; i < 3; i++) {
            player1 = 0;
            player2 = 0;
            for (int j = 0; j < 3; j++) {
                if (board[j][i].equals("B"))
                    player1 += 1;
                if (board[j][i].equals("G"))
                    player2 += 1;

                if(player1 == 3 || player2 == 3)
                    return true;
            }
        }
        player1 = 0;
        player2 = 0;
        for (int i = 0; i < 3; i++) {
            if (board[i][i].equals("B"))
                player1 += 1;
            if (board[i][i].equals("G"))
                player2 += 1;

            if(player1 == 3 || player2 == 3)
                return true;
        }
        player1 = 0;
        player2 = 0;
        for (int i = 2; i >= 0; i--) {
            for(int j = 0; j < 3; j++) {
                if (board[i][j].equals("B"))
                    player1 += 1;
                if (board[i][j].equals("G"))
                    player2 += 1;

                if (player1 == 3 || player2 == 3)
                    return true;
            }
        }
        return false;
    }

    public static void Play(int player){
        Board.Draw(board);
        board = Board.Mark(board, Player1.Choose(), player);



    }
    public static void main(String[]args){
        board = Board.Clear(board);
        int player =0;
        do{
            Play(player+1);
            player+=1;
            player %= 2;
        }while(!CheckWin());
        Board.Draw(board);
    }

}
