public class Fibonacci {
    public static void LoopVersion(int howMany) {
        Integer previous = 0;
        Integer current = 1;

        /**
         * This line below is just to show the first 'zero'
         */
        System.out.println(previous);

        for (int i = 2; i <= howMany; i++) {
            System.out.println(current);

            int aux = current;
            /**
             * gorda, in the line below you can also do `current += previous;` instead
             * it works at the same way
             */
            current = previous + current;
            previous = aux;
        }
    }

    public static int RecursionVersion(int position) {
        if (position == 0) {
            return 0;
        }

        if (position == 1 || position == 2) {
            return 1;
        }

        return RecursionVersion(position - 2) + RecursionVersion(position - 1);
    }
}