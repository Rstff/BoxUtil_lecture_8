public class BoxUtil {
    public static <T> void copyFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        if (src.get() != null) {
            dest.put(src.get());
        } else {
            System.out.println("No element in the box!");
        }
    }

    public static <T extends Fruit> void copyFreshFruitFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        if (src.get() != null && src.get().isFresh()) {
            dest.put(src.get());
        } else {
            if (src.get() != null) {
                System.out.println("Fruit is not fresh!");
            } else {
                System.out.println("No fruit in the box!");
            }
        }
    }

    public static <T> void printElementFromTwoBoxes(final Box<Box<T>> box) {
        if (box.get().get() != null) {
            System.out.println(box.get().get().toString());
        } else {
            System.out.println("No element in the box!");
        }
    }

    public static void printElementFromBoxes(final Box<?> box) {
        if (box.get() != null && box.get() instanceof Box) {
            printElementFromBoxes((Box<?>) box.get());
        } else {
            if (box.get() != null) {
                System.out.println(box.get().toString());
            } else {
                System.out.println("No element in the box!");
            }
        }
    }
}