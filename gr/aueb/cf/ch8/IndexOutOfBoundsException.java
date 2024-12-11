package gr.aueb.cf.ch8;

public class IndexOutOfBoundsException {

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
