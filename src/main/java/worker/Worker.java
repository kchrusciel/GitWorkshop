package worker;

/**
 * Created by krzysztof.chrusciel on 2016-06-08.
 */
public class Worker {

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                '}';
    }
}
