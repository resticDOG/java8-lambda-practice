package ga.linkzz.question2;

import ga.linkzz.domain.Artist;
import ga.linkzz.domain.SampleData;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class OuterIterationTest {

    @Test
    public void inner() {
        List<Artist> threeArtists = SampleData.getThreeArtists();
        int outerSum = OuterIteration.outer(threeArtists);
        int innerSum = OuterIteration.inner(threeArtists);
        assertEquals(outerSum, innerSum);
    }
}