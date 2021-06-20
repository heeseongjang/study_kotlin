// X의 n승을 구하는 함수를 재귀로 구현해 보자.
fun main(args: Array<String>) {
    println(power(3.0, 3))
}

fun power(x: Double, n: Int): Double = when (n) {
    1 -> x
    else -> x * power(x, n - 1)
}