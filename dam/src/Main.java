import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an int number (a)");
        int a = scanner.nextInt();
        System.out.println("Enter a byte number (b)");
        byte b = scanner.nextByte();
        System.out.println("Enter a short number (c)");
        short c = scanner.nextShort();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a + c = " + (a + c));
        System.out.println("a - c = " + (a - c));
        System.out.println("a * c = " + (a * c));
        System.out.println("a / c = " + (a / c));
        System.out.println("b + c = " + (b + c));
        System.out.println("b - c = " + (b - c));
        System.out.println("b * c = " + (b * c));
        System.out.println("b / c = " + (b / c));

        int t = metod(2, 3);
        System.out.println(t);
    }
    public static int metod(int x, int y){
        int z =  x * y-3;
        return z;
    }
}
