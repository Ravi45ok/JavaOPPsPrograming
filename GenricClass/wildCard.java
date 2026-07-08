
class Box<T> {
    T value;

    Box(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }

    void set(T value) {
        this.value = value;
    }
}

public class wildCard {

    public static void main(String[] args) {
        // ! <?> — Completely Unknown Type
        Box<?> box = new Box<String>("Hello");
        Object obj = box.get(); // * ✅ allowed. its return type will be object not String because can be any
                                // type.
        box.set(null); // * ✅ only null allowed , because null can be assign to any type
        // *box.set("Hi"); // ❌ we don't know the box type
        // *box.set(10); // ❌
        // !<? extends Number> — Upper Bounded Wildcard
        Box<? extends Number> box1 = new Box<Integer>(10);
        Number n = box1.get(); // * ✅ allowd and return type will be number because it extends number
        // *box.set(20); // ❌ not allowed it might be Integer type or Double type we
        // don't know that
        // !<? super Integer> — Lower Bounded Wildcard
        Box<? super Integer> box2 = new Box<Number>(10);
        box2.set(20); // * ✅ allowed Because Integer is valid for all possible types above.
        Object obj1 = box2.get(); // * */ only Object is safe

        /*
         * If you only read → use extends
         * If you only write → use super
         */

    }
}
