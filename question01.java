public class question01 {
    public static void main(String[] args) {
        int x = 100;
        Integer obj1 = Integer.valueOf(x);
        Integer obj2 = x;
        System.out.println("Initial value : " + x);
        System.out.println("After Conversion : " + obj1);
        System.out.println("At Last : " + obj2);
    }
}