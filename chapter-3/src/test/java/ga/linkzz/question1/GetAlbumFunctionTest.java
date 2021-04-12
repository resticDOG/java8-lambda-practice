package ga.linkzz.question1;

import ga.linkzz.domain.Album;
import ga.linkzz.domain.SampleData;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GetAlbumFunctionTest {

    @Test
    public void get() {
        List<Album> albums = GetAlbumFunction.get(SampleData.albums);
        assertEquals(1, albums.size());
    }
}