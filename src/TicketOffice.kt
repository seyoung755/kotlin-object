class TicketOffice {
    private var amount: Long? = null
    private val tickets: MutableList<Ticket>? = null

    constructor(amount: Long, vararg tickets: Ticket) {
        this.amount = amount
        this.tickets?.addAll(tickets)
    }

    fun minusAmount(amount: Long) {
        this.amount = this.amount?.minus(amount)
    }

    fun plusAmount(amount: Long) {
        this.amount = this.amount?.plus(amount)
    }
}
