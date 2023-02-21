public class Main {
    public static void main(String[] args) {
        Accounts samsAccount = new Accounts("12345",0,"Samarth","samarth@xyz.com","123456789");

        samsAccount.DepositMoney(500);
        samsAccount.DepositMoney(1500);

        samsAccount.WithDrawMoney(100);
    }
}