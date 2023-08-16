package movie_reservation

import java.time.LocalDateTime

class Screening(
    private var movie: Movie,
    private var sequence: Int,
    private var whenScreened: LocalDateTime
) {
    fun getStartTime(): LocalDateTime {
        return whenScreened
    }

    fun isSequence(sequence: Int): Boolean {
        return this.sequence == sequence
    }

    fun getMovieFee(): Money {
        return movie.fee
    }
}
