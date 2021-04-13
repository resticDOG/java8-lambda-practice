package ga.linkzz.question5;

import org.junit.Test;

import static org.junit.Assert.*;

public class IncAndGetTest {

    @Test
    public void getMemberCount() {
        int memberCount = IncAndGet.getMemberCount();
        assertEquals(1, memberCount);
    }
}