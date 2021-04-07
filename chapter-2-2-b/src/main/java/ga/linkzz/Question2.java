package ga.linkzz;

import java.text.ParseException;

/**
 * DateFormatter类是非线程安全的。使用构造函数创建一个线程安全的DateFormatter对象，并输出日期，如“01-Jan-1970”。
 *
 */
public class Question2 {
    public static void main( String[] args ) throws ParseException {
        ThreadLocalDateFormatter formatter = new ThreadLocalDateFormatter();
        String date = formatter.getDate();
        System.out.println(date);
    }
}
