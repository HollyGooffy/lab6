package Default;

@Default(value = Example2.class)
public class Example2 {
    @Default(value = String.class)
    private String defaultField;

    public Example2() {
        this.defaultField = "default";
    }

    public String getDefaultField() {
        return defaultField;
    }
}
