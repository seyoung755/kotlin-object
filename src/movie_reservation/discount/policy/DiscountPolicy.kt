package movie_reservation.discount.policy

import movie_reservation.Money
import movie_reservation.Screening
import movie_reservation.discount.condition.DiscountCondition

abstract class DiscountPolicy(vararg conditions: DiscountCondition) {
    private var conditions: MutableList<DiscountCondition> = mutableListOf()

    init {
        this.conditions = conditions.toMutableList()
    }

    fun calculateDiscountAmount(screening: Screening): Money {
        for (discountCondition in conditions) {
            if (discountCondition.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening)
            }
        }

        return Money.ZERO
    }

    abstract protected fun getDiscountAmount(screening: Screening): Money
}
