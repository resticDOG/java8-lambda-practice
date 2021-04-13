package ga.linkzz.question6;

import org.junit.Test;

import static org.junit.Assert.*;

public class LowercaseCountTest {

    @Test
    public void get() {
        int lowercaseCount = LowercaseCount.get("HEllo worLD!");
        assertEquals(lowercaseCount, 6L);
    }
}