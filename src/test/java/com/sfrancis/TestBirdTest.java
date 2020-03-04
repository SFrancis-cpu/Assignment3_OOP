package com.sfrancis;

import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBirdTest {

    @Test
    public void testEncapsulationDemo() {
        assertEquals("Sk", Bird.getBirdName());
    }

}
