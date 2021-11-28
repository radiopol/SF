package ChessProject;

public class Horse extends ChessPiece {

    public Horse(String color) {
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

        if (!isHorseMove(line, column, toLine, toColumn)) { return false; }

        return !isFriendChessPiece(chessBoard, toLine, toColumn);
    }

    @Override
    public String getSymbol() {
        return "H";
    }

    private boolean isPositionOnBoard(ChessBoard chessBoard, int line, int column) {
        return chessBoard.checkPos(line) && chessBoard.checkPos(column);
    }

    private boolean isItself(int line, int column, int toLine, int toColumn) {
        return line == toLine && column == toColumn;
    }

    private boolean isHorseMove(int line, int column, int toLine, int toColumn) {
        return (Math.abs(toColumn - column) == 2 && Math.abs(toLine - line) == 1) ||
                (Math.abs(toColumn - column) == 1 && Math.abs(toLine - line) == 2);
    }

    private boolean isFriendChessPiece(ChessBoard chessBoard, int toLine, int toColumn) {
        return chessBoard.board[toLine][toColumn] != null && color.equals(chessBoard.board[toLine][toColumn].getColor());
    }
}
