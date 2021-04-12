package ga.linkzz.question1;

import ga.linkzz.domain.Artist;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 编写一个函数，接受艺术家列表作为参数，返回一个字符串列表，其中包含艺术家的姓名和国籍
 * <p>
 * Created by Link.Zhang on 4/12/2021 6:00 PM
 **/
public class NameNationalityFunction {

    public static List<String> get(List<Artist> artists) {
        return artists.stream()
                .flatMap(a -> Stream.of(a.getName(), a.getNationality()))
                .collect(Collectors.toList());
    }
}
