package car;

/**
 * Created by krzysztof.chrusciel on 2016-06-08.
 */
public class Car {

    private String name;
    private int value;

    public Car(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
