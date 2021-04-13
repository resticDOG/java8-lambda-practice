package ga.linkzz.question7;

import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.Assert.*;

public class MaxLowercaseStrTest {

    @Test
    public void get() {
        Optional<String> str = MaxLowercaseStr.get(Arrays.asList("Hello World", "BIG world", "Java8 LAMBDA"));
        str.ifPresent(s -> assertEquals("Hello World", s));
    }
}