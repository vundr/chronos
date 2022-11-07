package org.vundr.chronos.bootstrapper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SonarCheckTest {

    private SonarCheck cut = new SonarCheck();

    @Test
    void test() {
        var string = cut.getString();

        assertEquals("string", string);
    }
}
