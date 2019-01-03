public class Fatorial {
    public static int Recursive(int number) {
        if (number == 0) {
            return -1;
        }

        if (number == 1) {
            return 1;
        }

        if (number == 2) {
            return 2;
        }

        return Recursive(number - 1) * number;
    }
}