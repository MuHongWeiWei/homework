package com

class Ticket(var amount: Int, var roundTrip: Int) {
    companion object {
        private const val ROUND_TRIP_PRICE = 2000
        private const val ONE_WAY = 1000
        private const val DISCOUNT = 0.9
    }

    fun getPrice() = "Total tickets: " + (amount - roundTrip) * ONE_WAY +
            (roundTrip.toDouble() * ROUND_TRIP_PRICE * DISCOUNT).toInt()
}