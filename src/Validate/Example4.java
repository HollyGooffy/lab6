package Validate;

@Validate(value = String.class)
public class Example4 {
    private String animal;
    private String name;

    public Example4(String animal, String name) {
        this.animal = animal;
        this.name = name;
    }

    public String getAnimal() {
        return animal;
    }

    public String getName() {
        return name;
    }

}
