package homeWork4.chessboard;

import homeWork4.colours.Colours;

public class Chessboard {

    public static void writeChessBoard() {
        String[][] chessBoard = new String[7][7];
        for (int i = 1; i < chessBoard.length; i++) {
            for (int j = 1; j < chessBoard[1].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = Colours.ANSI_WHITE + '□' + Colours.ANSI_RESET;
                else chessBoard[i][j] = Colours.ANSI_BLACK + '■' + Colours.ANSI_RESET;
                System.out.print(" " + chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

}


