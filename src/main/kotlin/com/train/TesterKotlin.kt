package com.train

fun main() {
    print("Please enter number of tickets:")
    val totalTicket = readLine()!!.toInt()

    print("How many round-trip tickets:")
    val roundTripTicket = readLine()!!.toInt()

    val ticket = Ticket(totalTicket,roundTripTicket)
    println(ticket.price)
}

