public class Print_num {
    public static void main(String[] args) {
        int o = 1;
        printNumber(o);
    }

    public static void printNumber(int i) {
        if (i<=100) {
            System.out.println(i);
            printNumber(i + 1);
        }
    }
}
