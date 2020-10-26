package demo;

public class Money {
        int amount;
        String currency ;

        public Money(int amount, String currency){
            this.amount = amount;
            this.currency = currency;
        }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    public Money add(Money that) {
        return new Money(this.amount+that.amount,this.currency);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
