package ga.linkzz.question1;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

public class AddUpTest {

    @Test
    public void addUp() {
        int sum = AddUp.addUp(Stream.of(1, 2, 5, 7));
        Assert.assertEquals(15, sum);
    }
}