//trampoline 함수를 사용하여 연습문제 3-12의 factorical 함수를 다시 작성해보자. 100000! 값은 얼마인가?
fun main(args: Array<String>) {
    println(trampoline(replicate3(100000,1)))
}

tailrec fun replicate3(n: Int, m: Int = 1): Bounce<Int> = when {
    n == 1 -> Done(m)
    else -> More { replicate3(n - 1, n * m) }
}