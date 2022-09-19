package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PythagoreanTheoremTest {

    @Test
    void shouldCheckTriangleWithRightAngle() {
        var isRightAngle = new PythagoreanTheorem();
        assertTrue(PythagoreanTheorem.isRight(3, 4, 5));
    }
}