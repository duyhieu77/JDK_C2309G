public class Main {
    public static void main(String[] args) {
        double ibal, damt, wamt;

        // Tạo tài khoản tiết kiệm với số dư ban đầu
        ibal = 1000.00;
        SavingsAccount savingsAccount = new SavingsAccount("SA001", ibal);
        System.out.println("Savings A/C: Initial Balance: $" + ibal);

        // Gửi tiền và rút tiền từ tài khoản tiết kiệm
        damt = 1600.00;
        savingsAccount.deposit(damt);
        wamt = 500.00;
        savingsAccount.withdraw(wamt);

        // In ra thông tin sau khi rút tiền
        System.out.println();

        // Tạo tài khoản vãng lai với số dư ban đầu
        ibal = 5000.00;
        CurrentAccount currentAccount = new CurrentAccount("CA001", ibal);
        System.out.println("Current A/C: Initial Balance: $" + ibal);

        // Gửi tiền và rút tiền từ tài khoản vãng lai
        damt = 2500.00;
        currentAccount.deposit(1000.00);
        currentAccount.withdraw(3000.00);

        // Thực hiện rút tiền không đủ số dư từ tài khoản tiết kiệm
        wamt = 6000.00;
        System.out.println("\nTry to withdraw: $" + wamt);
        savingsAccount.withdraw(wamt);
    }
}