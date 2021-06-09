package ru.job4j.chess;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import java.io.IOException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.black.KnightBlack;

public class LogicTest {

    @Test(expected = OccupiedCellException.class)
    public void whenLogicOccupiedEx() throws FigureNotFoundException, ImpossibleMoveException, OccupiedCellException{
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new KnightBlack(Cell.H6));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenImposibleEx() throws FigureNotFoundException, ImpossibleMoveException, OccupiedCellException{
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H5);
    }

    @Test(expected = FigureNotFoundException.class)
    public void whenLogicFigureNotEx() throws FigureNotFoundException, ImpossibleMoveException, OccupiedCellException{
        Logic logic = new Logic();
        logic.move(Cell.C1, Cell.H6);
    }




}