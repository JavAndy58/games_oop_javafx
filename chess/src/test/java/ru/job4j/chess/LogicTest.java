package ru.job4j.chess;

import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test
    public void whenFigureNot() throws OccupiedCellException, ImpossibleMoveException, FigureNotFoundException{
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        try {
            logic.move(Cell.C1, Cell.H6);
        } catch (OccupiedCellException ex) {
            Assert.assertNotEquals("", ex.getMessage());
        } catch (ImpossibleMoveException ei) {
            Assert.assertNotEquals("", ei.getMessage());
        } catch (FigureNotFoundException ef) {
            Assert.assertNotEquals("", ef.getMessage());
        }
    }
}