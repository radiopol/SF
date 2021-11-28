package ChessProject;

public class Pawn extends ChessPiece {

    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() { return color; }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (!isPositionOnBoard(chessBoard, toLine, toColumn)) { return false; }

        if (isItself(line, column, toLine, toColumn)) { return false; }

        if (isMoveToAttack(line, column, toLine, toColumn)) {
            return !color.equals(chessBoard.board[toLine][toColumn].getColor());
        }

        if (color.equals("White")) {
            if (((toLine - line) == 2 && line == 1) || (toLine - line) == 1) {
                for (int i = line + 1; i <= toLine; i++) {
                    if (chessBoard.board[i][column] != null) { return false; }
                }
                return true;
            }
        } else {
            if (((toLine - line) == -2 && line == 6) || (toLine - line) == -1) {
                for (int i = line - 1; i >= toLine; i--) {
                    if (chessBoard.board[i][column] != null) { return false; }
                }
                return true;
            }
        }

        return false;
    }

    @Override
    public String getSymbol() { return "P"; }

    private boolean isPositionOnBoard(ChessBoard chessBoard, int line, int column) {
        return chessBoard.checkPos(line) && chessBoard.checkPos(column);
    }

    private boolean isItself(int line, int column, int toLine, int toColumn) {
        return line == toLine && column == toColumn;
    }

    private boolean isMoveToAttack(int line, int column, int toLine, int toColumn) {
        if (color.equals("White")) {
            return toLine - line == 1 && Math.abs(toColumn - column) == 1;
        } else return toLine - line == -1 && Math.abs(toColumn - column) == 1;
    }
}