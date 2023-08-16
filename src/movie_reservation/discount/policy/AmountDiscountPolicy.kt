package movie_reservation.discount.policy

import movie_reservation.Money
import movie_reservation.Screening
import movie_reservation.discount.condition.DiscountCondition

class AmountDiscountPolicy(
    private var discountAmount: Money,
    vararg conditions: DiscountCondition
) : DiscountPolicy(*conditions) {
    override fun getDiscountAmount(screening: Screening): Money {
        return discountAmount
    }
}
