import java.util.*;
public class withoutloop {
    public static void main(String[] args) {
        Num(10);
    }

    public static void Num(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        Num(n - 1);
    }
}
