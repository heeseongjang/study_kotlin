// 3-10에서 작성한 factorial 함수를 함수형 프로그래밍에 적합한 방식으로 개선해 보라.

fun main(args: Array<String>) {
    println(replicate3(3))
}

fun replicate3(n: Int): Int = factorial3_(n, 1)

tailrec fun factorial3_(n: Int, m: Int): Int = when {
    n == 1 -> m
    else -> {
        factorial3_(n - 1, n * m)
    }
}