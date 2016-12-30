/**
 * Created by victor on 29/12/16.
 */
class FizzBuzz {

    fun convert(values: IntRange): List<Any> {
        return values.map { x -> convert(x) }
    }

    fun convert(value: Int): Any {
        val multipleOfThree = value.multipleOf(3)
        val multipleOfFive = value.multipleOf(5)
        return when {
            multipleOfThree && multipleOfFive -> "FizzBuzz"
            multipleOfThree -> "Fizz"
            multipleOfFive -> "Buzz"
            else -> value

        }
    }
}

fun Int.multipleOf(value: Int): Boolean {
    return when {
        mod(value) == 0 -> true
        mod(value) > this -> multipleOf(value)
        else -> false
    }
}