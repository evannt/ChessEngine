package gui;

import chess.Position;

public interface ChessGui {

	public void setBoardPosition(Position position);

	public void setSelectedSquare(int square);

	public void reqeustPiecePromotion();

}
