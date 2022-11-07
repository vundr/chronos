package org.vundr.chronos.bootstrapper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
class UnitTest {

    @InjectMocks
    TestingClass cut;

    @Test
    void test() {
        var anInt = cut.getInt();

        assertEquals(1, anInt);
    }
}
