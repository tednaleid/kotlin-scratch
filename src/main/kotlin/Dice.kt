import kotlin.math.max
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

object DiceRoller {
    fun roll(sides: Int = 6): Int {
        return nextInt(1, sides+1)
    }

    fun rollMultiple(n: Int, sides: Int = 6): Int {
        var acc = 0
        repeat(n) {
            acc += roll(sides)
        }
        return acc
    }

    fun rollWithAdvantage(sides: Int): Int {
        return max(roll(sides), roll(sides))
    }
}

data class Dice(val color: String, val sides: Int, val price: Int)

val availableDice = List(100) {
    Dice(
        listOf("red", "green", "blue", "turquoise", "purple").random(),
        listOf(4, 6, 8, 10, 12, 20).random(),
        Random.nextInt(10, 500)
    )
}