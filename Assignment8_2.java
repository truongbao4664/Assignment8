import java.util.Scanner;

public class Assignment8_2 {
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();

        System.out.println("Chuỗi đảo ngược: " + reverseString(str));
        scanner.close();
    }
}
