package ga.linkzz.question7;

import ga.linkzz.question6.LowercaseCount;

import java.util.List;
import java.util.Optional;

/**
 * 7. 在一个字符串列表中，找出包含最多小写字母的字符串。对于空列表，返回Optional<String>对象
 * <p>
 * Created by Link.Zhang on 4/13/2021 8:10 PM
 **/
public class MaxLowercaseStr {

    public static Optional<String> get(List<String> strings) {
        long maxCount = strings.stream()
                .mapToLong(LowercaseCount::get)
                .max()
                .orElse(0);
        return strings.stream()
                .filter(str -> LowercaseCount.get(str) == maxCount)
                .findFirst();
    }
}
