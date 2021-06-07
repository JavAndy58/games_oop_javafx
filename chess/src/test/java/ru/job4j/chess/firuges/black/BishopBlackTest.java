package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;


public class BishopBlackTest {

    @Test
    public void whenPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell cell = bishopBlack.position();
        assertThat(Cell.A1, is(cell));
    }

    @Test
    public void whenCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Figure bishopBlack1 = bishopBlack.copy(Cell.A2);
        assertThat(Cell.A2, is(bishopBlack1.position()));
    }

    @Test
    public void whenWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] steps = bishopBlack.way(Cell.G5);
        Cell[] steps2 = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(steps, is(steps2));
    }

    @Test
    public void whenWayException() {
        BishopBlack bishopBlack1 = new BishopBlack(Cell.C1);
        BishopBlack bishopBlack2 = new BishopBlack(Cell.C2);
        boolean result = bishopBlack1.isDiagonal(bishopBlack1.position(), bishopBlack2.position());
        assertThat(result, is(false));
    }
}
