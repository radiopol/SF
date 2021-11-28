package ChessProject;

public class Bishop extends ChessPiece {

    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() { return color; }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (!isPositionOnBoard(chessBoard, toLine, toColumn)) { return false; }

        if (isItself(line, column, toLine, toColumn)) { return false; }

        if (!isBishopMove(line, column, toLine, toColumn)) { return false; }

        return !isBarrierOnDirection(chessBoard, line, column, toLine, toColumn);
    }

    @Override
    public String getSymbol() { return "B"; }

    private boolean isPositionOnBoard(ChessBoard chessBoard, int line, int column) {
        return chessBoard.checkPos(line) && chessBoard.checkPos(column);
    }

    private boolean isItself(int line, int column, int toLine, int toColumn) {
        return line == toLine && column == toColumn;
    }

    private boolean isBishopMove(int line, int column, int toLine, int toColumn) {
        return Math.abs(toLine - line) == Math.abs(toColumn - column);
    }

    private boolean isFriendChessPiece(ChessBoard chessBoard, int toLine, int toColumn) {
        return chessBoard.board[toLine][toColumn] != null && color.equals(chessBoard.board[toLine][toColumn].getColor());
    }

    private boolean isBarrierOnDirection(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine > line && toColumn > column) {
            for (int i = line + 1, j = column + 1; i < toLine; i++, j++) {
                if (chessBoard.board[i][j] != null) { return true; }
            }
        } else if (toLine > line && toColumn < column) {
            for (int i = line + 1, j = column - 1; i < toLine; i++, j--) {
                if (chessBoard.board[i][j] != null) { return true; }
            }
        } else if (toLine < line && toColumn < column) {
            for (int i = line - 1, j = column - 1; i > toLine; i--, j--) {
                if (chessBoard.board[i][j] != null) { return true; }
            }
        } else {
            for (int i = line - 1, j = column + 1; i > toLine; i--, j++) {
                if (chessBoard.board[i][j] != null) { return true; }
            }
        }

        return isFriendChessPiece(chessBoard, toLine, toColumn);
    }
}
