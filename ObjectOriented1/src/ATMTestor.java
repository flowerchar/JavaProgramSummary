public class ATMTestor {

    public static void main(String[] args) {
        ATM atm = new ATM(1000, "admin1");
        atm.setAmount(10000);
        System.out.println(atm.getAmount());
    }
}
