public class Money {
    private long dollars;
    private long cents;

    // Constructor to initialize Money from a double
    public Money(double amount) {
        dollars = (long) amount;
        cents = Math.round((amount - dollars) * 100);
    }

    // A Copy constructor
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // Add method
    public Money add(Money otherAmount) {
        long newCents = this.cents + otherAmount.cents;
        long newDollars = this.dollars + otherAmount.dollars;
        if (newCents >= 100) {
            newDollars += newCents / 100;
            newCents = newCents % 100;
        }
        return new Money(newDollars + newCents / 100.0);
    }

    // Subtract method
    public Money subtract(Money otherAmount) {
        long newCents = this.cents - otherAmount.cents;
        long newDollars = this.dollars - otherAmount.dollars;
        if (newCents < 0) {
            newDollars -= 1;
            newCents += 100;
        }
        return new Money(newDollars + newCents / 100.0);
    }

    // Compare method
    public int compareTo(Money otherObject) {
        if (this.dollars > otherObject.dollars || (this.dollars == otherObject.dollars && this.cents > otherObject.cents)) {
            return 1;
        } else if (this.dollars < otherObject.dollars || (this.dollars == otherObject.dollars && this.cents < otherObject.cents)) {
            return -1;
        } else {
            return 0;
        }
    }

    // Equals method
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Money money = (Money) otherObject;
        return dollars == money.dollars && cents == money.cents;
    }

    // ToString method
    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}
