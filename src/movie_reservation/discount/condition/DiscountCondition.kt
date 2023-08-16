package movie_reservation.discount.condition

import movie_reservation.Screening

interface DiscountCondition {
    fun isSatisfiedBy(screening: Screening): Boolean
}
