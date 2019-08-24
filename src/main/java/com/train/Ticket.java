package com.train;

public class Ticket {
    private int amount;
    private int price;
    private int roundTrip;

    public Ticket(int amount, int roundTrip) {
        this.amount = amount;
        this.roundTrip = roundTrip;
        setPrice((amount - roundTrip) * 1000 + (int) (roundTrip * 2000 * 0.9));
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPrice() {
        return "Total tickets: " + price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRoundTrip() {
        return roundTrip;
    }

    public void setRoundTrip(int roundTrip) {
        this.roundTrip = roundTrip;
    }
}
