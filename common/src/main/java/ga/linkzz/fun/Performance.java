package ga.linkzz.fun;

import ga.linkzz.domain.Artist;

import java.util.stream.Stream;

public interface Performance {

    String getName();

    Stream<Artist> getMusicians();

    default Stream<Artist> getAllMusicians() {
        return getMusicians()
                .flatMap(a -> Stream.concat(Stream.of(a), a.getMembers()));
    }
}
