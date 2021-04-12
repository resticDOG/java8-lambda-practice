package ga.linkzz.question1;

import ga.linkzz.domain.Artist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class NameNationalityFunctionTest {

    @Test
    public void get() {
        Artist artist1 = new Artist("张三", "中国");
        Artist artist2 = new Artist("李四", "日本");
        List<Artist> artists = Arrays.asList(artist1, artist2);
        List<String> nameAndNationalities = NameNationalityFunction.get(artists);
        String nns = String.join(",", nameAndNationalities);
        Assert.assertEquals("张三,中国,李四,日本", nns);
    }
}