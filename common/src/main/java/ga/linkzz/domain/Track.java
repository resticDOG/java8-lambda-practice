package ga.linkzz.domain;

/**
 * Created by Link.Zhang on 4/12/2021 7:57 PM
 **/
public class Track {
    private final String name;
    private final int length;

    public Track(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public Track copy() {
        return new Track(name, length);
    }
}
