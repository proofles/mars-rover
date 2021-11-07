package com.company;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    CoordinateTest.class,
    DirectionTest.class,
    InstructionTest.class,
    RoverTest.class,
    InputUtilTest.class,
    PlateauTest.class,
    ExceptionTest.class
})
public class MarsRoverTestSuite extends BaseTest {

}
