package Cache;

import Validate.Example4;

@Cache(value = {"value1", "value2", "value3"})
public class Example6 {
    private String first;
    private int second;
    private double third;

    public Example6(String first, int second, double third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public String getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public double getThird() {
        return third;
    }
}
