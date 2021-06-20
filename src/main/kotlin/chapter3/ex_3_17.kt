import kotlin.math.sqrt

//  입력값 n의 제곱근을 2로 나눈 값이 1보다 작을 때까지 반복하고,
//  최초의 1보다 작은 값을 반환하는 함수를 상호 재귀를 사용하여 구현하라. 이때 입력값 n은 2보다 크다.

fun main(args: Array<String>) {
    println(power3(3.0))
}

fun power3(num: Double): Double = when {
    num < 1 -> num
    else -> power3_(sqrt(num) / 2)
}

fun power3_(num: Double): Double = when {
    num < 1 -> num
    else -> power3(sqrt(num) / 2)
}