package ga.linkzz.question3;

/*
求值。根据Stream方法的签名，判断其是惰性求值还是及早求值。

a. boolean anyMatch(Predicate<? super T> predicate);
    返回值不是Stream 及早求值

b. Stream<T> limit(long maxSize);
    返回值为Stream 惰性求职

 */