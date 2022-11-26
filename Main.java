import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 4, 6, 7, 9, 10, 12, 13, 14, 16, 17, 18, 19, 20};

        System.out.println("3 se encontra na lista? = " + (IntStream.of(a).anyMatch(x -> x == 3)));
        System.out.println("5 se encontra na lista? = " + (IntStream.of(a).anyMatch(x -> x == 5)));
        System.out.println("6 se encontra na lista? = " + (IntStream.of(a).anyMatch(x -> x == 6)));
      System.out.println("15 se encontra na lista? = " + (IntStream.of(a).anyMatch(x -> x == 15)));
      System.out.println("23 se encontra na lista? = " + (IntStream.of(a).anyMatch(x -> x == 23)));
 }
}