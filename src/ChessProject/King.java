package ChessProject;

public class King extends ChessPiece {

    public King(String color) {
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

        if (!isKingMove(line, column, toLine, toColumn)) { return false; }

        if (isFriendChessPiece(chessBoard, toLine, toColumn)) { return false; }

        return !isUnderAttack(chessBoard, toLine, toColumn);
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(board.board[i][j] != null) {
                    if(!color.equals(board.board[i][j].getColor())) {
                        if(board.board[i][j].canMoveToPosition(board, i, j, line, column)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    private boolean isPositionOnBoard(ChessBoard chessBoard, int line, int column) {
        return chessBoard.checkPos(line) && chessBoard.checkPos(column);
    }

    private boolean isItself(int line, int column, int toLine, int toColumn) {
        return line == toLine && column == toColumn;
    }

    private boolean isKingMove(int line, int column, int toLine, int toColumn) {
        return (Math.abs(toLine - line) <= 1 && Math.abs(toColumn - column) <= 1);
    }

    private boolean isFriendChessPiece(ChessBoard chessBoard, int toLine, int toColumn) {
        return chessBoard.board[toLine][toColumn] != null && color.equals(chessBoard.board[toLine][toColumn].getColor());
    }

}
