package ga.linkzz.question2;

import java.util.stream.Stream;

/**
 * 编写一个求和函数，计算流中所有数之和
 * <p>
 * Created by Link.Zhang on 4/12/2021 4:32 PM
 **/
public class AddUp {

    public static int addUp(Stream<Integer> numbers) {
        int sum = 0;
        if (numbers == null) {
            return 0;
        }
        return numbers.reduce(sum, Integer::sum);
     }

}
