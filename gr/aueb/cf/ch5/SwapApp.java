package gr.aueb.cf.ch5;

public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.printf("a=%d, b=%d\n", a, b);
        int[] arr = swap(a, b);
//        swap(a, b);
//        System.out.printf("a=%d, b=%d", a, b);
//        System.out.printf("a=%d, b=%d", a, b);
        System.out.printf("a=%d, b=%d", arr[0], arr[1]);
    }

    /**
     * Mutually exchange the values of the two
     * input variables.
     * @param a the first input.
     * @param b the second input.
     */
//    public static void swap(int a, int b) {
//        int tmp = a;
//        a = b;
//        b = tmp;
//
//
//    }

//    public static void swap(int a, int b) {
//        int tmp = a;
//        a = b;
//        b = tmp;
//        System.out.printf("a=%d, b=%d", a, b);
//    }

    public static int[] swap(int a, int b) {
        int[] arr = new int[2];

        arr[0] = b;
        arr[1] = a;

        return arr;
    }
}
