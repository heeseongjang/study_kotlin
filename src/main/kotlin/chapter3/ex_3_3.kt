// 입력 n의 팩터리얼(Factorial)인 n!을 구하는 함수를 재귀로 구현해 보자.
fun main(args: Array<String>) {
    println(factorial(4))
}

fun factorial(n: Int): Int = when (n) {
    1 -> n
    else -> n * factorial(n - 1)
}