package ToString;

@Tostring(value = "YES")
public class Example3 {
    @Tostring(value = "NO")
    private String exampleField;

    public Example3() {
    }

    public Example3(String exampleField) {
        this.exampleField = exampleField;
    }

    public String getExampleField() {
        return exampleField;
    }

    @Override
    public String toString() {
        return "аннотация с ToString: " + exampleField;
    }
}
