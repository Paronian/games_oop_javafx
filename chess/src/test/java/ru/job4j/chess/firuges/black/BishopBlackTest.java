package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.jupiter.api.Assertions.*;
//import static ru.job4j.chess.firuges.Cell.*;

class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishop = new BishopBlack(Cell.H6);
        Cell expected = Cell.H6;
        Cell position = bishop.position();
        assertThat(position).isEqualTo(expected);
    }

    @Test
   public void copy() {
       BishopBlack bishop = new BishopBlack(Cell.G7);
       Figure newObject = bishop.copy(Cell.H6);
       Cell expected = Cell.H6;
       assertThat(newObject.position()).isEqualTo(expected);
    }

    @Test
    public void way() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell[] result = bishop.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void notDiagonal() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell dest = Cell.G3;
        ImpossibleMoveException exception = assertThrows(
                ImpossibleMoveException.class,
                () -> {
                    bishop.way(dest);
                });
        assertThat(exception.getMessage()).isEqualTo(String.format("Could not move by diagonal from %s to %s", bishop.position(), dest ));
    }
}