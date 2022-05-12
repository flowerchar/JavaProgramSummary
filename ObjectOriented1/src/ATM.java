public class ATM {
    private int amount;
    private String  name ;

    public String getName() {
        return name;
    }

    public ATM(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    public int getAmount() {
        if (name != "lahei"){
            return amount;
        }
        return -999;
    }

    public void setAmount(int amount) {
        if (name=="admin" & amount>0){
            this.amount = amount;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

}
