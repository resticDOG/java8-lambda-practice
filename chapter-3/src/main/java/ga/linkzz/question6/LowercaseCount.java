package ga.linkzz.question6;

/**
 * 计算一个字符串中小写字母的个数（提示：参阅String对象的chars方法）
 * <p>
 * Created by Link.Zhang on 4/13/2021 7:47 PM
 **/
public class LowercaseCount {

    public static int get(String str) {
        if (str == null) {
            return 0;
        }
        return (int) str.chars()
                .filter(i -> i < 123 && i > 97)
                .count();
    }
}
