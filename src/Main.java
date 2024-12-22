import Cache.Example6;
import Default.Example2;
import Invoke.Example;
import ToString.Example3;
import Two.Example5;
import Validate.Example4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{

        /* Задание 2.1 */
        System.out.println("Задание 2.1 , Invoke ");
        Example example = new Example();
        example.exampleMethod();

        /* Задание 2.2 */
        System.out.println("Задание 2.2, Default ");
        Example2 example2 = new Example2();
        System.out.println("default " + example2.getDefaultField());

        /* Задание 2.3 */
        System.out.println("Задание 2.3, ToString ");
        Example3 example3 = new Example3();
        System.out.println("toString " + example3.getExampleField());

        /* Задание 2.4 */
        System.out.println("Задание 2.4, Validate ");
        Example4 example4 = new Example4("Tigr", "Вася");
        System.out.println("animal: " + example4.getAnimal());
        System.out.println("name: " + example4.getName());

        /* Задание 2.5 */
        System.out.println("Задание 2.5, Two");
        Example5 example5 = new Example5("first", 2);
        System.out.println("first: " + example5.getFirst());
        System.out.println("second: " + example5.getSecond());

        /* Задание 2.6 */
        System.out.println("Задание 2.6");
        Example6 example6 = new Example6("First", 2, 2.4);
        System.out.println("first: " + example6.getFirst());
        System.out.println("second: " + example6.getSecond());
        System.out.println("third: " + example6.getThird());

    }
}


