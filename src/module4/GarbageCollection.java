package module4;

public class GarbageCollection {
    protected void finalize() {
        System.out.println("The garbage collected");
    }

    public static void main(String[] args) {
        GarbageCollection obj1 = new GarbageCollection();
        GarbageCollection obj2 = new GarbageCollection();

        obj1 = null;
        obj2 = null;

        System.gc();
    }
}
