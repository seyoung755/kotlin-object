package movie_reservation.discount.condition

import movie_reservation.Screening

class SequenceCondition(
    private var sequence: Int
): DiscountCondition {
    override fun isSatisfiedBy(screening: Screening): Boolean {
        return screening.isSequence(sequence)
    }
}
