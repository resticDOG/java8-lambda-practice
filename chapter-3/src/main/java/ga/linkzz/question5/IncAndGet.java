package ga.linkzz.question5;

import ga.linkzz.domain.SampleData;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 纯函数
 * <p>
 * Created by Link.Zhang on 4/13/2021 7:32 PM
 **/
public class IncAndGet {

    public static int getMemberCount() {
        AtomicInteger count = new AtomicInteger(0);
        SampleData.aLoveSupreme
                .getMusicians()
                .forEach(musician -> count.incrementAndGet());
        return count.get();
    }

}
