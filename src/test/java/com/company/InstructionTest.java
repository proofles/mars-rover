package com.company;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class InstructionTest extends BaseTest {

    @Test
    public void whenInstructionIsConstructedShortNamesAreEqual() {
        instruction = Instruction.MOVE;
        assertEquals(Instruction.MOVE.getShortName(), instruction.getShortName());
    }
}
