package ga.linkzz.question1;

import ga.linkzz.domain.Album;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 编写一个函数，接受专辑列表作为参数，返回一个由最多包含3首歌曲的专辑组成的列表。
 * <p>
 * Created by Link.Zhang on 4/12/2021 8:30 PM
 **/
public class GetAlbumFunction {

    public static List<Album> get(Stream<Album> albums) {
        return albums
                .filter(a -> a.getTrackList().size() < 4)
                .collect(Collectors.toList());
    }
}
