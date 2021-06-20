import kotlin.math.sqrt

//  trampoline 함수를 사용허요 연습문제 3-17의 함수를 다시 작성해 보자.
sealed class Bounce<A>
data class Done<A>(val result: A) : Bounce<A>()
data class More<A>(val thunk: () -> Bounce<A>) : Bounce<A>()

tailrec fun <A> trampoline(bounce: Bounce<A>): A = when (bounce) {
    is Done -> bounce.result
    is More -> trampoline((bounce.thunk()));
}

fun main(args: Array<String>) {
    println(trampoline(power4(3.0)))
}

fun power4(num: Double): Bounce<Double> = when {
    num < 1 -> Done(num)
    else -> More { power4_(sqrt(num) / 2) }
}

fun power4_(num: Double): Bounce<Double> = when {
    num < 1 -> Done(num)
    else -> More { power4(sqrt(num) / 2) }
}
