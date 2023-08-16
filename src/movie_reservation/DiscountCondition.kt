package movie_reservation

interface DiscountCondition {
    fun isSatisfiedBy(screening: Screening): Boolean
}
