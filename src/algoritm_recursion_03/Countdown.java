package algoritm_recursion_03;

public class Countdown {

    private static void countdown(int i) {
        System.out.println(i);

        if (i <= 0) {
            return;
        } else {
            countdown(i - 1);
        }
    }

    public static void main(String[] args) {
        countdown(5);
    }
}
