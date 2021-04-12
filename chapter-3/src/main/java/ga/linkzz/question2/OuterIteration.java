package ga.linkzz.question2;

import ga.linkzz.domain.Artist;

import java.util.List;
import java.util.stream.Stream;

/**
 * 将外部迭代转换成内部迭代
 * <p>
 * Created by Link.Zhang on 4/12/2021 8:47 PM
 **/
public class OuterIteration {

    public static int inner(List<Artist> artists) {
        int totalMembers = 0;
        for (Artist artist : artists) {
            Stream<Artist> members = artist.getMembers();
            totalMembers += members.count();
        }
        return totalMembers;
    }

    public static int outer(List<Artist> artists) {
        return Math.toIntExact(artists
                .stream()
                .mapToLong(a -> a.getMembers().count())
                .sum());

    }
}
