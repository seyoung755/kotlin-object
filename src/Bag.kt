class Bag(
    private var amount: Long,
    private var invitation: Invitation?
) {
    var ticket: Ticket? = null
    constructor(amount: Long) : this(amount, null)

    fun hasInvitation(): Boolean {
        return invitation != null
    }

    fun hasTicket(): Boolean {
        return ticket != null
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount;
    }

    fun plusAmount(amount: Long) {
        this.amount += amount;
    }
}
