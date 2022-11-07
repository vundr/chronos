package org.vundr.chronos.bootstrapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class IntegrationIT {

    @Autowired
    TestingClass cut;

    @Test
    void contextIsStarted() {
        var string = cut.getString();

        assertEquals("string", string);
    }
}