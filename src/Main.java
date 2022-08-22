public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i = i + 1) {
            int v;
            if (i % 2 == 0)
                v = -1;
            else
                v = 1;

            System.out.println(v);
        }
    }
}