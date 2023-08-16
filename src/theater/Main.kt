package theater

import java.time.LocalDateTime

fun main() {
    val ticketOffice = TicketOffice(0, Ticket(1000), Ticket(2000))
    val ticketSeller = TicketSeller(ticketOffice)
    val aud1 = Audience(Bag(1000))
    val aud2 = Audience(Bag(0, Invitation(LocalDateTime.now())))
    val theater = Theater(ticketSeller)
    theater.enter(aud1)
    theater.enter(aud2)
}
