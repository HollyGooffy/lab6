package Two;


@Two(first = "Example", second = 12)
public class Example5 {
    private String first;
    private int second;

    public Example5(String first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public String getFirst() {
        return first;
    }
}
