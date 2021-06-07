package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        int size = Math.abs (dest.getX() - position.getX());
        Cell[] steps = new Cell[size];
        int deltaX = isDiagonal(position, dest) ? (dest.getX() - position.getX()) / size : 0;
        int deltaY = isDiagonal(position, dest) ? (dest.getY() - position.getY()) / size : 0;
        int positionX = position.getX();
        int positionY = position.getY();
        for (int i = 0; i < size; i++) {
            int x = positionX + deltaX;
            int y = positionY + deltaY;
            steps[i] = Cell.findBy(x, y);
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return source.getX() != dest.getX() && source.getY() != dest.getY();
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
