package movie_reservation

import java.math.BigDecimal

class Money(
    private val amount: BigDecimal) {

    companion object {
        val ZERO: Money = wons(0)

        fun wons(amount: Long): Money {
            return Money(BigDecimal.valueOf(amount))
        }

        fun wons(amount: Double): Money {
            return Money(BigDecimal.valueOf(amount))
        }
    }

    fun plus(amount: Money): Money {
        return Money(this.amount.add(amount.amount))
    }

    fun minus(amount: Money): Money {
        return Money(this.amount.minus(amount.amount))
    }

    fun times(percent: Double): Money {
        return Money(this.amount.multiply(BigDecimal.valueOf(percent)))
    }

    fun isLessThan(other: Money): Boolean {
        return amount.compareTo(other.amount) < 0
    }

    fun isGraterThenOrEqual(other: Money): Boolean {
        return amount.compareTo(other.amount) >= 0
    }
}
