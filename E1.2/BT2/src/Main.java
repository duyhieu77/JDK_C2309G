import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tiền gửi: ");
        double X = scanner.nextDouble();

        System.out.print("Nhập kỳ hạn gửi 6, 9, 12, 24, 36 tháng: ");
        int term = scanner.nextInt();

        double interestRate = 0;
        String termLabel = "";

        switch (term) {
            case 6:
                interestRate = 5.1 / 100;
                termLabel = "6 tháng";
                break;
            case 9:
                interestRate = 5.5 / 100;
                termLabel = "9 tháng";
                break;
            case 12:
                interestRate = 6.4 / 100;
                termLabel = "12 tháng";
                break;
            case 24:
                interestRate = 6.5 / 100;
                termLabel = "24 tháng";
                break;
            case 36:
                interestRate = 6.5 / 100;
                termLabel = "36 tháng";
                break;
            default:
                System.out.println("Error");
                scanner.close();
                return;
        }

        double interest = X * interestRate;

        double totalAmount = X + interest;

        System.out.printf("%.0f VNĐ %s%n", X, termLabel);
        System.out.printf("Tiền lãi theo kỳ: %.0f VNĐ%n", interest);
        System.out.printf("Lãi + Gốc: %.0f VNĐ%n", totalAmount);

        scanner.close();
    }
}