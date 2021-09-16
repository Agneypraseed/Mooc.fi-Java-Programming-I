
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money n = new Money(this.euros + addition.euros(), this.cents + addition.cents());
        return n;
    }

    public boolean lessThan(Money compared) {
        if (this.euros > compared.euros()) {
            return false;
        } else if (this.euros == compared.euros() && this.cents > compared.cents()) {
            return false;
        } else if (this.euros == compared.euros() && this.cents < compared.cents()) {
            return true;
        } else {
            return true;
        }
    }

    public Money minus(Money decreaser) {
        if (this.lessThan(decreaser)) {
            Money z = new Money(0, 0);
            return z;
        } else if (this.cents() > decreaser.cents()) {
            Money n = new Money(this.euros() - decreaser.euros(), this.cents() - decreaser.cents());
            return n;
        }else{
            int c=this.cents();
            c+=100;
            c=c-decreaser.cents();
            Money n = new Money(this.euros() - decreaser.euros()-1,c);
            return n;
        }
    }

}
