package com.sfrancis;

import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFishTest {

    @Test
    public void testEncapsulationDemo() {
        assertEquals("Sk", Fish.getFishName());
    }

}
