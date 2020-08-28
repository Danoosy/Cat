package algoritm_03_recursion;
// Обратный отсчет
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
