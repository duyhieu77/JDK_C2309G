import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tiền cần rút: ");
        int X = scanner.nextInt();

        if (X % 50000 != 0) {
            System.out.println("Số tiền cần rút phải là bội của 50.000 .");
        } else {

            int num500k = X / 500000;
            X %= 500000;

            int num200k = X / 200000;
            X %= 200000;

            int num100k = X / 100000;
            X %= 100000;

            int num50k = X / 50000;
            X %= 50000;

            int total = num500k + num200k + num100k + num50k;

            System.out.printf("%d Tờ 500  %d Tờ 200  %d Tờ 100 %d Tờ 50 Tổng số tờ %d",
                    num500k, num200k, num100k, num50k, total);

        }

        scanner.close();
    }
}