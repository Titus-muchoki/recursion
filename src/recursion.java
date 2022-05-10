public class recursion {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int l) {
        if (l > 0) {
            return l + sum(l-1);
        }else {
            return 0;
        }
    }
}
