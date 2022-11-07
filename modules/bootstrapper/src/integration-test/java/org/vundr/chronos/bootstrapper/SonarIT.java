package org.vundr.chronos.bootstrapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SonarIT {

    @Autowired
    SonarItCheck cut;

    @Test
    void test() {
        var test = cut.test();

        assertEquals("string", test);
    }
}
