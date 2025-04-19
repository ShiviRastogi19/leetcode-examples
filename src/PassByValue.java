public class PassByValue {
    public static void changeValue(int x) {
        x = 10;
    }

    public static void main(String[] args) {
        int a = 5;
        changeValue(a);
        System.out.println(a);  // Output: 5
    }
}
