public class GenericsMethods {
    private static <T, V> void shout (T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!");
        System.out.println(otherThingToShout + "!!");
    }

    public static void main(String[] args) {
        shout("John", 74);
        shout("Casey", 67);
    }
}
