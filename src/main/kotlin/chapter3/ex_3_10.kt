// 연습문제 3-3에서 작성한 factorial 함수를 메모이제이션을 사용해서 개선해 보라.

var memo = Array(100, { -1 })
fun main(args: Array<String>) {
    println(factorial2(3))
}

fun factorial2(n: Int): Int = when {
    n == 1 -> n
    memo[n] != -1 -> memo[n]
    else -> {
        memo[n] = n * factorial2(n - 1)
        memo[n]
    }
}