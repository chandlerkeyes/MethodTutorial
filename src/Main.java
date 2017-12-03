public class Main {

    public static void main(String[] args) {
        System.out.println(Main.add(6,11));
        System.out.println(Main.sub(10,20));
    }
    public static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }
    public static int sub(int x, int y) {
        int subtract = y - x;
        return subtract;
    }
}
