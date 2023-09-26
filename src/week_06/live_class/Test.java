package week_06.live_class;

public class Test {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 6) {
            method1(i, 2); // i=6 num=2
            i++; // i=3
        }
    }

    public static void method1(int i, int num) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num *= 2; // num=8
        }
        System.out.println();
    }
}

// 2
// 2 4
// 2 4 8
// 2 4 8 16
// 2 4 8 16 32
// 2 4 8 16 32 64


