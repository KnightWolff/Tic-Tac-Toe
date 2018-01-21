public class Board {
    //Constructors

    public void Draw(String[][] Board) {
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(Board[i][j] + " ");
            }
        }
    }

    public String[][] Clear(String[][] Board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Board[i][j] = "_";
            }
        }
        return Board;
    }

    public String[][] Mark(String[][] Board, int Position, int Player) {
        String Mark;
        if (Player == 1) {
            Mark = "B";
        } else {
            Mark = "G";
        }
        int Row, Column;
        Row = (Position-1)/3;
        Column = (Position-1)%3;

        Board[Row][Column] = Mark;
        return Board;
    }
}

