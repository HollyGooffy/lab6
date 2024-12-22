package Default;

@Default(value = Example2.class)
public class Example2 {
    private String defaultField;

    public Example2() {
        this.defaultField = "default";
    }

    public String getDefaultField() {
        return defaultField;
    }
}
