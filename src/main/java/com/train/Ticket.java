package com.train;

public class Ticket {
    private static final int ROUND_TRIP_PRICE = 2000;
    private static final int ONE_WAY = 1000;
    private static final double DISCOUNT = 0.9;
    private int totalTicket;
    private int roundTripTicket;
    private int price;

    public Ticket(int totalTicket, int roundTripTicket) {
        this.totalTicket = totalTicket;
        this.roundTripTicket = roundTripTicket;
        setPrice((totalTicket - roundTripTicket) * ONE_WAY + (int) (roundTripTicket * ROUND_TRIP_PRICE * DISCOUNT));
    }

    public int getTotalTicket() {
        return totalTicket;
    }

    public void setTotalTicket(int totalTicket) {
        this.totalTicket = totalTicket;
    }

    public String getPrice() {
        return "Total tickets: " + price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRoundTripTicket() {
        return roundTripTicket;
    }

    public void setRoundTripTicket(int roundTripTicket) {
        this.roundTripTicket = roundTripTicket;
    }
}
