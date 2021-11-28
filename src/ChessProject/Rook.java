package ChessProject;

public class Rook extends ChessPiece {

    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (!isPositionOnBoard(chessBoard, toLine, toColumn)) { return false; }

        if (isItself(line, column, toLine, toColumn)) { return false; }

        if (!isRockMove(line, column, toLine, toColumn)) { return false; }

        return !isBarrierOnDirection(chessBoard, line, column, toLine, toColumn);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    private boolean isPositionOnBoard(ChessBoard chessBoard, int line, int column) {
        return chessBoard.checkPos(line) && chessBoard.checkPos(column);
    }

    private boolean isItself(int line, int column, int toLine, int toColumn) {
        return line == toLine && column == toColumn;
    }

    private boolean isRockMove(int line, int column, int toLine, int toColumn) {
        return (line == toLine && Math.abs(toColumn - column) > 0) ||
                (column == toColumn && Math.abs(toLine - line) > 0);
    }

    private boolean isFriendChessPiece(ChessBoard chessBoard, int toLine, int toColumn) {
        return chessBoard.board[toLine][toColumn] != null && color.equals(chessBoard.board[toLine][toColumn].getColor());
    }

    private boolean isBarrierOnDirection(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine > line) {
            for (int i = line + 1; i < toLine; i++) {
                if (chessBoard.board[i][column] != null) { return true; }
            }
        } else if (toLine < line) {
            for (int i = line - 1; i > toLine; i--) {
                if (chessBoard.board[i][column] != null) { return true; }
            }
        } else if (toColumn > column) {
            for (int j = column + 1; j < toColumn; j++) {
                if (chessBoard.board[line][j] != null) { return true; }
            }
        } else {
            for (int j = column - 1; j > toColumn; j--) {
                if (chessBoard.board[line][j] != null) { return true; }
            }
        }

        return isFriendChessPiece(chessBoard, toLine, toColumn);
    }

}
