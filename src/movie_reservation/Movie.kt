package movie_reservation

import java.time.Duration

class Movie(
    private var title: String,
    private var runningTime: Duration,
    private var fee: Money,
    private var discountPolicy: DiscountPolicy
) {
    fun calculateMovieFee(screening: Screening): Money {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening))
    }
}
